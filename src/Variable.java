public class Variable {
	public String instance="实例变量";
	public static String variable="静态变量";
	public static String CONST="静态常量";
	
	public static void main(String[] args) {
		String local="局部变量";//局部变量不可以用访问修饰符，也没有默认初始值
		System.out.println(local);//直接打印局部变量
		
		Global global=new Global();//实例变量global
		System.out.println(global.instance);//需要创建对象再访问实例变量，不能直接用instance
		
		System.out.println(variable);//直接打印静态变量
		System.out.println(Global.variable);//静态变量也可用访问方法
	}
}

class Global{
	public String instance="实例变量";
	public static String variable="静态变量";
	
	Global(){
		System.out.println(instance);
		System.out.println(variable);
	}
	
	public void Instance() {
		System.out.println(instance);
		System.out.println(Variable.CONST);
	}
}
