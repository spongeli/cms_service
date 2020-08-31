package com.spongeli.service.controller.commoncontroller;

import com.spongeli.service.common.system.BaseController;
import com.spongeli.service.common.system.CommonResponse;
import com.spongeli.service.service.commonservice.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description
 * @Author spongeli
 * @Date 2019/12/26 9:45
 **/
@RestController
@RequestMapping("/common/upload")
public class FileUploadController extends BaseController {
    @Autowired
    private UploadFileService service;

    /**
     * @param file 要上传的图片
     * @return
     */
    @RequestMapping("/img")
    @ResponseBody
    public CommonResponse upload(@RequestParam(defaultValue = "false") Boolean compress, MultipartFile file) {
        return instanceSuccess("url", service.uploadImg(compress, file));
    }
}
