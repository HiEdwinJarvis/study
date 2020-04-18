package com.jarvic.study.demo.test;

import com.jarvis.study.demo.bean.ExcelPropertyIndexModel;
import com.jarvis.study.demo.utils.ExportExcel;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @CreateDate: 2020/4/18 17:23
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/4/18 17:23
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ExportExcelTest {

    @Test
    public void exportExcelTest(){
    //准备数据
    List<ExcelPropertyIndexModel> clsList=new ArrayList<ExcelPropertyIndexModel>();
		for(int i=0;i<3;i++) {
            ExcelPropertyIndexModel cls=new ExcelPropertyIndexModel();
            cls.setAddress("天水");

        clsList.add(cls);
    }

		new ExportExcel().export(clsList);
}

}
