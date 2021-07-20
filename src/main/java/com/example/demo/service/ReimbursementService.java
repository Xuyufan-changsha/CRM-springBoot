package com.example.demo.service;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Reimbursement;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.mapper.ReimbursementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReimbursementService {
    @Autowired
    private ReimbursementMapper reimbursementMapper;

    public List<Reimbursement> ListReimbursement(){
        return reimbursementMapper.ListReimbursement();
    }

}
