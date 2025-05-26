package src.main.java;

public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 1;
	}
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		count--;
	}
	
	public void increasedBy(int value) {
		count += value;
	}
	
	public void decreasedBy(int value) {
		count -= value;
	}
	
	public void multiplyBy(int value) {
		count *= value;
	}
	
	public int getCount() {
		return count;
	}
}
