import java.io.*;

public class EmployeeTest {
	public static void main(String[] args) {
		//��ʼ����������
		Employee empOne=new Employee("RUNOOB1");
		Employee empTwo=new Employee("RUNOOB2");
		//����Employee.java�ķ�������ʼ��������������ӡ��Ϣ
		empOne.empAge(21);
		empOne.empDesignation("�������Ա");
		empOne.empSalary(6000);
		empOne.printlnEmp();
		
		empTwo.empAge(26);
		empTwo.empDesignation("�߼�����Ա");
		empTwo.empSalary(12000);
		empTwo.printlnEmp();
	}
}
