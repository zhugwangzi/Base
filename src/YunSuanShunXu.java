public class YunSuanShunXu{
	public static void main(String[] args) {
		int a=2;
		//加法的结合顺序是从左到右
		System.out.println(--a/2+(++a*2));/*先计算--a/2，
			再计算++a*2*/
		System.out.println(++a*2+(--a/2));/*先计算++a*2，
			再计算--a/2*/
		System.out.println();
		byte b=-3;//补码为11111100
		int c=3;
		int d=(byte)(b+c);//不能用byte d=b+c;
		
		for(int i=0;i<5;i++) {
			b>>=1;
			System.out.println(b);
		}
		
	}	
}