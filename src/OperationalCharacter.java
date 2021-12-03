
public class OperationalCharacter {
	public static void main(String[] args) {
		int a=5;
		int b=6;
		int x=2*a++;
		int y=2*++b;
		System.out.println("x="+(x+x+x+a));
		System.out.println("y="+y+" b="+b);
	}
}
