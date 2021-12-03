public class StringDemo{
	public static void main(String[] args) {
		String s="sk db, f@ g s,a# ,d";
		System.out.println(s.replace("sk","mn"));
		String[] str=s.split(" ");
		for(String x:str) {
			System.out.print("{"+x+"} ");
		}
	}
}