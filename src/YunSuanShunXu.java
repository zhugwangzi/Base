public class YunSuanShunXu{
	public static void main(String[] args) {
		int a=2;
		//�ӷ��Ľ��˳���Ǵ�����
		System.out.println(--a/2+(++a*2));/*�ȼ���--a/2��
			�ټ���++a*2*/
		System.out.println(++a*2+(--a/2));/*�ȼ���++a*2��
			�ټ���--a/2*/
		System.out.println();
		byte b=-3;//����Ϊ11111100
		int c=3;
		int d=(byte)(b+c);//������byte d=b+c;
		
		for(int i=0;i<5;i++) {
			b>>=1;
			System.out.println(b);
		}
		
	}	
}