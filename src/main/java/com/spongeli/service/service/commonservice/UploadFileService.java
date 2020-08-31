package com.spongeli.service.service.commonservice;

import org.springframework.web.multipart.MultipartFile;

public interface UploadFileService {
    String uploadImg(Boolean compress, MultipartFile file);
}
