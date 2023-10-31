package cn.king.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 用于处理图片的上传访问
 */
@Slf4j
@RestController
@RequestMapping("/images")
public class CommonsController {
    @Value("$spring.path")
    private String path;

    @PostMapping("upload")
    public String upload(MultipartFile file) throws IOException {
        log.info("文件上传: {}",file);
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdir();
        }
        String filename = file.getOriginalFilename();
        String name = UUID.randomUUID().toString() + filename.substring(filename.lastIndexOf("."));

        file.transferTo(new File(path + name));
        return "http://localhost:8084/images/" + name;
    }
}
