package com.xyz.springboot.thymeleafdemo.controller;

import com.xyz.springboot.thymeleafdemo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private List<Employee> employeeList;

    @PostConstruct
    public void loadData(){
        employeeList = new ArrayList<>();

        employeeList.add(new Employee(1,"Alan","walker","alanwalker@join.com"));
        employeeList.add(new Employee(2,"martin","garrix","martingarrix@stmpd.com"));
        employeeList.add(new Employee(3,"Rod","Johnson","rod.johnson@gmail.com"));
    }

    @GetMapping("/list")
    public String listEmployees(Model model){
        model.addAttribute("employees",employeeList);
        return "list-employees";
    }
}
