package tests;

import org.junit.Assert;
import org.junit.Test;

import assignment2.QueueImplementation;

public class QueueTest {

	QueueImplementation obj = new QueueImplementation(5);

	@Test
	public void deQueuePositive() {

		obj.enQueue(10);
		obj.enQueue(20);
		Assert.assertEquals(10, obj.dQueue());
	}

	@Test
	public void deQueueNegetive() {
		Assert.assertNotEquals(100, obj.dQueue());
	}

	@Test
	public void PeekPostitive() {
		obj.enQueue(10);
		obj.enQueue(20);
		Assert.assertEquals(10, obj.peeek());
	}

	@Test
	public void PeekNegetive() {
		obj.enQueue(10);
		obj.enQueue(20);
		Assert.assertNotEquals(0, obj.peeek());

	}
}
