package ca.someware.digitalclock;

public interface IDigit {
	
	public static final int DIGIT_TEXT_WIDTH = 3;
	public static final int DIGIT_TEXT_HEIGHT = 5;
	
	public static final int DIGIT_WIDTH = 20;
	public static final int DIGIT_HEIGHT = 40;
	
	public static final String HORIZON = "─";
	public static final String VERTICAL = "│";
	public static final String EMPTY = " ";

//	   0
//	   ─
//	1 │ │ 5
//	   ─ 6
//	2 │ │ 4
//	   ─
//     3
	
	//	 ─
	//	│ │
	//	 
	//	│ │
	//	 ─
	public static final Boolean[] digit0 = new Boolean[]{true,true,true,true,true,true,false};
	public static final String[][] digitText0 = new String[][]{
		{EMPTY,HORIZON,EMPTY},
		{VERTICAL,EMPTY,VERTICAL},
		{EMPTY,EMPTY,EMPTY},
		{VERTICAL,EMPTY,VERTICAL},
		{EMPTY,HORIZON,EMPTY}
	};
	
	//	 
	//	  │
	//	 
	//	  │
	//	 
	public static final Boolean[] digit1 = new Boolean[]{false,false,false,false,true,true,false};
	public static final String[][] digitText1 = new String[][]{
		{EMPTY,EMPTY,EMPTY},
		{EMPTY,EMPTY,VERTICAL},
		{EMPTY,EMPTY,EMPTY},
		{EMPTY,EMPTY,VERTICAL},
		{EMPTY,EMPTY,EMPTY}
	};
	
	//	 ─
	//	  │
	//	 ─
	//	│  
	//	 ─
	public static final Boolean[] digit2 = new Boolean[]{true,false,true,true,false,true,true};
	public static final String[][] digitText2 = new String[][]{
		{EMPTY   ,HORIZON,EMPTY},
		{EMPTY   ,EMPTY  ,VERTICAL},
		{EMPTY   ,HORIZON,EMPTY},
		{VERTICAL,EMPTY  ,EMPTY},
		{EMPTY   ,HORIZON,EMPTY}
	};
	
	//	 ─
	//	  │
	//	 ─
	//	  │
	//	 ─
	public static final Boolean[] digit3 = new Boolean[]{true,false,false,true,true,true,true};
	public static final String[][] digitText3 = new String[][]{
		{EMPTY,HORIZON,EMPTY},
		{EMPTY,EMPTY  ,VERTICAL},
		{EMPTY,HORIZON,EMPTY},
		{EMPTY,EMPTY  ,VERTICAL},
		{EMPTY,HORIZON,EMPTY}
	};
	
	//	 
	//	│ │
	//	 ─
	//	  │
	//	 
	public static final Boolean[] digit4 = new Boolean[]{false,true,false,false,true,true,true};
	public static final String[][] digitText4 = new String[][]{
		{EMPTY   ,EMPTY  ,EMPTY},
		{VERTICAL,EMPTY  ,VERTICAL},
		{EMPTY   ,HORIZON,EMPTY},
		{EMPTY   ,EMPTY  ,VERTICAL},
		{EMPTY   ,EMPTY  ,EMPTY}
	};
	
	//	 ─
	//	│ 
	//	 ─
	//	  │
	//	 ─
	public static final Boolean[] digit5 = new Boolean[]{true,true,false,true,true,false,true};
	public static final String[][] digitText5 = new String[][]{
		{EMPTY   ,HORIZON,EMPTY},
		{VERTICAL,EMPTY  ,EMPTY},
		{EMPTY   ,HORIZON,EMPTY},
		{EMPTY   ,EMPTY  ,VERTICAL},
		{EMPTY   ,HORIZON,EMPTY}
	};
	
	//	 ─
	//	│ 
	//	 ─
	//	│ │
	//	 ─
	public static final Boolean[] digit6 = new Boolean[]{true,true,true,true,true,false,true};
	public static final String[][] digitText6 = new String[][]{
		{EMPTY,HORIZON,EMPTY},
		{VERTICAL,EMPTY,EMPTY},
		{EMPTY,HORIZON,EMPTY},
		{VERTICAL,EMPTY,VERTICAL},
		{EMPTY,HORIZON,EMPTY}
	};
	
	//	 ─
	//	  │
	//	 
	//	  │
	//	 
	public static final Boolean[] digit7 = new Boolean[]{true,false,false,false,true,true,false};
	public static final String[][] digitText7 = new String[][]{
		{EMPTY,HORIZON,EMPTY},
		{EMPTY,EMPTY,VERTICAL},
		{EMPTY,EMPTY,EMPTY},
		{EMPTY,EMPTY,VERTICAL},
		{EMPTY,EMPTY,EMPTY}
	};
	
	//	 ─
	//	│ │
	//	 ─
	//	│ │
	//	 ─
	public static final Boolean[] digit8 = new Boolean[]{true,true,true,true,true,true,true};
	public static final String[][] digitText8 = new String[][]{
		{EMPTY,HORIZON,EMPTY},
		{VERTICAL,EMPTY,VERTICAL},
		{EMPTY,HORIZON,EMPTY},
		{VERTICAL,EMPTY,VERTICAL},
		{EMPTY,HORIZON,EMPTY}
	};
	
	//	 ─
	//	│ │
	//	 ─
	//	  │
	//	 ─
	public static final Boolean[] digit9 = new Boolean[]{true,true,false,true,true,true,true};
	public static final String[][] digitText9 = new String[][]{
		{EMPTY,HORIZON,EMPTY},
		{VERTICAL,EMPTY,VERTICAL},
		{EMPTY,HORIZON,EMPTY},
		{EMPTY,EMPTY,VERTICAL},
		{EMPTY,HORIZON,EMPTY}
	};
}
