package ca.utoronto.utm.designpatterns.strategy;

public class NormalStringCompare implements CompareStrategy {

	@Override
	public int compare(String s1, String s2) {
		if(s1.compareTo(s2)<0)return this.LESS;
		if(s1.compareTo(s2)>0)return this.GREATER;
		return this.EQUAL;
	}

}
