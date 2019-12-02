package CollibraRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

 
	@CucumberOptions(
			features = "src\\main\\java\\FeatureFiles" ,   //Path of the feature file
			glue = {"StepDefination"}	,	//Path of the step defination file
			//format = {"Pretty","html:test-output","json:json_output/cucumber.json"} , //
			monochrome = true , // display the console output in a proper readable format
			//strict = true ,// it will check if any step is not define in step definitation file
			dryRun = false , // to check the mapping is proper between feature file and step defination file
		 // tags = {"~@smokeTest" , "~@RegressionTest" , "~@EndtoEnd"}
			tags="@tag1"
			)
	
public class RunnerClass extends AbstractTestNGCucumberTests
{
		
		
	
}
