/**
	* Test JUnit de la calculadora y el stack
	* @author: Linda Ines Jimenez Vides
	* @version: 19 - febrero - 2022
*/

import java.util.Stack;

import junit.framework.TestCase;

public class TestCalcu extends TestCase {
	
	private CalcuPostfix cp = new CalcuPostfix();
	private Stack S = new Stack();

	public void testevaluarOperacion() {
		 assertTrue(cp.evaluarOperacion("2 3 +") == (2+3));
	}
	
	public void testpush() {
		
		Stack<Integer> stack2 = new Stack<Integer>();
		stack2.push(2);
		assertTrue(stack2.push(2) == stack2.peek());
	}
	
	public void testpeek() {
		Stack<Integer> stack2 = new Stack<Integer>();
		stack2.push(2);
		assertTrue(stack2.push(2) == stack2.peek());
	}
	
	public void testIsEmpty() {
		Stack<Integer> stack2 = new Stack<Integer>();
		assertEquals(true, stack2.isEmpty());
	}
	
	public void testsize() {
		Stack<Integer> stack2 = new Stack<Integer>();
		stack2.push(2);
		stack2.push(8);
		assertEquals(2, stack2.size());
	}
	
}
