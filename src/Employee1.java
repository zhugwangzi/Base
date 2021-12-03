
public class Employee1 {
	public String name;
	private  double salary;
	//构造方法，赋值name
	public Employee1(String empName) {
		name=empName;
	}
	//赋值salary的方法
	public void setSalary(double empSalary) {
		salary=empSalary;
	}
	//打印信息的方法
	public void printEmp() {
		System.out.println("姓名："+name);
		System.out.println("月薪："+salary+"元");
	}
	
	public static void main(String[] args) {
		Employee1 emp=new Employee1("RUNOOB");
		emp.setSalary(10000);
		emp.printEmp();
	}
}
