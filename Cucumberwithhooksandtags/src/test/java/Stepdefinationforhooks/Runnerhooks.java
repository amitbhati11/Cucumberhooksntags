package Stepdefinationforhooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources",glue= {"Stepdefinationforhooks"},
plugin= {"pretty","json:JSONREPORT/report.json","html:HtmlRepoert/report","junit:JunitReport/report.xml"})



public class Runnerhooks {

}
