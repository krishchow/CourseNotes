package ca.utoronto.utm.designpatterns.strategy;

import java.util.ArrayList;

public class OrderedStringArrayList {
	private ArrayList<String> list = new ArrayList<String>();
	private CompareStrategy strategy;
	
	public OrderedStringArrayList(){
		this(new NormalStrategy());
	}
	public OrderedStringArrayList(CompareStrategy strategy){
		this.strategy=strategy;
	}
	
	public void add(String s){
		for(int i=0;i<this.list.size(); i++){
			if(strategy.compare(s,this.list.get(i))==CompareStrategy.LESS){
				this.list.add(i, s);
				return;
			}
		}
		this.list.add(s);
	}
	
	public void addAll(String [] stuff){
		for(String e:stuff){
			this.add(e);
		}
	}
	
	public static void staticAddAll(String [] stuff, OrderedStringArrayList ol){
		for(String e:stuff){
			ol.add(e);
		}
	}
	public String toString(){
		String s="[";
		for(String e:this.list){
			s=s+e+",";
		}
		return s+"]";
	}
	public static void main(String [] args){
		String [] stuff = {"this", "that", "something", "a", "another", "them"};
		OrderedStringArrayList o1 = new OrderedStringArrayList();
		OrderedStringArrayList o2 = new OrderedStringArrayList(new ReverseStrategy());
		OrderedStringArrayList o3 = new OrderedStringArrayList(new LengthStrategy());

		staticAddAll(stuff, o1);
		o2.addAll(stuff);
		o3.addAll(stuff);
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);

		
		
		
		
	}
}
