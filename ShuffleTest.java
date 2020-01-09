package Coll;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]= {"sa","ind","ddhg","sdfd"};
		List<String> l=Arrays.asList(name);
		System.out.println("before shuffle");
		System.out.println(l);
		System.out.println("after shuffle");
		Collections.shuffle(l);
		System.out.println(l);
		
		
				
		}

	}


