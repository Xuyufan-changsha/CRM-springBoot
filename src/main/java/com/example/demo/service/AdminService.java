package com.example.demo.service;

import com.example.demo.entity.Admin;
import com.example.demo.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public List<Admin> findAdminByName(String name){
        return adminMapper.findAdminByName(name);
    }

    public List<Admin> ListAdmin(){
        return adminMapper.ListAdmin();
    }

    public List<Admin> queryPage(Integer startRows){
        return adminMapper.queryPage(startRows);
    }

    public int getRowCount(){
        return adminMapper.getRowCount();
    }

    public int insertAdmin(Admin admin){
        return adminMapper.insertAdmin(admin);
    }

    public int delete(int id){
        return adminMapper.delete(id);
    }


    public int Update(Admin admin){
        return adminMapper.Update(admin);
    }

    public List<Admin> login(Admin admin){
        return adminMapper.login(admin);
    }

}
