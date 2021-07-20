package com.example.demo.controller;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Reimbursement;
import com.example.demo.service.ReimbursementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ControllerAdvice
public class ReimbursementController {
    @Autowired
    private ReimbursementService reimbursementService;

    @RequestMapping("/ListReimbursement")
    @ResponseBody
    public List ListUser() {
        List result =  reimbursementService.ListReimbursement();
        for(int i = 0 ; i < result.size() ; i++) {
            result.get(i);
            System.out.println("这是："+);
        }
        return reimbursementService.ListReimbursement();
    }
}
