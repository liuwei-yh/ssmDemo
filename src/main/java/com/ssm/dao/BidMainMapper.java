package com.ssm.dao;

import com.ssm.entity.BidMain;

public interface BidMainMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BidMain record);

    int insertSelective(BidMain record);

    BidMain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BidMain record);

    int updateByPrimaryKey(BidMain record);
}