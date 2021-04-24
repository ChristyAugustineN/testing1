package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample3 {
	@Test(groups="@smoke")
	private void tco() {
		System.out.println("Method00");

	}
	@Test(groups="@sanity")
	private void tc1() {
		System.out.println("Method1");

	}
	@Test(groups= {"@smoke"})
	private void tc2() {
		System.out.println("Method2");
		Assert.assertTrue(false);

	}
	@Test(groups="@reg",dependsOnGroups= "@smoke")
	private void tc3() {
		System.out.println("Method3");
		
	}
	@Test(groups="@E2E")
	private void tc4() {
		System.out.println("Method4");
		
	}
	@Test(groups="@smoke")
	private void tc5() {
		System.out.println("Method5");
		
	}

}
