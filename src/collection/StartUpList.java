package collection;

import java.util.ArrayList;
import java.util.List;

public class StartUpList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a = new ArrayList<String>();
	
		a.add("50");
		a.add("Practice");
		a.add("s");
		a.add(0, "Serial");
		a.set(2, "print");
	
		for(int i =0;i<a.size();i++)
		System.out.println(a.get(i));
	
	}

}
