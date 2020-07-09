package com.weison.sbe.controller;

import com.weison.sbe.model.User;
import com.weison.sbe.service.ExcelService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@RestController
public class ExcelController {

    @Resource
    ExcelService excelService;

    @PostMapping("/users")
    public List<User> batchUpdateAccount(
            @RequestParam("file") MultipartFile file) throws IOException {
        return excelService.handler(file);
    }
}
