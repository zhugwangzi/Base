public class Variable {
	public String instance="ʵ������";
	public static String variable="��̬����";
	public static String CONST="��̬����";
	
	public static void main(String[] args) {
		String local="�ֲ�����";//�ֲ������������÷������η���Ҳû��Ĭ�ϳ�ʼֵ
		System.out.println(local);//ֱ�Ӵ�ӡ�ֲ�����
		
		Global global=new Global();//ʵ������global
		System.out.println(global.instance);//��Ҫ���������ٷ���ʵ������������ֱ����instance
		
		System.out.println(variable);//ֱ�Ӵ�ӡ��̬����
		System.out.println(Global.variable);//��̬����Ҳ���÷��ʷ���
	}
}

class Global{
	public String instance="ʵ������";
	public static String variable="��̬����";
	
	Global(){
		System.out.println(instance);
		System.out.println(variable);
	}
	
	public void Instance() {
		System.out.println(instance);
		System.out.println(Variable.CONST);
	}
}
