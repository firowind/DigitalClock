package ca.someware.digitalclock;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Clock extends DisplayCtrl
{
	public Clock(Display display)
	{
		super(display);
	}
	
	@Override
	public void update()
	{
		Calendar calendar = GregorianCalendar.getInstance();
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		minute = calendar.get(Calendar.MINUTE);
		second = calendar.get(Calendar.SECOND);
		millisecond = calendar.get(Calendar.MILLISECOND);
	}
}
