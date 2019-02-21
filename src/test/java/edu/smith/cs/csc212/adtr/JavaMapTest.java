package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
	
	// you might want this.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	@Test
	public void testEmpty() {
		MapADT<String, Integer> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
		//Assert.assert
	}
	@Test
	public void testPut() {
		MapADT<String, Integer> dict = new JavaMap<>();
		dict.put("apple", 1);
		assertEquals(dict.size(), 1);
		//Assert.assert
	}
	@Test
	public void testRemove() {
		MapADT<String, Integer> map = new JavaMap<>();
		map.put("apple", 1);
		map.remove("apple");
		assertEquals(map.size(),0);
		//Assert.assert
	}
	@Test
	public void testGet() {
		MapADT<String, Integer> map = new JavaMap<>();
		map.put("apple", 1);
		assertEquals(map.get("apple"),1);
		//Assert.assert
	}
	
	
	
}
