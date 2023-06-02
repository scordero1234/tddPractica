package tdd;

public class Calculator    {
	private int ans;
	public int addition(int a,int b) {
		return a+b;
	}
	public int sustraction(int a,int b) {
		return a-b;
	}
	public int division(int a, int b) {
		return a/b;
	}

	public int multiplication(int a, int b) {return a*b;}

	public int divisionCero(int a, int b) {
		return a/b;
	}

	public int multiplicationTimeOut(int a, int b) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return a*b;
	}
	public int getAns() {
		return ans;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}
}
