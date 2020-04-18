package com.jarvis.study.demo.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @Description:
 * @CreateDate: 2020/4/1 11:41
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/4/1 11:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Component
public class UserDao {

    @Bean(name = "primaryJdbcTemplate")
    public JdbcTemplate primaryJdbcTemplate(@Qualifier("database1") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
    @Bean(name = "secondaryJdbcTemplate")
    public JdbcTemplate secondaryJdbcTemplate(@Qualifier("database2") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
