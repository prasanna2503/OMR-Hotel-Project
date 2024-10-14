package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.omrbranch.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookClass extends BaseClass{
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		browserLaunch(getPropertyFileValue("browser"));
		enterApplnUrl(getPropertyFileValue("url"));
		maximizeWindow();
		implicitWait();

	}

	@After
	public void afterScenario(Scenario scenario) {

//		if (scenario.isFailed()) {
//
//			scenario.attach(screenshot(), "images/png", "Every Scenario");
//		}
//		closeWindow();

	}
}
