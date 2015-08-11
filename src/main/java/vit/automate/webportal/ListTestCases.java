package vit.automate.webportal;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListTestCases {
	public List<String> testCases(){
		
		List<String> temp_list = new ArrayList<String>();
		Path dir = Paths.get("D:\\javathing\\WebPortal\\src\\main\\java\\com\\vit\\testcases");
		
		try {
			DirectoryStream<Path> stream = Files.newDirectoryStream(dir,"*.{java,class,jar}");
		    for (Path file: stream) {
		       // System.out.println(file.getFileName().toString());
		        temp_list.add(file.getFileName().toString());
		    }
		    
		} catch (Exception e) {
		    // IOException can never be thrown by the iteration.
		    // In this snippet, it can only be thrown by newDirectoryStream.
		    System.err.println(e);
		    return null;
		}
		
		return temp_list;
	}
}
