package org.test;

import org.testng.annotations.Test;

public class Sample {
	@Test(priority=-1)
	private void tc11() {
		System.out.println("main11");

	}
	@Test(enabled=true)
	private void tc21() {
		System.out.println("main21");

	}
	
	@Test(priority=5)
	private void tc13() {
		System.out.println("main13");

	}
	@Test(priority=-9)
	private void tc14() {
		System.out.println("main14");

	}

}
