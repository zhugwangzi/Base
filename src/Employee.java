import java.io.*;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	//Employee��Ĺ��췽��
	public Employee(String name) {
		this.name=name;
	}
	//��������ķ���
	public void empAge(int empAge) {
		age=empAge;
	}
	//����ְҵ�ķ���
	public void empDesignation(String empDesig) {
		designation=empDesig;
	}
	//����нˮ�ķ���
	public void empSalary(double empSalary) {
		salary=empSalary;
	}
	//��ӡ��Ϣ�ķ���
	public void printlnEmp() {
		System.out.println("������"+name);
		System.out.println("���䣺"+age);
		System.out.println("ְҵ��"+designation);
		System.out.println("��н��"+salary+"Ԫ");
		System.out.println("\n");
	}
}