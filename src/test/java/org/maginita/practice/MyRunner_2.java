package org.maginita.practice;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/resources/features/Guru.feature",
glue = "gluecode",
plugin = {"pretty","html:target/myresults"},monochrome =true)
public class MyRunner_2
{

}
