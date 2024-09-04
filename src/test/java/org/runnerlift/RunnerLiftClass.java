package org.runnerlift;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\DELL\\eclipse-workspace\\CucumberNibavLift\\src\\test\\resources\\FeatureFile",
glue="org\\stepdefinition",dryRun=false)
public class RunnerLiftClass {

}
