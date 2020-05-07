package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Yogesh\\Codes\\CucumberPOM\\CucumberPOMProject\\src\\main\\java\\com\\qa\\features\\freecrm.feature",//path of the features file
        glue = {"com/qa/stepDefinitions" },// the path or name of the step definition file
        format = { "pretty", "html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml" },//to generate different types of reporting
        monochrome = true, // display the console output in proper readable format
        strict = false,//it will check if any step is not defined in step definition file
        dryRun = false
        
       // tags = {"~@SmokeTest" , "~@RegressionTest" , "~@End2End"}
        ) //if it is true then check if all the step definition mapped with feature file or not once dryrun = false then u can execute test cases


public class TestRunner {

}
