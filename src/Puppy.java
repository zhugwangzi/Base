public class Puppy{
	int puppyAge;
	public Puppy(String name) {
		System.out.println("С���ĵ������ǣ�"+name);
	}
	//��������
	public void setAge(int age) {
		puppyAge=age;
	}
	//��ӡ����
	public int getAge() {
		System.out.println("С��������Ϊ��"+puppyAge);
		return puppyAge;
	}
	
	public static void main(String[] args) {
		Puppy myPuppy=new Puppy("jerry");//�������󲢴�ӡ����
		myPuppy.setAge(2);							//���ó�Ա��������������
		myPuppy.getAge();							//���ó�Ա��������ӡ����
		System.out.println("����ֵ��"+myPuppy.puppyAge);//���ó�Ա��������ӡ����ֵ
	}
}