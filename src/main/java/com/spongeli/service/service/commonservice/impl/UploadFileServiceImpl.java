package com.spongeli.service.service.commonservice.impl;

import com.spongeli.service.common.cont.SystemConstant;
import com.spongeli.service.common.exception.SystemException;
import com.spongeli.service.common.system.BaseService;
import com.spongeli.service.service.commonservice.UploadFileService;
import net.coobird.thumbnailator.Thumbnails;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Service
public class UploadFileServiceImpl extends BaseService implements UploadFileService {

//        private static String filePath = "/usr/local/soft/nginx/html/upload/";
    private static String filePath = "/upload/";
//    private static String filePath = "D:\\softwore\\nginx\\nginx-1.14.2\\html\\upload\\";
//    private static String filePath = "D:\\software\\nginx-1.17.1\\html\\upload\\";
//    private static String imgPath = "http://127.0.0.1:9000/upload/";

    @Override
    public String uploadImg(Boolean compress, MultipartFile file) {
        InputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = file.getInputStream();
//            FtpFileUtil.uploadFile(file.getOriginalFilename(),inputStream);

            // 上传
            String originalFilename = file.getOriginalFilename();
            String substring = originalFilename.substring(originalFilename.lastIndexOf("."));
            String fileName = UUID.randomUUID().toString() + substring;

            //            对图片进行压缩 和加水印
            String destPath = filePath + fileName;
            if (compress) {
                // 进行压缩
                Thumbnails.of(inputStream).size(2560, 2048).toFile(destPath);
            } else {
                outputStream = new FileOutputStream(new File(destPath));
                byte[] arr = new byte[1024];
                int len;
                while ((len = inputStream.read(arr)) > 0) {
                    outputStream.write(arr, 0, len);
                }
            }
            return SystemConstant.IMG_URL + fileName;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SystemException("上传文件【" + file.getOriginalFilename() + "】失败!");
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e) {
                }
            }
        }
    }
}
