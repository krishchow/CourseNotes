package ca.utoronto.utm.designpatterns.strategy;

public class LengthStringCompare implements CompareStrategy {

	@Override
	public int compare(String s1, String s2) {
		if(s1.length()<s2.length())return this.LESS;
		if(s1.length()>s2.length())return this.GREATER;
		return this.EQUAL;
	}

}
