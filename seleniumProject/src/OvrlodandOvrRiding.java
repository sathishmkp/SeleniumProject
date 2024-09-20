
public class OvrlodandOvrRiding {
	
	String carName="Benz";
	
	public void cars(){
		
		System.out.println("I Love cars");
		
	}
	public void cars (String Name) {
		
		System.out.println("Cars"+ Name);
	}

	public static void main(String[] args) {
		
		OvrlodandOvrRiding ovrlodandOvrRiding = new OvrlodandOvrRiding();
		
		ovrlodandOvrRiding.cars();
		ovrlodandOvrRiding.cars("BMW");

	}

}
