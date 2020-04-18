package com.jarvis.study.demo.service;

/**
 * @Description:
 * @CreateDate: 2020/3/31 15:02
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/3/31 15:02
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

import com.jarvis.study.demo.bean.Student;

import java.util.List;

public interface StudentService {
    List<Student> queryStudents();
}
