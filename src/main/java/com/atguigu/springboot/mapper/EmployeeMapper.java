package com.atguigu.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.atguigu.springboot.bean.Employee;

//@Mapper//或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
