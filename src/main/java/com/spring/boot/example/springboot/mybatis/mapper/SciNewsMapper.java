package com.spring.boot.example.springboot.mybatis.mapper;

import com.spring.boot.example.springboot.mybatis.dao.SciNews;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SciNewsMapper {

    List<SciNews> getByTitle(String title);

    SciNews getById(Integer id);

    void insert(@Param("sciNews") SciNews sciNews);
}
