public class StaticTest {
	public static void main(String[] args) {
		String str1=Integer.toString(123);
		String str2=Integer.toBinaryString(123);
		String str3=Integer.toHexString(123);
		String str4=Integer.toOctalString(123);
		System.out.println("123��10���Ʊ�ʾ��"+str1);
		System.out.println("123��16���Ʊ�ʾ��"+str3);
		System.out.println("123��8���Ʊ�ʾ��"+str4);
		System.out.println("123��2���Ʊ�ʾ��"+str2);
	}
}