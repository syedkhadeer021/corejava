package net.konic.corejava.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
	
	
	
	public static void main(String[] args) {
	Set set = new LinkedHashSet();
	set.add("khadeer");
	set.add(1);
	set.add(null);
	set.add("syed");
	set.add("syed");
	System.out.println(set);
	set.remove(0);
	System.out.println(set);
	}

}
