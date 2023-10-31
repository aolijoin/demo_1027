package cn.king.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@TableName("tb_student")
public class Student {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String sex;
    private String address;
    private String img;
    private Date birthday;

    @TableField(exist = false)
    private Date startTime;
    @TableField(exist = false)
    private Date endTime;
}
