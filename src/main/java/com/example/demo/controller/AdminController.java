package com.example.demo.controller;

import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ControllerAdvice
public class AdminController {
    @Autowired
    private AdminService adminService;

//    @ExceptionHandler(value = Exception.class)
//    @ResponseBody
//    public String exceptionHandler(Exception e){
//        System.out.println("异常处理");
//        return "服务器错误,请联系管理员";
//    }

    @RequestMapping(value = "/deleteAdmin", method = RequestMethod.POST)
    public Integer delete(Integer id) {
        int result = adminService.delete(id);
        return result;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public List<Admin>  login(String passWord,String adminName) {
        Admin admin = new Admin();
        admin.setName(adminName);
        admin.setPassword(passWord);
        List<Admin> result = adminService.login(admin);
//        if (result.size() >= 1) {
//            return "登录成功";
//        } else {
//            return "登录失败";
//        }
        return result;

    }

    @RequestMapping(value = "/updateAdmin", method = RequestMethod.POST)
    @ResponseBody
    public String update(Admin admin) {
        int result = adminService.Update(admin);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }

    }

    @RequestMapping(value = "/insertAdmin", method = RequestMethod.POST)
    public Integer insert(Admin admin) {
        return adminService.insertAdmin(admin);
    }

    @RequestMapping("/ListAdmin")
    @ResponseBody
    public List<Admin> ListUser() {
        return adminService.ListAdmin();
    }

    @RequestMapping("/ListByNameAdmin")
    @ResponseBody
    public boolean ListByNameAdmin(String name) {
        List<Admin> list = adminService.findAdminByName(name);
        if(list.size()>0){
            return  false;
        }else {
            return true;
        }

    }

    /**
     * 分页
     * @return
     */
    @RequestMapping(value="/pageAdmin")
    @ResponseBody
    public List<Admin> page(Integer page){
        int pageNow = page == null ? 1 : page;
        int pageSize = 5;
        int startRows = pageSize*(pageNow-1);
        List<Admin> list = adminService.queryPage(startRows);
        return list;
    }

    /**
     * rows
     * @return
     */
    @RequestMapping(value="/rowsAdmin")
    @ResponseBody
    public int rows(){
        return adminService.getRowCount();
    }
}
