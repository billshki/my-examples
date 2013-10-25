//UIUC CS125 FALL 2013 MP. File: Stack.java, CS125 Project: Challenge5-DataStructures, Version: 2013-10-14T15:57:58-0500.653928462
//@author schmnsk2
public class Stack {
	private String[] stack = new String[0];

	/** Adds a value to the top of the stack. */
	public void push(String value) {
		String[] temp = new String[length() + 1];
		temp[0] = value;
		for (int i = 1; i < temp.length; i++) {
			temp[i] = stack[i - 1];
		}
		this.stack = temp;
		// throw new RuntimeException("Elevator stuck. Abort Retry Fail?");
	}

	/** Removes the topmost string. If the stack is empty, returns null. */
	public String pop() {
		if (isEmpty())
			return null;
		String[] temp = new String[length() - 1];
		String s = stack[0];
		for(int i = 1; i<length(); i++){
			temp[i-1]=stack[i];
		}
		stack = temp;
		return s;
		//throw new RuntimeException("Ones and Zeros. Mostly.");
	}

	/**
	 * Returns the topmost string but does not remove it. If the stack is empty,
	 * returns null.
	 */
	public String peek() {
		if (isEmpty())
			return null;
		return this.stack[0];
		// throw new RuntimeException("Don't peek. It's too scary");
	}

	/** Returns true iff the stack is empty */
	public boolean isEmpty() {
		return this.stack.length == 0;
		// throw new RuntimeException("Need more");
	}

	/** Returns the number of items in the stack. */
	public int length() {
		return this.stack.length;
		// throw new RuntimeException("Must be relative");
	}

	/**
	 * Returns a string representation of the stack. Each string is separated by
	 * a newline. Returns an empty string if the stack is empty.
	 */
	public String toString() {
		StringBuffer s = new StringBuffer();
		if (!isEmpty()) {
			for (int i = length()-1; i>-1; i--) {
				s.append(stack[i] + "\n");
			}
		} else
			s = null;
		// throw new RuntimeException("Rope is thicker but String is quicker");
		return s.toString();
	}
}
