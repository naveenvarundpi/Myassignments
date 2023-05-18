package week7.day1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = {"src/main/java/week7/day1/salesforce.feature"}, 
glue= {"steps1","hookssales"},publish=true,tags="@Regression",monochrome=true)

public class Runner extends AbstractTestNGCucumberTests{
	
}
