package org.test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SampleTestng {
	@Test(invocationCount=2)
	private void tco() {
		System.out.println("main");

	}
	@Ignore
	@Test(priority=-1)
	private void tc1() {
		System.out.println("main1");

	}
	@Test(enabled=true)
	private void tc2() {
		System.out.println("main2");

	}
	
	@Test(priority=5)
	private void tc3() {
		System.out.println("main3");

	}
	@Test(priority=-9)
	private void tc4() {
		System.out.println("main4");

	}



}
