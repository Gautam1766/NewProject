package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="Features",
		glue="StepDifination" ,
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/cucumber-reports/report3_html.html"}
		
		
		
		
		)

public class Run1 {

}
