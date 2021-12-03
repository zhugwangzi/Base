import java.io.*;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	//Employee类的构造方法
	public Employee(String name) {
		this.name=name;
	}
	//设置年龄的方法
	public void empAge(int empAge) {
		age=empAge;
	}
	//设置职业的方法
	public void empDesignation(String empDesig) {
		designation=empDesig;
	}
	//设置薪水的方法
	public void empSalary(double empSalary) {
		salary=empSalary;
	}
	//打印信息的方法
	public void printlnEmp() {
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		System.out.println("职业："+designation);
		System.out.println("月薪："+salary+"元");
		System.out.println("\n");
	}
}