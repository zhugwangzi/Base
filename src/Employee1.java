
public class Employee1 {
	public String name;
	private  double salary;
	//���췽������ֵname
	public Employee1(String empName) {
		name=empName;
	}
	//��ֵsalary�ķ���
	public void setSalary(double empSalary) {
		salary=empSalary;
	}
	//��ӡ��Ϣ�ķ���
	public void printEmp() {
		System.out.println("������"+name);
		System.out.println("��н��"+salary+"Ԫ");
	}
	
	public static void main(String[] args) {
		Employee1 emp=new Employee1("RUNOOB");
		emp.setSalary(10000);
		emp.printEmp();
	}
}
