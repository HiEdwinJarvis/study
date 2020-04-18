package com.jarvis.study.demo.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Description:
 * @CreateDate: 2020/4/1 11:27
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/4/1 11:27
 * @UpdateRemark: 更新说明
 *
 * 创建主，从数据源
 * @Version: 1.0
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "database1")
    @Qualifier("database1")
    //指定数据源配置前缀
    @ConfigurationProperties(prefix = "spring.datasource.database1")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "database2")
    @Qualifier("database2")
    @Primary //在同样的DataSource中，首先使用被标注的DataSource
    @ConfigurationProperties(prefix = "spring.datasource.database2")
    public DataSource secondaryDataSource() {
        return DataSourceBuilder.create().build();
    }

}
