package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int TAB_SIZE = 12;

	private static final int ERROR = -1;

	private int[] numbers = new int[TAB_SIZE];

	public int total = ERROR;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
			return total == ERROR;
		}
	
	public boolean isFull() {
				return total == 11;
			}
	
	protected int peekAboo() {
		if (callCheck())
			return ERROR;
		return numbers[total];
	}
		
	public int countOut() {
		if (callCheck())
			return ERROR;
		return numbers[total--];
	}

}
