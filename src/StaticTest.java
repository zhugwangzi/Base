public class StaticTest {
	public static void main(String[] args) {
		String str1=Integer.toString(123);
		String str2=Integer.toBinaryString(123);
		String str3=Integer.toHexString(123);
		String str4=Integer.toOctalString(123);
		System.out.println("123的10进制表示："+str1);
		System.out.println("123的16进制表示："+str3);
		System.out.println("123的8进制表示："+str4);
		System.out.println("123的2进制表示："+str2);
	}
}