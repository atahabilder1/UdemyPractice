package Arraylist;

import java.nio.channels.NonReadableChannelException;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		System.out.println("This is test of arraylist");
		
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		arrayList.add(66);
		arrayList.add(33);
		arrayList.add(44);
		arrayList.add(55);
		arrayList.add(66);
		arrayList.add(77);
		arrayList.add(77);
		arrayList.add(77);
		arrayList.add(99);
		//System.out.println(arrayList);
		arrayList.add(2, 5);
		//System.out.println(arrayList);
		// arrayList.trimToSize();
		//System.out.println(arrayList.indexOf(44));
		//System.out.println(arrayList.lastIndexOf(77));
		//System.out.println(arrayList.size());
		System.out.println(arrayList);
		arrayList.remove(arrayList.size()-1);
		arrayList.remove(0);
		System.out.println(arrayList);
	}

}
