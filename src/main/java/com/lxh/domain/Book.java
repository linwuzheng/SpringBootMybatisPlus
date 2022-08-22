package com.lxh.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_book")
public class Book {
    @TableId(type=IdType.AUTO)
    private Integer id;
    private String type;
    private String name;
    private String description;


}
