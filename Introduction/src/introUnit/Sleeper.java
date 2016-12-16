package introUnit;

public class Sleeper implements Runnable{
	private int num;
	private int sleepTime;

	public Sleeper(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
		this.sleepTime = (int) (1000 * Math.random());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread one = new Thread(new Sleeper(1));
		Thread two = new Thread(new Sleeper(1));
		Thread three = new Thread(new Sleeper(1));
		Thread four = new Thread(new Sleeper(1));
		
		one.start();
		two.start();
		three.start();
		four.start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Thread number: " + num + " will sleep for " + sleepTime + " milliseconds.");
			Thread.sleep(sleepTime);
			System.out.println("Thread number: " + num + " woke up");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}