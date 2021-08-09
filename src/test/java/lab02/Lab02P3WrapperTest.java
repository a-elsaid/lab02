package lab02;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Lab02P3WrapperTest {
	Lab02P3Wrapper.Bag<String> b2;
	Lab02P3Wrapper.Bag<String> b;
	@Before
	public void setUp() throws Exception {
		b = new Lab02P3Wrapper.LinkedBag<String>();
		b2 = new Lab02P3Wrapper.LinkedBag<String>();
		
		b.add("Joe");
		b.add("Lin");
		b.add("Ned");
		b.add("Lou");
		b.add("Joe");
		
		b2.add("Joe");
		b2.add("Lin");
		b2.add("Ned");
		b2.add("Lou");
		b2.add("Joe");
		
		// b = {Joe, Lin, Ned, Lou, Joe}
		// b2 = {Joe, Lin, Ned, Lou, Joe} 
		
	}

	@Test
	public void testReplace1() {
		// Test replacing one value
		
		// Adjust bag to the desired result
		b2.remove("Joe");
		b2.add("Luz");
		// Call method
		b.replace("Joe", "Luz");
		
		assertTrue("replace()-> Fails to replace Joe with Luz when calling b.replace(\"Joe\", \"Luz\")"
				+ " for b = {Joe, Lin, Ned, Lou, Joe}",
				b.equals(b2));
	}
	@Test
	public void testReplace2() {
		// Test replacing a value that's not present in Bag
		
		// Call method
		b.replace("Deku", "Luz");
		
		assertTrue("replace()-> Fails to leave bag unaltered when calling b.replace(\"Deku\", \"Luz\")"
				+ " for b = {Joe, Lin, Ned, Lou, Joe}",
				b.equals(b2));
	}
	
	@Test
	public void testReplace3() {
		// Test replacing more than one value
		
		// Adjust bag to the desired result
		b2.remove("Joe");
		b2.add("Luz");
		b2.remove("Lin");
		b2.add("Akko");
		b2.remove("Joe");
		b2.add("Shu");
		// Call method
		b.replace("Joe", "Luz");
		b.replace("Lin", "Akko");
		b.replace("Joe", "Shu");
		b.replace("Bob", "Ken");
		
		assertTrue("replace()-> When calling: \nb.replace(\"Joe\", \"Luz\");\nb.replace(\"Joe\", \"Luz\");"
				+ "\nb.replace(\"Joe\", \"Luz\");\nb.replace(\"Joe\", \"Luz\");\n"
				+ "on Bag b = {Joe, Lin, Ned, Lou, Joe}\n"
				+ "Fails to change b to {Luz, Akko, Ned, Lou, Shu}",
				b.equals(b2));
	}
	@Test
	public void testReplace4() {
		// Test replacing a value in an empty Bag
		b.clear();
		// Call method
		b.replace("Deku", "Luz");
		
		assertTrue("replace()-> Fails to leave bag unaltered when calling b.replace(\"Deku\", \"Luz\")"
				+ " for an empty Bag",
				b.equals(new Lab02P3Wrapper.LinkedBag<String>()));
	}

}


