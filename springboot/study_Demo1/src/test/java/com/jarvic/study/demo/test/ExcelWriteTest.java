package com.jarvic.study.demo.test;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.support.ExcelTypeEnum;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @CreateDate: 2020/4/18 16:32
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/4/18 16:32
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ExcelWriteTest {

    /**
     * 每行数据是List<String>无表头
     *
     * @throws IOException
     */
    @Test
    public void writeWithoutHead() throws IOException {
        try (OutputStream out = new FileOutputStream("withoutHead.xlsx");) {
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, false);
            Sheet sheet1 = new Sheet(1, 0);
            sheet1.setSheetName("sheet1");
            List<List<String>> data = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                List<String> item = new ArrayList<>();
                item.add("item0" + i);
                item.add("item1" + i);
                item.add("item2" + i);
                data.add(item);
            }
            /*
            * 表头设计
            *
            * */
            List<List<String>> head = new ArrayList<List<String>>();
            List<String> headCoulumn1 = new ArrayList<String>();
            List<String> headCoulumn2 = new ArrayList<String>();
            List<String> headCoulumn3 = new ArrayList<String>();
            headCoulumn1.add("第一列");
            headCoulumn2.add("第二列");
            headCoulumn3.add("第三列");
            head.add(headCoulumn1);
            head.add(headCoulumn2);
            head.add(headCoulumn3);
            Table table = new Table(1);
            table.setHead(head);
            writer.write0(data, sheet1,table);
            writer.finish();
        }
    }


    @Test
    public void writeWithoutHead2() throws IOException {
        try (OutputStream out = new FileOutputStream("withHead2.xlsx");) {
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
            Sheet sheet1 = new Sheet(1, 0);
            sheet1.setSheetName("sheet1");
            List<List<String>> data = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                List<String> item = new ArrayList<>();
                item.add("item0" + i);
                item.add("item1" + i);
                item.add("item2" + i);
                data.add(item);
            }
            List<List<String>> head = new ArrayList<List<String>>();
            List<String> headCoulumn1 = new ArrayList<String>();
            List<String> headCoulumn2 = new ArrayList<String>();
            List<String> headCoulumn3 = new ArrayList<String>();
            headCoulumn1.add("第一列");
            headCoulumn2.add("第二列");
            headCoulumn3.add("第三列");
            head.add(headCoulumn1);
            head.add(headCoulumn2);
            head.add(headCoulumn3);
            Table table = new Table(1);
            table.setHead(head);
            writer.write0(data, sheet1, table);
            writer.finish();
        }
    }

    @Test
    public void writeWithHead() throws IOException {
        try (OutputStream out = new FileOutputStream("withHead.xlsx");) {
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
            Sheet sheet1 = new Sheet(1, 0, ExcelPropertyIndexModel.class);
            sheet1.setSheetName("sheet1");
            List<ExcelPropertyIndexModel> data = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                ExcelPropertyIndexModel item = new ExcelPropertyIndexModel();
                item.name = "name" + i;
                item.age = "age" + i;
                item.email = "email" + i;
                item.address = "address" + i;
                item.sax = "sax" + i;
                item.heigh = "heigh" + i;
                item.last = "last" + i;
                data.add(item);
            }
            writer.write(data, sheet1);
            writer.finish();
        }
    }

    public static class ExcelPropertyIndexModel extends BaseRowModel {

        @ExcelProperty(value = "姓名", index = 0)
        private String name;

        @ExcelProperty(value = "年龄", index = 1)
        private String age;

        @ExcelProperty(value = "邮箱", index = 2)
        private String email;

        @ExcelProperty(value = "地址", index = 3)
        private String address;

        @ExcelProperty(value = "性别", index = 4)
        private String sax;

        @ExcelProperty(value = "高度", index = 5)
        private String heigh;

        @ExcelProperty(value = "备注", index = 6)
        private String last;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getSax() {
            return sax;
        }

        public void setSax(String sax) {
            this.sax = sax;
        }

        public String getHeigh() {
            return heigh;
        }

        public void setHeigh(String heigh) {
            this.heigh = heigh;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }
    }

    @Test
    public void writeWithMultiHead() throws IOException {
        try (OutputStream out = new FileOutputStream("withMultiHead.xlsx");) {
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
            Sheet sheet1 = new Sheet(1, 0, MultiLineHeadExcelModel.class);
            sheet1.setSheetName("sheet1");
            List<MultiLineHeadExcelModel> data = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                MultiLineHeadExcelModel item = new MultiLineHeadExcelModel();
                item.p1 = "p1" + i;
                item.p2 = "p2" + i;
                item.p3 = "p3" + i;
                item.p4 = "p4" + i;
                item.p5 = "p5" + i;
                item.p6 = "p6" + i;
                item.p7 = "p7" + i;
                item.p8 = "p8" + i;
                item.p9 = "p9" + i;
                data.add(item);
            }
            writer.write(data, sheet1);
            writer.finish();
        }
    }

    public static class MultiLineHeadExcelModel extends BaseRowModel {

        @ExcelProperty(value = { "表头1", "表头1", "表头31" }, index = 0)
        private String p1;

        @ExcelProperty(value = { "表头1", "表头1", "表头32" }, index = 1)
        private String p2;

        @ExcelProperty(value = { "表头3", "表头3", "表头3" }, index = 2)
        private String p3;

        @ExcelProperty(value = { "表头4", "表头4", "表头4" }, index = 3)
        private String p4;

        @ExcelProperty(value = { "表头5", "表头51", "表头52" }, index = 4)
        private String p5;

        @ExcelProperty(value = { "表头6", "表头61", "表头611" }, index = 5)
        private String p6;

        @ExcelProperty(value = { "表头6", "表头61", "表头612" }, index = 6)
        private String p7;

        @ExcelProperty(value = { "表头6", "表头62", "表头621" }, index = 7)
        private String p8;

        @ExcelProperty(value = { "表头6", "表头62", "表头622" }, index = 8)
        private String p9;

        public String getP1() {
            return p1;
        }

        public void setP1(String p1) {
            this.p1 = p1;
        }

        public String getP2() {
            return p2;
        }

        public void setP2(String p2) {
            this.p2 = p2;
        }

        public String getP3() {
            return p3;
        }

        public void setP3(String p3) {
            this.p3 = p3;
        }

        public String getP4() {
            return p4;
        }

        public void setP4(String p4) {
            this.p4 = p4;
        }

        public String getP5() {
            return p5;
        }

        public void setP5(String p5) {
            this.p5 = p5;
        }

        public String getP6() {
            return p6;
        }

        public void setP6(String p6) {
            this.p6 = p6;
        }

        public String getP7() {
            return p7;
        }

        public void setP7(String p7) {
            this.p7 = p7;
        }

        public String getP8() {
            return p8;
        }

        public void setP8(String p8) {
            this.p8 = p8;
        }

        public String getP9() {
            return p9;
        }

        public void setP9(String p9) {
            this.p9 = p9;
        }
    }


}
