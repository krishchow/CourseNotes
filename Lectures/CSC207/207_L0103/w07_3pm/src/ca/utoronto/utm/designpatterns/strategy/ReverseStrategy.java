package ca.utoronto.utm.designpatterns.strategy;

public class ReverseStrategy implements CompareStrategy {

	@Override
	public int compare(String s1, String s2) {
		if(s1.compareTo(s2)<0)return this.GREATER;
		if(s1.compareTo(s2)>0)return this.LESS;
		return this.EQUAL;
	}

}
