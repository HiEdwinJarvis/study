package com.jarvis.study.demo.utils;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.jarvis.study.demo.bean.ExcelPropertyIndexModel;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * @Description:
 * @CreateDate: 2020/4/18 17:19
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/4/18 17:19
 * @UpdateRemark: 更新说明
 *
 * 导出EXCEP
 * @Version: 1.0
 */
public class ExportExcel {

    public void export(List<ExcelPropertyIndexModel> clsList) {
        try(OutputStream out=new FileOutputStream("C:\\Users\\张琦\\Desktop\\exportCls.xlsx")) {
            ExcelWriter writer=new ExcelWriter(out, ExcelTypeEnum.XLSX);

            if(!clsList.isEmpty()) {

                 Sheet sheet=new Sheet(1,0,clsList.get(0).getClass());

                 sheet.setSheetName("导出班级测试");
                 writer.write(clsList, sheet);
                 }
                 writer.finish();

                 } catch (Exception e) {
                 e.printStackTrace();
                 }
                 }


}