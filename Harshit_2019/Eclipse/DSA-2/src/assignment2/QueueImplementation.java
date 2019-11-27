package assignment2;

import java.util.Scanner;

interface Queue {
	public void enQueue(int x);

	public int dQueue();

	public int poll();

	public int peeek();

	public boolean isFull();

	public boolean isEmpty();
}

public class QueueImplementation implements Queue {
	int front, rear, size, currentSize;
	int array[];

	public QueueImplementation(int size) {
		this.size = size;
		array = new int[size];
		this.front = -1;
		this.rear = -1;
		currentSize = 0;
	}

	/**
	 * Name: enQueue Disc: to add an element in the queue.
	 * 
	 * @param: (1) x-integer- integer value provided by user to add in the
	 *         queue.
	 * @return: void
	 **/
	@Override
	public void enQueue(int x) {
		if (isFull()) {
			System.out.println("queue is full");
			return;
		}
		if (this.front == -1) {
			front++;
		}
		this.rear = (this.rear + 1) % this.size;
		array[this.rear] = x;
		System.out.println(x + " inserted");
		currentSize++;
	}

	/**
	 * Name: dQueue Disc: to remove an element from the queue.
	 * 
	 * @return: integer - value which is removed from queue
	 **/
	@Override
	public int dQueue() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return 0;
		} else {
			int x = array[this.front];
			this.front = (this.front + 1) % this.size;
			System.out.println(x + " is removed from queue ");
			currentSize = currentSize - 1;
			return x;
		}

	}

	/**
	 * Name: poll Disc: to remove an element from the queue.
	 * 
	 * @return: integer - value which is removed from queue
	 **/
	@Override
	public int poll() {
		if (isEmpty()) {
			return 0;
		} else {
			int x = array[this.front];
			this.front = (front + 1) % this.size;
			return x;
		}
	}

	/**
	 * Name: peek Disc: to return an element from the front index of queue
	 * without modifying the queue.
	 * 
	 * @return: integer - element at index front in queue
	 **/
	@Override
	public int peeek() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return 0;
		} else {
			return array[front];
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of queue");
		int size = sc.nextInt();
		QueueImplementation obj = new QueueImplementation(size);
		obj.enQueue(10);
		obj.enQueue(20);
		obj.enQueue(30);
		obj.enQueue(40);
		obj.enQueue(50);
		obj.enQueue(60);
		obj.enQueue(70);
		obj.dQueue();
		obj.dQueue();
		obj.dQueue();
		obj.dQueue();
		obj.enQueue(80);
		obj.enQueue(90);
		obj.enQueue(100);
		obj.enQueue(110);
		obj.enQueue(120);
		obj.dQueue();
		obj.dQueue();
		obj.dQueue();
		obj.dQueue();
		obj.dQueue();
		obj.dQueue();
		// obj.dQueue();
		// obj.dQueue();

		System.out.println(obj.peeek());
		System.out.println(obj.poll());
		System.out.println(obj.peeek());

	}

	/**
	 * Name: isFull Disc: to check if queue is full.
	 * 
	 * @return: boolean - if full ? true: false
	 **/
	@Override
	public boolean isFull() {
		if (this.currentSize == this.size) {
			return true;
		}
		return false;
	}

	/**
	 * Name: isEmpty Disc: to check if queue is empty.
	 * 
	 * @return: boolean - if empty ? true: false
	 **/
	@Override
	public boolean isEmpty() {
		if (this.currentSize <= 0) {
			return true;
		}
		return false;
	}

}
