package com.jarvis.study.demo.controller;

import com.jarvis.study.demo.bean.*;
import com.jarvis.study.demo.service.StudentService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Description:
 * @CreateDate: 2020/3/31 17:01
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/3/31 17:01
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
@RequestMapping(value="/users")     // 通过这里配置使下面的映射都在/users下，可去除
public class UserController {

    static Map<Long, Student> users = Collections.synchronizedMap(new HashMap<Long, Student>());

    @Autowired
    private StudentService studentService;
    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value={""}, method= RequestMethod.GET)
    public List<Student> getUserList() {
        List<Student> r = new ArrayList<Student>();
        List<Student> students = studentService.queryStudents();

        return students;
    }

    /*@ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value="", method=RequestMethod.POST)
    public String postUser(@RequestBody Student user) {
        users.put(user.getId(), user);
        return "success";
    }*/

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Student getUser(@PathVariable Long id) {
        return users.get(id);
    }

 /*   @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })*/
   /* @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putUser(@PathVariable Long id, @RequestBody User user) {
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }
*/
    @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }

    @RequestMapping("/students")
    Object queryStudents() throws GlobalException {
        return ResponseData.ok(studentService.queryStudents());
    }

    @RequestMapping("/students/{name}")
    Object queryStudentByName(@PathVariable String name) throws Exception {
        if(name.equals("1")){
            throw new ParamException("参数错误");
        }
        if(name.equals("2")){
            throw new ServerException("内部错误");
        }
        return ResponseData.ok(studentService.queryStudents());
    }
}
