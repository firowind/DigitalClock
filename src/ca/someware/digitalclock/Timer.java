package ca.someware.digitalclock;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Timer extends DisplayCtrl
{
	private long startTime;
	long elapsedTime;
	
	public Timer(Display display) {
		super(display);
		
		this.startTime = System.currentTimeMillis();
	}

	@Override
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
}
