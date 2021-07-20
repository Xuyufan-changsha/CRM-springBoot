package com.example.demo.mapper;

import com.example.demo.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    public List<Admin> findAdminByName(String name);

    public List<Admin> ListAdmin();

    public List<Admin> queryPage(Integer startRows);

    public int getRowCount();

    public int insertAdmin(Admin admin);

    public int delete(int id);

    public int Update(Admin admin);

    public List<Admin> login(Admin admin);
}
