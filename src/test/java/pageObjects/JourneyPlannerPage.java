package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JourneyPlannerPage  {

    public WebDriver driver;
    public JourneyPlannerPage(WebDriver driver)
    {
        this.driver = driver;

    }
By Acceptcookies= By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    By Fromlocation=By.id("InputFrom");
    By Tolocation=By.id("InputTo");
    By CDP=By.xpath("//a[@class='change-departure-time']");
    By Sdate= By.xpath("//select[@id='Date']//option[@value='20231205']");
    By Stime=By.xpath("//select[@id='Time']//option[@value='1100']");
    By leavingenable=By.xpath("//li[@class='selected']//label");
    By clickplanjourneybutton=By.id("plan-journey-button");
    By Journeyresults= By.cssSelector("#plan-a-journey > div.journey-result-summary > div:nth-child(2) > strong");
    By Homebtn=By.xpath("//span[text()='Home']");
    By recenttab=By.xpath("//li[@id='jp-recent-tab-home']");
   By linktext=By.xpath("//a[@class='plain-button journey-item'][1]");

    public  void  Navigate(String url){
      //  driver.navigate().to(url);
      driver.get(url);
      driver.manage().window().maximize();
  }
public void ClickonCookies()
{

    driver.findElement(Acceptcookies).click();
}
public String PageTitle()
{
   String title= driver.getTitle();
   return title;
}
public void enterpostcode(String fl)
{
    driver.findElement(Fromlocation).sendKeys(fl);

}
public void Topostcode(String tl)
{
    driver.findElement(Tolocation).sendKeys(tl);
}
public void changedepTime()
{
    driver.findElement(CDP).click();
}
public void changeDate()
{
    driver.findElement(Sdate).click();
}
public void changeTime()
{
    driver.findElement(Stime).click();
}
public boolean TabEnabled()
{
    return driver.findElement(leavingenable).isEnabled();
}
public void clickOnJourneyPlanButton()
{
    driver.findElement(clickplanjourneybutton).click();
}
public String JourneyplannedResults()
{
    String text=driver.findElement(Journeyresults).getText();
    return text;
}
public void ClickHomebtn()
{ WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    wait.until(ExpectedConditions.presenceOfElementLocated((Homebtn))).click();

}
public void Clickrecenttab()
{ WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    wait.until(ExpectedConditions.presenceOfElementLocated((recenttab))).click();

}
public void Navigateback()
{
    driver.navigate().back();
}
public void Navigateforward()
{

    driver.navigate().forward();
}
public String Recenttabinfo()
{
    return driver.findElement(linktext).getText();
}
}
