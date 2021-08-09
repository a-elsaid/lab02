package lab02;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Lab02P1WrapperTest {


	private Lab02P1Wrapper.ArraySet<Integer>[] sets; //testDisjoint1 & testDisjoint2
	private Lab02P1Wrapper.ArraySet<Integer>[] baseSets; //testExample
	private Lab02P1Wrapper.ArraySet<Integer>[] emptySets; //testEmptyArray
	
	//testDisjoint1
	private Lab02P1Wrapper.ArraySet<Integer> s_1;
	private Lab02P1Wrapper.ArraySet<Integer> s_2;
	private Lab02P1Wrapper.ArraySet<Integer> s_3;
	private Lab02P1Wrapper.ArraySet<Integer> s_4;

	//testDisjoint2
	private Lab02P1Wrapper.ArraySet<Integer> s1;
	private Lab02P1Wrapper.ArraySet<Integer> s2;
	private Lab02P1Wrapper.ArraySet<Integer> s3;
	private Lab02P1Wrapper.ArraySet<Integer> s4;
	
	//testExample
	private Lab02P1Wrapper.ArraySet<Integer> base1;
	private Lab02P1Wrapper.ArraySet<Integer> base2;
	private Lab02P1Wrapper.ArraySet<Integer> base3;

	private int DEFAULT_SIZE = 25;

	@Before
	@SuppressWarnings("unchecked")
	public void setUp() throws Exception {

		/*Sets for testDisjoint1*/
		sets = new Lab02P1Wrapper.ArraySet[4];
		s_1 = new Lab02P1Wrapper.ArraySet<Integer>(DEFAULT_SIZE);
		s_2 = new Lab02P1Wrapper.ArraySet<Integer>(DEFAULT_SIZE);
		s_3 = new Lab02P1Wrapper.ArraySet<Integer>(DEFAULT_SIZE);
		s_4 = new Lab02P1Wrapper.ArraySet<Integer>(DEFAULT_SIZE);

		for (int i = 3; i < 10; i+=3)
			s_1.add(i); //{3,6,9}
		for (int i = 2; i < 10; i+=2)
			s_2.add(i); //{2,4,6,8}
		for (int i = 2; i < 10; i+=4)
			s_3.add(i); //{2,6}
		for (int i = 1; i < 10; i+=2)
			s_4.add(i); //{1,3,5,7,9}
		
		
		/*Sets for testDisjoint2*/
		s1 = new Lab02P1Wrapper.ArraySet<Integer>(DEFAULT_SIZE);
		s2 = new Lab02P1Wrapper.ArraySet<Integer>(DEFAULT_SIZE);
		s3 = new Lab02P1Wrapper.ArraySet<Integer>(DEFAULT_SIZE);
		s4 = new Lab02P1Wrapper.ArraySet<Integer>(DEFAULT_SIZE);

		s1.add(4020);
		s1.add(4035);

		s2.add(3015);
		s2.add(3011);

		s3.add(4010);
		s3.add(4015);

		s4.add(3075);
		s4.add(4075);


		/*Sets for testExample*/
		baseSets = new Lab02P1Wrapper.ArraySet[3];

		base1 = new Lab02P1Wrapper.ArraySet<Integer>(DEFAULT_SIZE);
		base2 = new Lab02P1Wrapper.ArraySet<Integer>(DEFAULT_SIZE);
		base3 = new Lab02P1Wrapper.ArraySet<Integer>(DEFAULT_SIZE);


		base1.add(1);
		base1.add(2);
		base1.add(3);

		base2.add(4);
		base2.add(5);

		base3.add(1);


		baseSets[0] = base1;
		baseSets[1] = base2;
		baseSets[2] = base3;
		
		/*Empty Array Base Case*/
		emptySets = new Lab02P1Wrapper.ArraySet[0];
	}

	@Test
	public void testExample() {
		
		boolean check = Lab02P1Wrapper.checkDisjoint(baseSets);
		assertTrue("Failed to return false on sets with {1, 2, 3}, {4, 5}, {1}", check == false);

	}

	@Test
	public void testDisjoint1() {

		sets[0] = s_1;
		sets[1] = s_2;
		sets[2] = s_3;
		sets[3] = s_4;

		boolean check = Lab02P1Wrapper.checkDisjoint(sets);
		assertTrue("Failed to return false on sets with {3, 6, 9}, {2, 4, 6, 8}, {2, 6}, {1, 3, 5, 7, 9}", check == false);

	}

	@Test
	public void testDisjoint2() {

		sets[0] = s1;
		sets[1] = s2;
		sets[2] = s3;
		sets[3] = s4;


		boolean check = Lab02P1Wrapper.checkDisjoint(sets);
		assertTrue("Failed to return true on sets with {4020, 4035}, {3015, 3011}, {4010, 4015}, {3075, 4075}", check == true);


	}

	@Test
	public void testEmptyArray() {

		boolean check = Lab02P1Wrapper.checkDisjoint(emptySets);
		assertTrue("Failed to return true on array with empty sets", check == true);
	}

}
