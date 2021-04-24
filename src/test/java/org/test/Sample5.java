package org.test;

import org.testng.annotations.Test;

public class Sample5 {
	@Test
	private void tc1() {
		System.out.println("Method1");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc2() {
		System.out.println("Method2");
		System.out.println(Thread.currentThread().getId());

	}

}
