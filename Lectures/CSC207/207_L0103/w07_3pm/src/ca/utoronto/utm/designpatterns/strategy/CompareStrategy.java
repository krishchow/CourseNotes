package ca.utoronto.utm.designpatterns.strategy;

public interface CompareStrategy {
	public static final int LESS=-1;
	public static final int EQUAL=0;
	public static final int GREATER=1;
	
	public int compare(String s1, String s2);
}
