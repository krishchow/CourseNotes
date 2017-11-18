package ca.utoronto.utm.designpatterns.strategy;

import java.util.ArrayList;

public class OrderedStringList {
	private ArrayList<String> list = new ArrayList<String>();
	private CompareStrategy strategy;
	
	public OrderedStringList(){
		this(new NormalStringCompare());
	}
	
	public OrderedStringList(CompareStrategy strategy){
		this.strategy=strategy;
	}
	
	public void add(String s){
		for(int i=0;i<list.size();i++){
			if(strategy.compare(s, list.get(i))==CompareStrategy.LESS){
				list.add(i, s);
				return;
			}
		}
		list.add(s);
	}
	
	public String toString(){
		String result="[";
		for(String s:list){
			result = result+s+",";
		}
		return result+"]";
	}
	
	private void addStrings(String [] strings){
		for(String s:strings)this.add(s);
	}
	
	private static void staticAddStrings(String [] strings, OrderedStringList l){
		for(String s:strings)l.add(s);
	}
			
	public static void main(String[] args){
		String [] strings = {"this", "that", "a", "arnold", "bob", "something", "other" };
		OrderedStringList o1=new OrderedStringList();
		OrderedStringList o2=new OrderedStringList(new ReverseStringCompare());
		OrderedStringList o3=new OrderedStringList(new LengthStringCompare());
		OrderedStringList o4=new OrderedStringList(new NormalStringCompare());
		
		staticAddStrings(strings,o1);
		o2.addStrings(strings);
		o3.addStrings(strings);
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		
		
		
	}
}
