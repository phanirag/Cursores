// it is bi - directional courser
// it is used only for List objects
// it is used for add, replace, remove , read operations
// methods :  hasNext(), next(), nextIndex(), hasPrevious(), previous() ,previousIndex(), remove(), set(), add().

package ListIteroator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listItortor {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		for(int i = 0;i<= 10;i++){
			l.add(i);
		}
		
		ListIterator li =l.listIterator();
		while(li.hasNext()){
			int o = (int) li.next();
			if(o == 9)
				li.set(90);
		}
		li.add(33);
		System.out.println(l.toString());
		
	}

}
