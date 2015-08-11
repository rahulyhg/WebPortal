package vit.webportal.Suite;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestSuite {
	
	public TestSuite(String[] testcases) {
		/*XmlSuite suite = new XmlSuite();
		suite.setName("TmpSuite");
		 
		XmlTest test = new XmlTest(suite);
		test.setName("TmpTest");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		for(String testcase : testcases){
			classes.add(new XmlClass("com.vit.testcases."+testcase));
			test.setXmlClasses(classes) ;
		}
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();*/

			System.out.println("hello world");
	}
}
