package com.lxh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lxh.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BookDao extends BaseMapper<Book> {

}
