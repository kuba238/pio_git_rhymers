package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
	if (!callCheck() && in > peekAboo())
			    totalRejected++;
			else
				super.countIn(in);
	}
	//zle formatowane  wiersze 5 oraz 13, alt + strzlka przelacza obecny plik na kartach
}
