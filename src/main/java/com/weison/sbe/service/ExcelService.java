package com.weison.sbe.service;

import com.alibaba.excel.EasyExcel;
import com.weison.sbe.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ExcelService {

    public List<User> handler(MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            return Collections.emptyList();
        }
        InputStream inputStream = file.getInputStream();
        EasyExcel.read(inputStream, User.class, new UserDataListener()).sheet().doRead();
        return Collections.emptyList();
    }

    public List<List<String>> setHear() {
        List<List<String>> head = new ArrayList<>();
        List<String> sheet1Head = new ArrayList<>();
        sheet1Head.add("姓名");
        sheet1Head.add("年龄");
        sheet1Head.add("城市");

        List<String> sheet2Head = new ArrayList<>();
        sheet2Head.add("姓名");
        sheet2Head.add("年龄");
        sheet2Head.add("城市");
        sheet1Head.addAll(sheet2Head);
        head.add(sheet1Head);
        head.add(sheet2Head);
        return head;
    }

}
