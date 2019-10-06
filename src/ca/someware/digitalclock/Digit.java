package ca.someware.digitalclock;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Digit implements IDigit
{

	private static final Map<Integer,String[][]> digitsText;
	private static final Map<Integer,Boolean[]> digits;
	
	static {
		Map<Integer,String[][]> digitTextMap = new HashMap<Integer, String[][]>();
		digitTextMap.put(0, digitText0);
		digitTextMap.put(1, digitText1);
		digitTextMap.put(2, digitText2);
		digitTextMap.put(3, digitText3);
		digitTextMap.put(4, digitText4);
		digitTextMap.put(5, digitText5);
		digitTextMap.put(6, digitText6);
		digitTextMap.put(7, digitText7);
		digitTextMap.put(8, digitText8);
		digitTextMap.put(9, digitText9);
		digitsText = Collections.unmodifiableMap(digitTextMap);
		
		 Map<Integer,Boolean[]> digitsMap = new HashMap<Integer, Boolean[]>();
		 digitsMap.put(0, digit0);
		 digitsMap.put(1, digit1);
		 digitsMap.put(2, digit2);
		 digitsMap.put(3, digit3);
		 digitsMap.put(4, digit4);
		 digitsMap.put(5, digit5);
		 digitsMap.put(6, digit6);
		 digitsMap.put(7, digit7);
		 digitsMap.put(8, digit8);
		 digitsMap.put(9, digit9);
		 digits = Collections.unmodifiableMap(digitsMap);
	}
	
	private String[][] digitText = new String[DIGIT_TEXT_WIDTH][DIGIT_TEXT_HEIGHT];
	private int index;
	
	public Digit() {
		this.digitText = digitText0;
	}
	
	public Digit(int index) {
		this.index = index;
		this.digitText = digitsText.get(index);
	}
	
	public static Boolean[] LEDArray(int index) {
		return digits.get(index);
	}
	
	public Boolean[] getLEDs() {
		return digits.get(this.index);
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public String[][] getOutput() {
		return this.digitText;
	}
}
