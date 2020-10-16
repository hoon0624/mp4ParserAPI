package com.mp4Parser;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;

@RestController
public class ApiController {

    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTest() {
        return "{\"result\": \"ok\" }";
    }

    @RequestMapping(value = "/api/mp4Parser", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTest2(@RequestParam(value = "filePath") String filePath) throws IOException {
//        FileSystemResource file = new FileSystemResource(filePath);
//        if(file != null) {
//            return "{\"file name\":\"" + file.getFilename() + "\", \"length\":\"" + file.contentLength() +"\"}";
//        }
//        try {
//            FileInputStream testStream = new FileInputStream(file.getFile());
//            return "{\"result\":\"" + testStream.available() + "\"}";
//        } catch(Exception e) {
//            e.printStackTrace();
//            return "{\"result\": \"Error\", \"path\": \"" + filePath + "\"}";
//        }

        return "{\"result\": \"Error\", \"path\": \"" + filePath + "\"}";
    }

    @RequestMapping(value = "/api/upload", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public String upload(@RequestBody MultipartFile file) {
//        storageService.store(file);

        String type = file.getContentType();

        return type;
    }
}
