package com.jarvic.study.demo.test;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;

import com.jarvis.study.demo.bean.ExcelPropertyIndexModel;
import com.jarvis.study.demo.service.ExcelModelListener;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Description:
 * @CreateDate: 2020/4/18 16:59
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/4/18 16:59
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ExcelReadTest {

    @Test
    public  void simpleRead1(){

        // 读取 excel 表格的路径
        String readPath = "E:\\study\\spring boot\\study_Demo1\\withHead.xlsx";

        try {
            Sheet sheet = new Sheet(1,1, ExcelPropertyIndexModel.class);
            EasyExcelFactory.readBySax(new FileInputStream(readPath),sheet,new ExcelModelListener());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}