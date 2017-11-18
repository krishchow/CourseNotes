package w02_3pm;
import static org.junit.Assert.*;

import org.junit.Test;

import w02_3pm.Balloon;

public class BalloonTest {

	@Test
	public void testInflate() {
		Balloon b=new Balloon("red");
		b.inflate(10);
		assertEquals("After inflating by 10 amt", 10, b.getAmount());
		assertEquals("After inflating by 10 capacity", 100, b.getCapacity());
		assertEquals("After inflating by 10 isPopped",false, b.isPopped());
		
		b.inflate(-3);
		assertEquals("After inflating by 10 amt", 10, b.getAmount());
		assertEquals("After inflating by 10 capacity", 100, b.getCapacity());
		assertEquals("After inflating by 10 isPopped",false, b.isPopped());
		
		b.inflate(0);
		assertEquals("After inflating by 10 amt", 10, b.getAmount());
		assertEquals("After inflating by 10 capacity", 100, b.getCapacity());
		assertEquals("After inflating by 10 isPopped",false, b.isPopped());
		
		b.inflate(90);
		assertEquals("After inflating by 90 amt", 100, b.getAmount());
		assertEquals("After inflating by 90 capacity", 100, b.getCapacity());
		assertEquals("After inflating by 90 isPopped",false, b.isPopped());
		
		b.inflate(1);
		assertEquals("After inflating by 1 amt", 0, b.getAmount());
		assertEquals("After inflating by 1 capacity", 0, b.getCapacity());
		assertEquals("After inflating by 1 isPopped",true, b.isPopped());
		
		b.inflate(10);
		assertEquals("After popping amt", 0, b.getAmount());
		assertEquals("After popping capacity", 0, b.getCapacity());
		assertEquals("After popping isPopped",true, b.isPopped());
	
	}
}
