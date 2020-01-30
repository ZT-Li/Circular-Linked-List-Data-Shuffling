package cs146F19.Li.Project1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircularLinkedListTest {

	@Test
	public void testCircularLinkedList() {
		CircularLinkedList prisoner=new CircularLinkedList(0);//Empty list
		assertTrue(prisoner.isEmpty());
		CircularLinkedList cll=new CircularLinkedList(10);//Size is 10
		assertEquals(10,cll.size());
		assertFalse(cll.isEmpty());
	}
	
	@Test
	public void testCLLgames() {
		CircularLinkedList cll1=new CircularLinkedList(6);
		CircularLinkedList cll2=new CircularLinkedList(1);
		CircularLinkedList cll3=new CircularLinkedList(7);
		CircularLinkedList cll4=new CircularLinkedList(12);
		CircularLinkedList cll5=new CircularLinkedList(5);
		assertEquals(1,cll1.CLLgames(2));//test case for n=6, k=2
		assertEquals(1,cll2.CLLgames(9));//test case for n=1, k=9
		assertEquals(4,cll3.CLLgames(7));//test case for n=7, k=7
		assertEquals(2,cll4.CLLgames(8));//test case for n=12, k=8
		assertEquals(3,cll5.CLLgames(1));//test case for n=5, k=1
	}
}
