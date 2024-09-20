package testNG;

import org.testng.annotations.Test;

public class GrouppingExample {
    @Test(groups = {"Apple"})
	public void apple1() {

		System.out.println("Apple fruit");

	}
    @Test(groups = {"Apple"})
	public void apple2() {

		System.out.println("Apple fruit");

	}
    @Test(groups = {"Orange"})
	public void orange1() {

		System.out.println("Orange fruit");

	}
    @Test(groups = {"Orange"})
	public void orange2() {

		System.out.println("Orange fruit");

	}
    @Test(groups = {"Satwberry"})
	public void stawberry1() {

		System.out.println("Stawberry fruit");

	}
    @Test(groups = {"Satwberry"})
	public void stawberry2() {

		System.out.println("Stawberry fruit");

	}
    @Test(groups = {"Guava"})
	public void guava1() {

		System.out.println("Guava fruit");

	}
    @Test(groups = {"Guava"})
	public void guava2() {

		System.out.println("Guava fruit");

	}
}
