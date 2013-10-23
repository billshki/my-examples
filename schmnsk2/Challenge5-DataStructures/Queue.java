//UIUC CS125 FALL 2013 MP. File: Queue.java, CS125 Project: Challenge5-DataStructures, Version: 2013-10-14T15:57:58-0500.653928462

public class Queue {
	private double[] queue = new double[0];

	/**
	 * Adds the value to the front of the queue. Note the queue automatically
	 * resizes as more items are added.
	 */
	public void add(double value) {
		int newSize = queue.length + 1;
		double[] temp = new double[newSize];
		temp[0] = value;
		for (int i = 0; i < queue.length; i++) {
			temp[i + 1] = queue[i];
		}
		queue = temp;
		// throw new RuntimeException("Don't step on the cracks");
	}

	/**
	 * Removes the value from the end of the queue. If the queue is empty,
	 * returns 0
	 */
	public double remove() {
		if (!isEmpty()) {
			int newSize = queue.length - 1;
			double value = queue[newSize];
			double[] temp = new double[newSize];
			for (int i = 0; i < newSize; i++) {
				temp[i] = queue[i];
			}
			this.queue = temp;
			return value;
		} else
			return 0;
		// throw new RuntimeException("Grilled Cheese");
	}

	/** Returns the number of items in the queue. */
	public int length() {
		return this.queue.length;
		// throw new RuntimeException("I am not a number; I am free man.");
	}

	/** Returns true iff the queue is empty */
	public boolean isEmpty() {
		return length() == 0;
		// throw new RuntimeException("The butler did it");
	}

	/** Returns a comma separated string representation of the queue. */
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append(queue[queue.length-1]);
		s.append(',');
		for (int i = queue.length-2; i > 0; i--) {
			s.append(this.queue[i]);
			s.append(',');
		}
		s.append(queue[0]);
		return s.toString();
		/*String s = null;
		for (int i = 0; i < queue.length - 1; i++) {
			s += queue[i] + ",";
		}
		s += queue[queue.length - 1];
		return s;*/
		// throw new RuntimeException("Daisy daisy daisy");
	}
}
