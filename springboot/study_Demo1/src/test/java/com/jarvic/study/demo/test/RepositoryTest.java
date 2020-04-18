package com.jarvic.study.demo.test;

import com.jarvis.study.demo.App;
import com.jarvis.study.demo.controller.HelloController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @CreateDate: 2020/3/31 15:17
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/3/31 15:17
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class RepositoryTest {

    @Autowired
    HelloController helloController;
    @Value("${server.port}")
    private String port;
    @Value("${server.context-path}")
    private String contextPath;
    private String getBasePath() {
        return "http://localhost" + contextPath;
    }
    private TestRestTemplate restTemplate = new TestRestTemplate();
    @Test
    public void testFindStudent() throws Exception {
        Assert.assertNotNull(helloController.hello());
    }
    //@Test
   /* public void testFindByName() {
        ResponseEntity<Student> resp =
                restTemplate.getForEntity(getBasePath() + "students/{name}", Student.class, "yinjihuan");
        Student student = resp.getBody();
        assertEquals("yinjihuan", student.getName());
    }*/
}
