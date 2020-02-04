package simpleobjtojsonconverter;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Tester {

	public static void main(String[ ] arg)
	{
		try {
			 // Create ObjectMapper
		ObjectMapper mapper=new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
      Student s=new Student();
      s.setId(100);
      s.setFirstName("sai");
      s.setLastName("bv");
      // Convert object to JSON string
      String json = mapper.writeValueAsString(s);
      System.out.println(json);
	   }
		catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}
      