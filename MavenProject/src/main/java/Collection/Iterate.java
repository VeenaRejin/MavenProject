package Collection;

import java.util.*;


public class Iterate {

	public static void main(String[] args) {
		ArrayList<String> it=new ArrayList<String>();
	    it.add("Veena");
	    it.add("Anu");
		it.add("Athira");
		it.add("Aswin");
		Iterator<String> s=it.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		
		}

	}

}
