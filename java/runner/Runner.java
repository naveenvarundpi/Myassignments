package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/bdd/cucumber/createlead.feature"}, glue= {"steps"})
public class Runner extends AbstractTestNGCucumberTests{

}
