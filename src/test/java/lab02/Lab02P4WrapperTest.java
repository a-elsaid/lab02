package lab02;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Lab02P4WrapperTest {
	
	Lab02P4Wrapper.Bag<Integer> emptyB;
	Lab02P4Wrapper.Bag<Character> example;
	Lab02P4Wrapper.Bag<Character> freq1;
	Lab02P4Wrapper.Bag<Character> freq2;
	Lab02P4Wrapper.Bag<Integer> freq3;

	@Before
	public void setUp() throws Exception {
		
		emptyB = new Lab02P4Wrapper.LinkedBag<Integer>();
		
		//B = {'A', 'B', 'B', 'D', 'B','C'}
		example = new Lab02P4Wrapper.LinkedBag<Character>();
		
		example.add('A');
		example.add('B');
		example.add('B');
		example.add('D');
		example.add('B');
		example.add('C');
		
		//freq1 = {'C', 'I', 'I', 'C', '4', '0', '2', '0'}
		freq1 = new Lab02P4Wrapper.LinkedBag<Character>();
		
		String ciic = "CIIC4020";
		for (int i = 0; i < ciic.length(); i++) 
			freq1.add(ciic.charAt(i));
		
		
		//freq2 = {'D', 'A', 'T', 'A', 'S', 'T', 'R', 'U', 'C', 'T', 'U', 'R', 'E', 'S'}
		freq2 = new Lab02P4Wrapper.LinkedBag<Character>();
		
		String data = "DATASTRUCTURES";
		
		for (int i = 0; i < data.length(); i++) 
			freq2.add(data.charAt(i));
		
		
		//freq3 = {4020, 4035, 4010, 4015}
		freq3 = new Lab02P4Wrapper.LinkedBag<Integer>();
		
		freq3.add(4020);
		freq3.add(4035);
		freq3.add(4010);
		freq3.add(4015);
		
		
	}

	@Test
	public void testEmptyBag() {
		assertTrue("Faild to return an empty bag", emptyB.getFrequencyBag().isEmpty());
	}
	
	@Test
	public void testExample() {
		
		Lab02P4Wrapper.Bag<Integer> exampleResult = new Lab02P4Wrapper.LinkedBag<Integer>();
		exampleResult.add(1);
		exampleResult.add(3);
		exampleResult.add(1);
		exampleResult.add(1);
	
		
		assertTrue("Failed to return bag with {1, 3, 1, 1} on bag with {'A', 'B', 'B', 'D', 'B','C'}", example.getFrequencyBag().equals(exampleResult));
	}
	
	@Test
	public void testFrequency1() {
		
		Lab02P4Wrapper.Bag<Integer> freq1Result = new Lab02P4Wrapper.LinkedBag<Integer>();
		freq1Result.add(2);
		freq1Result.add(2);
		freq1Result.add(1);
		freq1Result.add(2);
		freq1Result.add(1);
		
		assertTrue("Failed to return bag with {2, 2, 1, 2, 1} on bag with {'C', 'I', 'I', 'C', '4', '0', '2', '0'}", freq1.getFrequencyBag().equals(freq1Result));

		
	}
	
	@Test
	public void testFrequency2() {
		
		//freq2 = {'D', 'A', 'T', 'A', 'S', 'T', 'R', 'U', 'C', 'T', 'U', 'R', 'E', 'S'}
			      //1    2    3         2         2    2    1                   1    
		
		Lab02P4Wrapper.Bag<Integer> freq2Result = new Lab02P4Wrapper.LinkedBag<Integer>();
		freq2Result.add(1);
		freq2Result.add(2);
		freq2Result.add(3);
		freq2Result.add(2);
		freq2Result.add(2);
		freq2Result.add(2);
		freq2Result.add(1);
		freq2Result.add(1);
		
		assertTrue("Failed to return bag with {1, 2, 3, 2, 2, 1, 1, 1} on bag with {'D', 'A', 'T', 'A', 'S', 'T', 'R', 'U', 'C', 'T', 'U', 'R', 'E', 'S'}", freq2.getFrequencyBag().equals(freq2Result));

		
	}
	
	@Test
	public void testFrequency3() {
		Lab02P4Wrapper.Bag<Integer> freq3Result = new Lab02P4Wrapper.LinkedBag<Integer>();
		freq3Result.add(1);
		freq3Result.add(1);
		freq3Result.add(1);
		freq3Result.add(1);
		
		
		assertTrue("Failed to return bag with {1, 1, 1, 1} on bag with {4020, 4035, 4010, 4015}", freq3.getFrequencyBag().equals(freq3Result));

	}
	
	
	
}


