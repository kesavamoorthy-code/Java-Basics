package com.company.model;

public class Employee {
    String fname;
    String mname;
    String lname;
    String Accountid;
    int salary;

    public Employee() {
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAccountid() {
        return Accountid;
    }

    public void setAccountid(String accountid) {
        Accountid = accountid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fname='" + fname + '\'' +
                ", mname='" + mname + '\'' +
                ", lname='" + lname + '\'' +
                ", Accountid='" + Accountid + '\'' +
                ", salary=" + salary +
                '}';
    }
}
