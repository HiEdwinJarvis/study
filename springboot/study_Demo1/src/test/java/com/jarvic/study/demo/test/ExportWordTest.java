package com.jarvic.study.demo.test;

import com.jarvis.study.demo.service.WordAction;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description:
 * @CreateDate: 2020/4/18 19:17
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/4/18 19:17
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ExportWordTest {


    @Test
    public void exportWord(){

        WordAction wordAction = new WordAction();
        wordAction.createWord();


    }
}
