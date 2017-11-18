package w02;
import java.util.*;

public class HashMapExploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		for(int i = 0;i<10;i++){
			hm.put(i, "This is value "+i);
		}
		for(int k : hm.keySet()){
			System.out.println(k+" "+hm.get(k));
		}
		for(String v : hm.values()){
			System.out.println(v);
		}
		for(Map.Entry<Integer, String> e : hm.entrySet()){
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}

}
