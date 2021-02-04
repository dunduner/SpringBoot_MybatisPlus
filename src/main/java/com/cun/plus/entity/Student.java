package com.cun.plus.entity;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "student")
public class Student {
    @TableId(value = "Id",type = IdType.AUTO)
    private int id;
    @TableField(value = "SName",exist = true)
    private String name;
    @TableField(value = "Age")
    private int age;
    @TableField(value = "ClassId")
    private int classId;
    @TableField(exist = false)
    private StudentClass studentClass;
}