
public class InstanceCounter {
	private static int numInstances=0;
	
	protected static int getCount() {
		return numInstances;
	}
	
	private static void addInstances() {
		numInstances++;
	}
	
	InstanceCounter(){
		InstanceCounter.addInstances();
	}
	
	public static void main(String[] args) {
		System.out.println("starting with "+
				InstanceCounter.getCount()+" instances");//这里也可以直接访问numInstances
		for(int i=0;i<10;i++) {
				new InstanceCounter();
		System.out.println("created "+
				InstanceCounter.getCount()+" instances");
		}
	}
}
