package testNG;

import org.testng.annotations.Test;

public class SampleTest {
    
	@Test(priority = 0)
	
	public void startCar(){

		System.out.println("Stat the Car");

	}
    @Test(priority = 1)
	public void putFirstGear(){

		System.out.println("Put the First Gear");

	}
    @Test(priority = 2)
	public void putSecondGear(){
		System.out.println("Put the Second Gear");
   }
    @Test(priority = 3)
    public void putThirdGear(){

		System.out.println("Put the Third Gear");

	}
    @Test(priority=4)
    public void putFourthGear(){

		System.out.println("Put the Fourth Gear");
    }
		
	@Test(priority=5)
	public void turnOntheMusic(){

		System.out.println("Turn On the Music");
		
	

	}


}


