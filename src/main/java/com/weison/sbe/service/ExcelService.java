package com.weison.sbe.service;

import com.alibaba.excel.EasyExcel;
import com.weison.sbe.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

@Service
public class ExcelService {

    public List<User> handler(MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            return Collections.emptyList();
        }
        InputStream inputStream = file.getInputStream();
        EasyExcel.read(inputStream, User.class, new UploadDataListener()).sheet().doRead();
        return Collections.emptyList();
    }

}
