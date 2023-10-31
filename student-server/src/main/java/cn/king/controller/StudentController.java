package cn.king.controller;

import cn.king.pojo.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import cn.king.service.StudentService;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;
    @Value("${spring.path}")
    private String path;

    @PostMapping("/getStudentAll")
    public PageInfo getAllUSer(Integer pageNum, Integer pageSize, @RequestBody Student student) {
        log.info("请求进来了", pageNum, pageSize, student);
        PageHelper.startPage(pageNum, pageSize);
        System.out.println("请求进来了" + student.toString());
        return studentService.getAllUser(student);
    }

    @PostMapping("/addStudent")
    public boolean addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @RequestMapping("/deleteStudent")
    public boolean deleteStudent(Integer id) {
        return studentService.deleteStudent(id);
    }

    @PostMapping("/updateStudent")
    public boolean updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }



}
