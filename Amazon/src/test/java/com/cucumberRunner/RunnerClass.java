package com.cucumberRunner;

import org.junit.runner.RunWith;

import com.utility.Hooks;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features", glue = {
		"com.stepDefinations" })


public class RunnerClass extends Hooks{

}
