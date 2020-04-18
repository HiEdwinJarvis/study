package com.jarvic.study.demo.test;

import com.jarvis.study.demo.App;
import com.jarvis.study.demo.bean.Student;
import com.jarvis.study.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

/**
 * @Description:
 * @CreateDate: 2020/3/31 15:06
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/3/31 15:06
 * @UpdateRemark: 更新说明
 *
 *
 * 这只是对业务方法进行了测试
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class StudentServiceTest {
    @Autowired
    StudentService studentService;
    @Test
    public void testAddStudent() throws Exception {
        List<Student> students = studentService.queryStudents();

        for(Student student:students){
            System.out.println(student.getId()+" "+student.getName());
        }

    }
}
