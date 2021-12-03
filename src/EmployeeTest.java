import java.io.*;

public class EmployeeTest {
	public static void main(String[] args) {
		//初始化两个对象
		Employee empOne=new Employee("RUNOOB1");
		Employee empTwo=new Employee("RUNOOB2");
		//调用Employee.java的方法，初始化三个变量并打印信息
		empOne.empAge(21);
		empOne.empDesignation("菜鸟程序员");
		empOne.empSalary(6000);
		empOne.printlnEmp();
		
		empTwo.empAge(26);
		empTwo.empDesignation("高级程序员");
		empTwo.empSalary(12000);
		empTwo.printlnEmp();
	}
}
