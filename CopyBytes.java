package comparable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
	private static FileInputStream f1 = null;
	static FileOutputStream f2 = null;
public static void main(String[] args)throws IOException{
	try {
		File ip=new File("myfargo.txt");
		File op=new File("outgain.txt");
		 f1=new FileInputStream("myfargo.txt");
		 f2=new FileOutputStream(op);
	    int b;
	    while ((b = f1.read()) != -1) {
	    	System.out.printf("%x\n", b);
            f2.write(b);
            
            
		}
        System.out.println("FileInputStream is used to read a file and FileOutPutStream is used for writing.");
	}
    finally {
			
			f1.close();
	        
			f2.close();
	
}
}}


