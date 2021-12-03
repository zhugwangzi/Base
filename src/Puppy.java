public class Puppy{
	int puppyAge;
	public Puppy(String name) {
		System.out.println("小狗的的名字是："+name);
	}
	//设置年龄
	public void setAge(int age) {
		puppyAge=age;
	}
	//打印年龄
	public int getAge() {
		System.out.println("小狗的年龄为："+puppyAge);
		return puppyAge;
	}
	
	public static void main(String[] args) {
		Puppy myPuppy=new Puppy("jerry");//创建对象并打印名字
		myPuppy.setAge(2);							//调用成员变量，设置年龄
		myPuppy.getAge();							//调用成员方法，打印年龄
		System.out.println("变量值："+myPuppy.puppyAge);//调用成员变量，打印变量值
	}
}