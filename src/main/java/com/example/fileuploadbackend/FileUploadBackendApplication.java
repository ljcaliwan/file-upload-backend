package com.example.fileuploadbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@SpringBootApplication
public class FileUploadBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileUploadBackendApplication.class, args);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file")MultipartFile multipartFile) {
        return String.format("File %s uploaded successfully", multipartFile.getOriginalFilename());
    }

}
