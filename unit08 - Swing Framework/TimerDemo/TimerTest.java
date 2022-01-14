package TimerDemo;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

	public static void main(String[] args) {
		Timer timer = new Timer();
		
		MyTask task = new MyTask();
		
		timer.schedule(task, 1000,1000);

	}

}


class MyTask extends TimerTask {
	public void run() {
		System.out.print("hello, world!\n");
	}
}


