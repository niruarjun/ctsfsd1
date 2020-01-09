package Coll;

import java.util.Collections;
import java.util.LinkedList;

public class Link {
	private  LinkedList<String> list=new LinkedList();

	public void getSorted()
	{
		list.add("ram");
		list.add("vom");
		list.add("saj");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}
	public static void main(String[] args) {
		Link l=new Link();
		l.getSorted();
		// TODO Auto-generated method stub
		
		

	}

}
