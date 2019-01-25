// iterators are used for collection objects
// it can read and remove data from collections
// it is also called as universal courser.
// methods: hasNext(), next(), remove().

package itorator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class itoratorE {

	public static void main(String[] args) {
		//listItorator();
		//setItorator();
		mapMethods();
		
	}

	private static void mapMethods() {
		Map<Integer, String> m = mapValues();
		//mapItorateusingForEach(m);
		//seperateKeysAndValues(m);
		//mapItorator(m);
		m.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v)); // lambda expression
	}

	private static void mapItorator(Map<Integer, String> m) {
		Iterator<Map.Entry<Integer, String>> i = m.entrySet().iterator();
		while(i.hasNext()){
			Map.Entry<Integer, String> e = i.next();
			System.out.println("Key = " + e.getKey() +  
                    ", Value = " + e.getValue());
		}
	}

	private static void seperateKeysAndValues(Map<Integer, String> m) {
		for(Integer i : m.keySet())
			System.out.println("Keys : "+i);
		
		for(String n : m.values())
			System.out.println("Values : "+n);
	}

	private static void mapItorateusingForEach(Map<Integer, String> m) {
		for (Map.Entry<Integer, String> e : m.entrySet()) {
			System.out.println("Key : "+e.getKey()+"  Value : "+e.getValue());
		}
	}

	private static Map<Integer, String> mapValues() {
		Map<Integer,String> m = new HashMap<Integer, String>();
		for(int i =0;i<= 10;i++){
			m.put(i, "value "+i);
		}
		return m;
	}

	private static void setItorator() {
		Set s = new HashSet();
		for(int i=0;i<=10;i++){
			s.add(i);
		}
		Iterator i = s.iterator();
		while (i.hasNext()) {
			int o = (int) i.next();
			if(o%2 == 0)
				System.out.println(o +" even");
			else
				i.remove();
		}
		System.out.println("Set values "+s.toString());
	}

	private static void listItorator() {
		List l = new ArrayList();
		for(int i=0;i<=10;i++){
			l.add(i);
		}
		Iterator i = l.iterator();
		while (i.hasNext()) {
			int o = (int) i.next();
			if(o%2 == 0)
				System.out.println(o +" even");
			else
				i.remove();
		}
		System.out.println("List Values "+l.toString());
	}

}
