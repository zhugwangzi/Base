import java.io.*;
public class StringDemo1 {
	public static void main(String[] args) throws IOException{
		char c;
		String s;
		System.out.println("�����ַ��������� e ֹͣ��ȡ�ַ�����");
		
		BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
		do{
//			c=(char) bReader.read();//��ȡ������ַ�������ȡ����һ���ַ�
			s=bReader.readLine();
//			System.out.print(c);
			System.out.println(s);
		}while(!s.equals("end"));
	}
}
