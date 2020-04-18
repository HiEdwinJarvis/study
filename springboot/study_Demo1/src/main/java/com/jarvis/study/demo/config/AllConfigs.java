package com.jarvis.study.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description:
 * @CreateDate: 2020/3/31 15:27
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/3/31 15:27
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

/*
* 读取xml文件
* */
@Configuration
@ImportResource(locations={"classpath:testLoadXml.xml"})
public class AllConfigs {
}
