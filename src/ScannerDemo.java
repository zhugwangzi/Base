import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("���������ݣ�");
		String str,str1,str2;
		str=s.next();
		str1=s.next();
		str2=s.next();
		System.out.println("����������ǣ�"+str+","+str1+","+str2);
		s.close();
	}
}
