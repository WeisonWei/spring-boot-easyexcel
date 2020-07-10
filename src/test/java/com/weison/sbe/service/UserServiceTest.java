package com.weison.sbe.service;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.weison.sbe.model.User;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    public void read(){
        ExcelReaderBuilder read = EasyExcel.read("./user.xls", User.class, new UserDataListener());
        read.sheet().doRead();

        ExcelReaderBuilder read1 = EasyExcel.read("./user.xlsx", User.class, new UserDataListener());
        read1.sheet().doRead();
    }
}
