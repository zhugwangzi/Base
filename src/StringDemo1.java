import java.io.*;
public class StringDemo1 {
	public static void main(String[] args) throws IOException{
		char c;
		String s;
		System.out.println("输入字符串，遇到 e 停止读取字符串。");
		
		BufferedReader bReader=new BufferedReader(new InputStreamReader(System.in));
		do{
//			c=(char) bReader.read();//读取输入的字符串并获取它的一个字符
			s=bReader.readLine();
//			System.out.print(c);
			System.out.println(s);
		}while(!s.equals("end"));
	}
}
