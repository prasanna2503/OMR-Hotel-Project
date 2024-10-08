package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import omr.branch.report.Reporting;

@RunWith(Cucumber.class)
@CucumberOptions(tags=("@Login"),dryRun = false, plugin = { "pretty","json:target//output.json" }, glue="com.omrbranch.stepdefinition", features="src\\test\\resources")

public class TestRunnerClass {
	
	@AfterClass
	public static void afterClass() {
		Reporting.generateJVMReport("C:\\Users\\LENOVO\\eclipse-workspace\\OMRBranchHotelProject\\target\\output.json");
	}
	
	
}
