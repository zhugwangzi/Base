import java.io.*;

public class Employee2 {
	//定义静态私有变量salary
	private static double salary;
	//定义静态常量DEPARTMENT
	public static final String DEPARTMENT="开发人员";
	
	public static void main(String[] args) {
		salary=10000;
		System.out.println(DEPARTMENT+"月薪"+salary+"元");
	}
}
