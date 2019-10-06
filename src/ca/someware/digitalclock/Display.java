package ca.someware.digitalclock;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel
{

	public Digit hourTens;
	public Digit hourUnits;

	public Digit minuteTens;
	public Digit minuteUnits;

	public Digit secondTens;
	public Digit secondUnits;

	public Digit millisecondHundreds;
	public Digit millisecondTens;
	public Digit millisecondUnits;
	
	private int scale = 3;
	private int flicker = 1;
	private int flickerPercentage = 1000;
	
	private static final Color YELLOW = new Color(255,255,0,255);
	private static final Color GRAY = new Color(192,192,192,50);
	
	private Graphics2D g2;
	private boolean led = true;
	private int margin = 4;
	private static final int DOT_SIZE = 4;

	public Display()
	{			
		hourTens = new Digit(0);
		hourUnits = new Digit(0);
		minuteTens = new Digit(0);
		minuteUnits = new Digit(0);
		secondTens = new Digit(0);
		secondUnits = new Digit(0);
		millisecondHundreds = new Digit(0);
		millisecondTens = new Digit(0);
		millisecondUnits = new Digit(0);
	}
	
//	public void updateTime()
//	{	
//		Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
//		int hour = calendar.get(Calendar.HOUR_OF_DAY);        // gets hour in 12h format
//		int minute = calendar.get(Calendar.MINUTE); 
//		int second = calendar.get(Calendar.SECOND);
//		int millisecond = calendar.get(Calendar.MILLISECOND);
//		
//		hourTens = new Digit((hour%100)/10);
//		hourUnits = new Digit(hour%10);
//		minuteTens = new Digit((minute%100)/10);
//		minuteUnits = new Digit(minute%10);
//		secondTens = new Digit((second%100)/10);
//		secondUnits = new Digit(second%10);
//		millisecondHundreds = new Digit((millisecond%1000)/100);
//		millisecondTens = new Digit((millisecond%100)/10);
//		millisecondUnits = new Digit(millisecond%10);
//	}
	
	private void drawDigit(int offSetX, int offSetY, Boolean[] LEDs)
	{
	    int[] x;
	    int[] y;

	    // 0 ¯
	    if (LEDs[0] && Math.random()*flickerPercentage > flicker) {
	    	g2.setPaint(YELLOW);
	    }
	    else {
	    	g2.setPaint(GRAY);
	    }
	    x = new int[]{(offSetX+1)*scale,(offSetX+19)*scale,(offSetX+15)*scale,(offSetX+5)*scale};
	    y = new int[]{(offSetY+0)*scale,(offSetY+0)*scale ,(offSetY+4)*scale ,(offSetY+4)*scale};
	    g2.fillPolygon (x, y, x.length);
	    
	    // 1 |
	    if (LEDs[1] && Math.random()*flickerPercentage > flicker) {
	    	g2.setPaint(YELLOW);
	    }
	    else {
	    	g2.setPaint(GRAY);
	    }
	    x = new int[]{(offSetX+0)*scale,(offSetX+4)*scale,(offSetX+4)*scale ,(offSetX+1)*scale ,(offSetX+0)*scale};
	    y = new int[]{(offSetY+1)*scale,(offSetY+5)*scale,(offSetY+16)*scale,(offSetY+19)*scale,(offSetY+18)*scale};
	    g2.fillPolygon (x, y, x.length);
	    
	    // 2 |
	    if (LEDs[2] && Math.random()*flickerPercentage > flicker) {
	    	g2.setPaint(YELLOW);
	    }
	    else {
	    	g2.setPaint(GRAY);
	    }
	    x = new int[]{(offSetX+0)*scale ,(offSetX+1)*scale ,(offSetX+4)*scale ,(offSetX+4)*scale ,(offSetX+0)*scale};
	    y = new int[]{(offSetY+22)*scale,(offSetY+21)*scale,(offSetY+24)*scale,(offSetY+35)*scale,(offSetY+39)*scale};
	    g2.fillPolygon (x, y, x.length);
	    
	    // 3 _
	    if (LEDs[3] && Math.random()*flickerPercentage > flicker) {
	    	g2.setPaint(YELLOW);
	    }
	    else {
	    	g2.setPaint(GRAY);
	    }
	    x = new int[]{(offSetX+1)*scale ,(offSetX+5)*scale ,(offSetX+15)*scale,(offSetX+19)*scale};
	    y = new int[]{(offSetY+40)*scale,(offSetY+36)*scale,(offSetY+36)*scale,(offSetY+40)*scale};
	    g2.fillPolygon (x, y, x.length);
	    
	    // 4 |
	    if (LEDs[4] && Math.random()*flickerPercentage > flicker) {
	    	g2.setPaint(YELLOW);
	    }
	    else {
	    	g2.setPaint(GRAY);
	    }
	    x = new int[]{(offSetX+16)*scale,(offSetX+19)*scale,(offSetX+20)*scale,(offSetX+20)*scale,(offSetX+16)*scale};
	    y = new int[]{(offSetY+24)*scale,(offSetY+21)*scale,(offSetY+22)*scale,(offSetY+39)*scale,(offSetY+35)*scale};
	    g2.fillPolygon (x, y, x.length);
	    
	    // 5 |
	    if (LEDs[5] && Math.random()*flickerPercentage > flicker) {
	    	g2.setPaint(YELLOW);
	    }
	    else {
	    	g2.setPaint(GRAY);
	    }
	    x = new int[]{(offSetX+16)*scale,(offSetX+20)*scale,(offSetX+20)*scale,(offSetX+19)*scale,(offSetX+16)*scale};
	    y = new int[]{(offSetY+5)*scale ,(offSetY+1)*scale ,(offSetY+18)*scale,(offSetY+19)*scale,(offSetY+16)*scale};
	    g2.fillPolygon (x, y, x.length);
	    
	    // 6 -
	    if (LEDs[6] && Math.random()*flickerPercentage > flicker) {
	    	g2.setPaint(YELLOW);
	    }
	    else {
	    	g2.setPaint(GRAY);
	    }
	    x = new int[]{(offSetX+2)*scale ,(offSetX+4)*scale ,(offSetX+16)*scale,(offSetX+18)*scale,(offSetX+16)*scale,(offSetX+4)*scale ,(offSetX+4)*scale};
	    y = new int[]{(offSetY+20)*scale,(offSetY+18)*scale,(offSetY+18)*scale,(offSetY+20)*scale,(offSetY+22)*scale,(offSetY+22)*scale,(offSetY+22)*scale};
	    g2.fillPolygon (x, y, x.length);
	}
	
	private void drawDot(int offSetX, int offSetY)
	{
		int[] x;
	    int[] y;

	    g2.setPaint((led?YELLOW:GRAY));
	    x = new int[]{(offSetX+0)*scale ,(offSetX+4)*scale ,(offSetX+4)*scale ,(offSetX+0)*scale};
	    y = new int[]{(offSetY+10)*scale,(offSetY+10)*scale,(offSetY+14)*scale,(offSetY+14)*scale};
	    g2.fillPolygon (x, y, x.length);
	    
	    g2.setPaint((led?YELLOW:GRAY));
	    x = new int[]{(offSetX+0)*scale ,(offSetX+4)*scale ,(offSetX+4)*scale ,(offSetX+0)*scale};
	    y = new int[]{(offSetY+27)*scale,(offSetY+27)*scale,(offSetY+31)*scale,(offSetY+31)*scale};
	    g2.fillPolygon (x, y, x.length);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	    g2 = (Graphics2D) g;
	    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	                                RenderingHints.VALUE_ANTIALIAS_ON);
	    

	    g2.setPaint(Color.BLACK);
	    g2.fillRect(0, 0, getDisplayWidth(), getDisplayHeight());
	    
	    int offSetX = margin/2;
	    int offSetY = margin/2;
	    
	    drawDigit(offSetX,offSetY,hourTens.getLEDs());
	    
	    offSetX += Digit.DIGIT_WIDTH + margin;
	    drawDigit(offSetX,offSetY,hourUnits.getLEDs());
	    
	    offSetX += Digit.DIGIT_WIDTH + margin;
	    drawDot(offSetX, offSetY);

	    offSetX += DOT_SIZE + margin;
	    drawDigit(offSetX,offSetY,minuteTens.getLEDs());

	    offSetX += Digit.DIGIT_WIDTH + margin;
	    drawDigit(offSetX,offSetY,minuteUnits.getLEDs());
	    
	    offSetX += Digit.DIGIT_WIDTH + margin;
	    drawDot(offSetX, offSetY);

	    offSetX += DOT_SIZE + margin;
	    drawDigit(offSetX,offSetY,secondTens.getLEDs());
	    
	    offSetX += Digit.DIGIT_WIDTH + margin;
	    drawDigit(offSetX,offSetY,secondUnits.getLEDs());
	    
//	    offSetX += Digit.DIGIT_WIDTH + margin;
//	    drawDot(offSetX, offSetY);

//	    offSetX += DOT_SIZE + margin;
//	    drawDigit(offSetX,offSetY,millisecondHundreds.getLEDs());
//
//	    offSetX += Digit.DIGIT_WIDTH + margin;
//	    drawDigit(offSetX,offSetY,millisecondTens.getLEDs());
//
//	    offSetX += Digit.DIGIT_WIDTH + margin;
//	    drawDigit(offSetX,offSetY,millisecondUnits.getLEDs());
	    
	    g2.setStroke(new BasicStroke(1.0f));
	    g2.setColor(Color.BLACK);
	    for(int i=0; i<getDisplayHeight(); i++) {
	    	if ( i % 2 == 0) {
	    		g2.drawLine(0, i, getDisplayWidth(), i);
	    	}
	    }
	}
	
	public void setHourTens(int index)
	{
		hourTens = new Digit(index);
	}
	public void setHourUnits(int index)
	{
		hourUnits = new Digit(index);
	}

	public void setMinuteTens(int index)
	{
		minuteTens = new Digit(index);
	}
	public void setMinuteUnits(int index)
	{
		minuteUnits = new Digit(index);
	}

	public void setSecondTens(int index)
	{
		secondTens = new Digit(index);
	}
	public void setSecondUnits(int index)
	{
		secondUnits = new Digit(index);
	}

	public void setMillisecondHundreds(int index)
	{
		millisecondHundreds = new Digit(index);
	}
	public void setMillisecondTens(int index)
	{
		millisecondTens = new Digit(index);
	}
	public void setMillisecondUnits(int index)
	{
		millisecondUnits = new Digit(index);
	}
	
	private int getDisplayWidth()
	{
		return (scale * ((margin * 3) + DOT_SIZE)) +  (Digit.DIGIT_WIDTH + margin) * scale * 6;//(margin * 2) +
	}
	
	private int getDisplayHeight()
	{
		return (Digit.DIGIT_HEIGHT + margin) * scale;//margin + 
	}
	
	@Override
    public  Dimension getPreferredSize()
	{
        return new Dimension(getDisplayWidth(), getDisplayHeight()); // scale*((margin*2)+DOT_SIZE)+
    }
}
