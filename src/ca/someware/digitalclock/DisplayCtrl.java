package ca.someware.digitalclock;

public class DisplayCtrl  implements Runnable
{
	protected Thread runner;
	protected Display display;
	
	protected int hourTens;
	protected int hourUnits;

	protected int minuteTens;
	protected int minuteUnits;

	protected int secondTens;
	protected int secondUnits;

	protected int millisecondHundreds;
	protected int millisecondTens;
	protected int millisecondUnits;
	
	protected int hour;
	protected int minute;
	protected int second;
	protected int millisecond;
	
	public DisplayCtrl(Display display)
	{	
		this.display = display;
		start();
	}
	
	public void update()
	{
		
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
