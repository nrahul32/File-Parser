package nrahul32;

public enum OptionToSort {
	NAME(2),
	ROLLNO(1),
	TOTAL(3);
	
	int index;
	
	private OptionToSort(int i){
		this.index = i;
	}
	
	public static OptionToSort getOption(int i){
		
		if(i == 1){ return ROLLNO;}
		else if(i == 2){ return NAME;}
		else if(i == 3){ return TOTAL;}
        else throw new IllegalArgumentException();
	}
}
