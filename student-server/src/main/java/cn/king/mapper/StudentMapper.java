package cn.king.mapper;

import cn.king.pojo.Student;
import cn.king.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface StudentMapper extends BaseMapper<Student> {
    List<Student> getStudentAll(Student student);
}
