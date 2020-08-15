package com.spider.scrawl.provider.dao.mapper;

import com.spider.scrawl.provider.dao.entity.WordInfo;

public interface WordInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WordInfo record);

    int insertSelective(WordInfo record);

    WordInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WordInfo record);

    int updateByPrimaryKey(WordInfo record);
}