package com.study.collection;

import java.util.List;

public class PracticeOne {

}

/**
 * 部门类
 */
class Dept{
    private int deptNo;//部门编号
    private  String deptName;//部门名称
    private String location;//位置
    private List<Employee> employees;//雇员

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

/**
 * 雇员类
 */
class Employee{
    private  int employeeNo; //雇员编号
    private String name;//姓名
    private  String postion;//职位
    private int leaderNo;//领导
    private double basePay;//基本工资
    private  double commission;//佣金
    private Dept dept; //部门

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public int getLeaderNo() {
        return leaderNo;
    }

    public void setLeaderNo(int leaderNo) {
        this.leaderNo = leaderNo;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }



}