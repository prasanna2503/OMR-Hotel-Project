package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import omr.branch.report.Reporting;

@RunWith(Cucumber.class)
@CucumberOptions(tags=("@Search"),dryRun = false, plugin = { "pretty","json:target//output.json" },
							glue="com.omrbranch.stepdefinition", features="src\\test\\resources")

public class TestRunnerClass extends BaseClass {
	
	@AfterClass
	public static void afterClass() {
		Reporting.generateJVMReport(getProjectPath() +"\\target\\output.json");
	}	
	
}
