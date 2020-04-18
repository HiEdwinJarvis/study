package com.jarvic.study.demo.test;

import com.jarvis.study.demo.App;
import com.jarvis.study.demo.dao.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @CreateDate: 2020/4/1 11:44
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/4/1 11:44
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class ReadAndWriteTest {

    @Autowired
    private UserRepository repository;
    @Test
    public void save(){
        repository.save();
    }

    @Test
    public void read(){
        Long aLong = repository.queryCount();
        System.out.println("记录数"+aLong);

    }
}
