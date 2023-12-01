package StepDefinitions;


import TestBase.testbase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ServiceHooks {
 public testbase base;
 @Before
 public void initbrowser() {
 base= new testbase();
 base.selectBrowser("chrome");
 
 }
 @After
 public void TearDown(){
 // driver.close();
}
}
