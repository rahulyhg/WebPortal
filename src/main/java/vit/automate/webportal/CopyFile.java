package vit.automate.webportal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	
	InputStream inStream = null;	
	OutputStream outStream = null;
	
	File first_file = null;
	File second_file = null;			
	
	public void copy(){
		
		try{
			     	 
    	    inStream = new FileInputStream("D:\\javathing\\WebPortal\\test-output\\emailable-report.html");
    	    outStream = new FileOutputStream("D:\\javathing\\WebPortal\\src\\main\\webapp\\report.jsp");
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    //copy the file content in bytes 
    	    while ((length = inStream.read(buffer)) > 0){
 
    	    	outStream.write(buffer, 0, length);
 
    	    }
 
    	    inStream.close();
    	    outStream.close();
 
    	    System.out.println("File is copied successful!");
 
    	}catch(IOException e){
    		e.printStackTrace();
    	}
	}
	
}
