package com.weison.sbe.service;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.metadata.CellExtra;
import com.alibaba.excel.read.listener.ReadListener;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

public class UploadDataListener implements ReadListener {
    @Override
    public void onException(Exception exception, AnalysisContext context) throws Exception {
        System.out.println();
    }

    @Override
    public void invoke(Object data, AnalysisContext context) {
        System.out.println();
    }

    @Override
    public void extra(CellExtra extra, AnalysisContext context) {
        System.out.println();
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        System.out.println();
    }

    @Override
    public boolean hasNext(AnalysisContext context) {
        return false;
    }

    @Override
    public void invokeHead(Map headMap, AnalysisContext context) {
        System.out.println();
    }
}
