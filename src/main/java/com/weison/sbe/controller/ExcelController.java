package com.weison.sbe.controller;

import com.weison.sbe.model.User;
import com.weison.sbe.service.ExcelService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@RestController()
@RequestMapping("/excel")
public class ExcelController {

    @Resource
    ExcelService excelService;

    @PostMapping("/users")
    public List<User> batchUpdateAccount(
            @RequestParam("file") MultipartFile file) throws IOException {
        return excelService.handler(file);
    }

    @GetMapping("/filter")
    public String filter() throws IOException {
        return "OK";
    }

    @GetMapping("/student")
    public String student() throws IOException {
        return "OK";
    }
}
