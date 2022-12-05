package edu.pitt.cs;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

@RunWith(JUnitQuickcheck.class)
public class QuickCheckTest {

	@Property
	public void testSquare(@InRange(minInt = -10, maxInt = 10) int x) {
		int ret = IntegerOps.square(x);
		// TODO: Fill in
		assertTrue(ret >= 0 && ret <= 100);

	}
	
	@Property
	public void testAdd(@InRange(minInt = -10, maxInt = 10) int x, @InRange(minInt = -10, maxInt = 10) int y) {
		int ret = IntegerOps.add(x, y);
		// TODO: Fill in
		assertTrue(ret >= -20 && ret <= 20);
		assertTrue(x == ret - y);
		assertTrue(y == ret - x);

	}
	
}