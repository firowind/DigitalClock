package ca.someware.digitalclock;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Clock implements Runnable
{
	private Thread runner;
	private Display display;
	
	private int hour;
	private int minute;
	private int second;
	private int millisecond;
	
	private long startTime;
	long elapsedTime;
	
	public Clock(Display display) {
		this.display = display;
		start();
		this.startTime = System.currentTimeMillis();
	}

	public void update()
	{
		elapsedTime = startTime + (new Date()).getTime();
		
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTimeInMillis(elapsedTime);
		
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		minute = calendar.get(Calendar.MINUTE);
		second = calendar.get(Calendar.SECOND);
		millisecond = calendar.get(Calendar.MILLISECOND);
	}
	
	private void updateDisplay()
	{
		display.hourTens = new Digit((hour%100)/10);
		display.hourUnits = new Digit(hour%10);
		display.minuteTens = new Digit((minute%100)/10);
		display.minuteUnits = new Digit(minute%10);
		display.secondTens = new Digit((second%100)/10);
		display.secondUnits = new Digit(second%10);
		display.millisecondHundreds = new Digit((millisecond%1000)/100);
		display.millisecondTens = new Digit((millisecond%100)/10);
		display.millisecondUnits = new Digit(millisecond%10);
	}
	
	public void start() {
		if(runner == null) {
			runner = new Thread(this);
		}

		runner.start(); //method to start thread
	}

	public void run() {
		while(runner == Thread.currentThread())
		{
			update();
			updateDisplay();
			display.repaint();
			
			try {
				Thread.sleep(1);
			}
			catch(InterruptedException e) {
				System.out.println("Thread failed");
			}
		}
	}
}
