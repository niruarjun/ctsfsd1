package Coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import java.util.ArrayList;

public class Binary {
	
		
		  
		
	


public static void main(String[] args)
{  //int a []= {1,232,34};
	//List<Integer> l= Arrays.asList(a);
	List<Integer>l =new ArrayList<Integer>();
	  l.add(1);
	  l.add(4);
	  l.add(0);
	
	int index=Collections.binarySearch(l, 4);
	if(index>=0)
	{
		System.out.println("found "+l.get(index));
	}
	else
	{
		System.out.println("not found "+index);
	}
	

}
	
	
}

