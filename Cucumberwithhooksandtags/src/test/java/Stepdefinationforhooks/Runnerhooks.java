package Stepdefinationforhooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

//tags like: tags= "@regressionTest or @smokeTest")
@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources",glue= {"Stepdefinationforhooks"},
plugin= {"pretty","json:JSONREPORT/report.json","html:HtmlRepoert/report","junit:JunitReport/report.xml"},
tags= " @smokeTest or  @saintyTest or @regressionTest or @saladTest")



public class Runnerhooks {

}
