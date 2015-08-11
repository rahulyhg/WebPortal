package vit.automate.webportal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import org.xml.sax.SAXException;

import com.vit.testcases.NewTest;

public class TestSuite {
	
	
	public TestSuite(String[] testcases) throws IOException, Exception, SAXException {
		
		// Running TestNG programmatically
        // http://testng.org/doc/documentation-main.html#running-testng-programmatically

        //Create an instance on TestNG
        TestNG testNG = new TestNG();

        //Create an instance of XML Suite and assign a name for it.
        XmlSuite suite = getXmlSuite();

        //Create an instance of XmlTest and assign a name for it.
        XmlTest test = getXmlTest(suite);

        //Add any parameters that you want to set to the Test.
       // test.setParameters(testngParams);

      //Create a list which can contain the classes that you want to run.
		 List<XmlClass> classes = new ArrayList<XmlClass> ();
		 		 		
		 
		 for(String testcase : testcases){
			String temp_class = "com.vit.testcases."+testcase;	
			//System.out.println(temp_class.trim());
			classes.add(new XmlClass(temp_class.trim()));			
		 }

        //Assign that to the XmlTest Object created earlier.
        test.setXmlClasses(classes);

        //Create a list of XmlTests and add the Xmltest you created earlier to it.
        List<XmlTest> tests = new ArrayList<XmlTest>();
        tests.add(test);

        //add the list of tests to your Suite.
        //suite.setTests(tests);

        //Add the suite to the list of suites.
        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);

        //Set the list of Suites to the testNG object you created earlier.
        testNG.setXmlSuites(suites);
        
        File file = new File("D:\\javathing\\WebPortal\\src\\main\\java\\com\\vit\\testcases\\demo.xml");
        //System.out.println(file);

        FileWriter writer = new FileWriter(file);
        writer.write(suite.toXml());
        writer.close();  
        
        List<String> ss = new ArrayList<String>();
        ss.add("D:\\javathing\\WebPortal\\src\\main\\java\\com\\vit\\testcases\\demo.xml");
        
        testNG.setTestSuites(ss);        
        
        testNG.setXmlSuites(new ArrayList<XmlSuite> (new Parser("D:\\javathing\\WebPortal\\src\\main\\java\\com\\vit\\testcases\\demo.xml").parse()));
        
		//testNG.addListener(tla);
        testNG.run();

	}
	
	public void test(){
		
		XmlSuite suite = new XmlSuite();
		suite.setName("TmpSuite");
		 
		XmlTest test = new XmlTest(suite);
		test.setName("TmpTest");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("com.vit.testcases.NewTest"));
		test.setXmlClasses(classes) ;
		
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();


	}
	
	
	
    private XmlSuite getXmlSuite() {
        XmlSuite suite = new XmlSuite();
        suite.setName("Test Suite");
        return suite;
    }

    private XmlTest getXmlTest(XmlSuite suite) {
        XmlTest test = new XmlTest(suite);
        test.setName("test_with_firefox");
        return test;
    }

   

}
