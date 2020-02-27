package com.wls.common.utils;



import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
          int i = RandomUtil.random(1, 4);
          System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] x = RandomUtil.subRandom(1, 10, 3);
		
		for (int i : x) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		 char c = RandomUtil.randomCharacter();
		 System.out.println(c);
	}

	@Test
	public void testRandomString() {
		  String randomString = RandomUtil.randomString(3);
		  System.out.println(randomString);
		  
	}

}
