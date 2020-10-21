package com.mp4Parser;

import com.mp4Parser.model.*;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

@RestController
public class ApiController {

    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTest() {
        return "{\"result\": \"ok\" }";
        // return "test";
    }

    @RequestMapping(value = "/api/welcome", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTest3() {
        // return "{\"result\": \"ok\" }";
        return "welcome";
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
        try {
            String size = Long.toString(file.getSize());
            FileInputStream s = (FileInputStream) file.getInputStream();
            int x = s.available();
            byte[] b = new byte[4];
            s.read(b);
            Box n = new Box(s, 32, "ftyp");
            s.close();

            return "first 4 bytes : " + Arrays.toString(b) + "\nBox Type: " + n.getType();
        } catch(Exception e) {
            e.printStackTrace();
            return "ERROR: something went wrong";
        }
    }

    @RequestMapping(value = "/api/uploadParse", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public String uploadParse(@RequestParam("file") MultipartFile file) {
        try {
            String s = Long.toString(file.getSize());
            return "Test : working? " + s;
        } catch(Exception e) {
            e.printStackTrace();
            return "ERROR: " + e.toString();
        }
    }

    @RequestMapping(value = "/api/uploadTest", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public String upload(@RequestBody String file) {
        return "upload worked: " + file;
    }
}
