package com.example.demo.mapper;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Reimbursement;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReimbursementMapper {
    public List<Reimbursement> ListReimbursement();
}
