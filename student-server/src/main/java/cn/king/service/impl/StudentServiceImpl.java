package cn.king.service.impl;

import cn.king.pojo.Student;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.github.pagehelper.PageInfo;
import jakarta.annotation.Resource;
import cn.king.mapper.StudentMapper;
import org.springframework.stereotype.Service;
import cn.king.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public PageInfo getAllUser(Student student) {
        List<Student> students = studentMapper.getStudentAll(student);
        PageInfo<Student> studentPageInfo = new PageInfo<>(students);
        return studentPageInfo;
    }

    @Override
    public boolean addStudent(Student student) {
        try {
            int insert = studentMapper.insert(student);
            return insert > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteStudent(Integer id) {
        try {
            studentMapper.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean updateStudent(Student student) {
        try {
            studentMapper.updateById(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
