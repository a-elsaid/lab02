package lab02;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Lab02P2WrapperTest {
	
	Lab02P2Wrapper.Set<String> s_1;
	Lab02P2Wrapper.Set<String> s_2;
	Lab02P2Wrapper.Set<String> s_3;
	Lab02P2Wrapper.Set<String> s_4;
	
	private int DEFAULT_SIZE = 25;

	@Before
	@SuppressWarnings("unchecked")
	public void setUp() throws Exception {
		s_1 = new Lab02P2Wrapper.ArraySet<String>(DEFAULT_SIZE);
		s_2 = new Lab02P2Wrapper.ArraySet<String>(DEFAULT_SIZE);
		s_3 = new Lab02P2Wrapper.ArraySet<String>(DEFAULT_SIZE);
		s_4 = new Lab02P2Wrapper.ArraySet<String>(DEFAULT_SIZE);
		
		load_default_set(s_1);
		load_default_set_2(s_2);
		load_default_set_3(s_3);
		load_default_set_4(s_4);
		
	}

	@Test
	public void testSingleton() {
		
		Lab02P2Wrapper.Set<Lab02P2Wrapper.Set<String>> singl_1 = s_1.singletonSets();
		assertTrue("Singleton Set should have same size as original set",  singl_1.size() == s_1.size());
		for (Lab02P2Wrapper.Set<String> set : singl_1) {
			assertTrue("Singleton should have only 1 element", set.size() == 1);
			for (String subElement : set) {
				assertTrue("Singleton element not in original set", s_1.contains(subElement));
				s_1.remove(subElement);
			}
		}
		assertTrue("Should be now empty", s_1.isEmpty());
	}
	
	@Test
	public void testSingleton2() {
		
		Lab02P2Wrapper.Set<Lab02P2Wrapper.Set<String>> singl_1 = s_2.singletonSets();
		assertTrue("Singleton Set should have same size as original set",  singl_1.size() == s_2.size());
		for (Lab02P2Wrapper.Set<String> set : singl_1) {
			assertTrue("Singleton should have only 1 element", set.size() == 1);
			for (String subElement : set) {
				assertTrue("Singleton element not in original set", s_2.contains(subElement));
				s_2.remove(subElement);
			}
		}
		assertTrue("Should be now empty", s_2.isEmpty());
	}
	
	@Test
	public void testSingleton3() {
		
		Lab02P2Wrapper.Set<Lab02P2Wrapper.Set<String>> singl_1 = s_3.singletonSets();
		assertTrue("Singleton Set should have same size as original set",  singl_1.size() == s_3.size());
		for (Lab02P2Wrapper.Set<String> set : singl_1) {
			assertTrue("Singleton should have only 1 element", set.size() == 1);
			for (String subElement : set) {
				assertTrue("Singleton element not in original set", s_3.contains(subElement));
				s_3.remove(subElement);
			}
		}
		assertTrue("Should be now empty", s_3.isEmpty());
	}
	@Test
	public void testSingleton4() {
		
		Lab02P2Wrapper.Set<Lab02P2Wrapper.Set<String>> singl_1 = s_4.singletonSets();
		assertTrue("Singleton Set should have same size as original set",  singl_1.size() == s_4.size());
		for (Lab02P2Wrapper.Set<String> set : singl_1) {
			assertTrue("Singleton should have only 1 element", set.size() == 1);
			for (String subElement : set) {
				assertTrue("Singleton element not in original set", s_4.contains(subElement));
				s_4.remove(subElement);
			}
		}
		assertTrue("Should be now empty", s_4.isEmpty());
	}

	//SET-BUILDERS
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void load_default_set(Lab02P2Wrapper.Set s) {
		s.clear();
		s.add("James");
		s.add("Rick");
		s.add("Dio");
		s.add("Carl");
		s.add("Jorge");
		s.add("Pedro");
		s.add("Ramon");
		
	}@SuppressWarnings({ "rawtypes", "unchecked" })
	private void load_default_set_2(Lab02P2Wrapper.Set s) {
		s.clear();
		s.add("James");
		s.add("Rick");
		s.add("Dio");
		s.add("Carl");
		s.add("Raul");
		s.add("Rodrigo");
		s.add("Ramon");
	}@SuppressWarnings({ "rawtypes", "unchecked" })
	private void load_default_set_3(Lab02P2Wrapper.Set s) {//if used it supposed to be disjointed
		s.clear();
		s.add("Freddy");
		s.add("Roger");
		s.add("Albert");
		s.add("Thomas");
		s.add("Tego");
		s.add("Benito");
		s.add("Rey");
	}@SuppressWarnings({ "rawtypes", "unchecked" })
	private void load_default_set_4(Lab02P2Wrapper.Set s) {
		s.clear();
		s.add("James");
		s.add("Kathy");
		s.add("Dio");
		s.add("Carl");
		s.add("Raul");
		s.add("Liz");
		s.add("Eliut");
	}
}
