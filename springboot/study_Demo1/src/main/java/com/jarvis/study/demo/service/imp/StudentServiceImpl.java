package com.jarvis.study.demo.service.imp;

import com.jarvis.study.demo.bean.Student;
import com.jarvis.study.demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @CreateDate: 2020/3/31 15:04
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/3/31 15:04
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> queryStudents() {
        Student student = new Student();
        student.setId("2016033");
        student.setName("张三");
        List<Student> list = new ArrayList<>();
        list.add(student);
        return list;
    }
}
