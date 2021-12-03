import java.util.Arrays;
import java.util.Random;

public class FinalTest {
	int a[]= {1,2,3,4,5};
	final int j=0;
	
	static final Random r=new Random();
	final int r1=r.nextInt(10);
	static final int r2=r.nextInt(10);
	public static void main(String[] args) {
		FinalTest f=new FinalTest();
		for(int i=0;i<f.a.length;i++) {
			f.a[i]=0;
		}
		System.out.println(Arrays.toString(f.a));
		System.out.println("r1="+f.r1);
		System.out.println("r2="+f.r2);
		FinalTest f1=new FinalTest();
		System.out.println("r1="+f1.r1);
		System.out.println("r2="+f1.r2);
		
	}
}
