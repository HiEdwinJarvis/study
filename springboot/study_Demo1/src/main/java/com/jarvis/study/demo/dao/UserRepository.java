package com.jarvis.study.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @CreateDate: 2020/4/1 11:45
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/4/1 11:45
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Repository
public class UserRepository {
    @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate primaryJdbcTemplate;
    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate secondaryJdbcTemplate;
    public void save() {
        primaryJdbcTemplate.execute("insert into users(id) values(4343)");
    }
    public Long queryCount() {
        return secondaryJdbcTemplate.queryForObject("select count(*) from users", Long.class);
    }
}
