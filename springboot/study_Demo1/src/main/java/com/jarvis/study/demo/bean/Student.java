package com.jarvis.study.demo.bean;

/**
 * @Description:
 * @CreateDate: 2020/3/31 15:03
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/3/31 15:03
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Student {
    private String id;
    private String name;
    public Student() {
        super();
    }
    public Student(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
