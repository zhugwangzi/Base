import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入数据：");
		String str,str1,str2;
		str=s.next();
		str1=s.next();
		str2=s.next();
		System.out.println("输入的数据是："+str+","+str1+","+str2);
		s.close();
	}
}
