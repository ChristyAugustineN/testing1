package org.test;

import org.testng.annotations.Test;

public class Sample6 {
	@Test
	private void tc9() {
		System.out.println("Method1");
		System.out.println(Thread.currentThread().getId());

	}
	@Test
	private void tc10() {
		System.out.println("Method2");
		System.out.println(Thread.currentThread().getId());

	}

}
