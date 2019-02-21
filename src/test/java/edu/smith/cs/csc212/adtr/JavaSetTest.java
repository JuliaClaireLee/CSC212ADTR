package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}
	@Test
	public void testInsertUnique() {
		SetADT<String> abc = new JavaSet<>();
		abc.insert("A");
		abc.insert("B");
		abc.insert("C");
		assertEquals(abc.size(),3);
	}
	@Test
	public void testInsertDuplicate() {
		SetADT<String> aaa = new JavaSet<>();
		aaa.insert("A");
		aaa.insert("A");
		aaa.insert("A");
		assertEquals(aaa.size(),1);
	}
	@Test
	public void testremoveDuplicate() {
		SetADT<String> aa = new JavaSet<>();
		aa.insert("A");
		aa.insert("A");
		aa.remove("A");
		assertEquals(aa.size(),0);
	}
	@Test
	public void testContains() {
		SetADT<String> arj = new JavaSet<>();
		arj.insert("A");
		arj.insert("R");
		arj.insert("J");
		assertEquals(arj.contains("J"),true);
	}
	
}
