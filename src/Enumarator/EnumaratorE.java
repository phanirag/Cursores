// it is used only for legecy classes (vector and stack (1.0v))
// it can only do read operation
// methods : hasMoreElements() , nextElement().
package Enumarator;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class EnumaratorE {

	public static void main(String[] args) {
		
		vectorEnum();
		stackEnum();
	}

	private static void stackEnum() {
		Stack s = new Stack();
		for(int i=0;i<=10;i++){
			s.add(i);
		}
		Enumeration e = s.elements();
		while(e.hasMoreElements()){
			int p = (int) e.nextElement();
			System.out.println(p +" stack");
		}
	}

	private static void vectorEnum() {
		Vector v = new Vector();
		for(int i=0;i<=10;i++){
			v.add(i);
		}
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			int p = (int) e.nextElement();
			System.out.println(p +" vector");
		}
	}
}
