package org.issi.pages;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.issi.constants.FrameworkConstants;
import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.issi.factory.ExplicitWaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class BasePage {

    /*
     * ##############################################################
     *
     * @Descriptions --- Logger
     *
     * ##############################################################
     */
    public static Logger log(){
        Logger logger = Logger.getLogger("SPDAP");
        PropertyConfigurator.configure(FrameworkConstants.getLoggerPath());
        return logger;
    }

    /*
     * ##############################################################
     *
     * @Descriptions --- either Click on Element directly or by using Javascript
     *
     * @param driver -- WebDriver parameter
     *
     * @param xpathExpress -- xpath of the Web Element
     * ##############################################################
     */
    public static void clickOn(By by, WaitStrategy waitstrategy, String elementName) {
        WebElement element = ExplicitWaitFactory.performExplicitWait(by, waitstrategy);
        try {
            element.click();
        }catch (Exception e){
            JavascriptExecutor js = (JavascriptExecutor)DriverManager.getDriver();
            js.executeScript("arguments[0].click();",element);
        }
        log().info(" Clicked on " +elementName );
    }

    /*
     * ##############################################################
     *
     * @Descriptions --- Click on Element by using actions
     *
     * @param driver -- WebDriver parameter
     *
     * @param xpathExpress -- xpath of the Web Element
     * ##############################################################
     */
    public static void clickOnAction(By by,WaitStrategy waitStrategy,String elementName){
        Actions act = new Actions(DriverManager.getDriver());
        act.moveToElement(DriverManager.getDriver().findElement(by)).click().perform();
    }

    /*
     * ################################################
     *
     * @Descriptions ---Enters the text in a field
     *
     * @param driver -- WebDriver parameter
     *
     * @param xpathExpress -- xpath of the Web Element
     * ################################################
     */
    public static void enterText(By by, String value,WaitStrategy waitstrategy, String elementName) {
        WebElement element =ExplicitWaitFactory.performExplicitWait(by, waitstrategy);
        element.sendKeys(value);
        log().info("Entered " + elementName + " as " + value+ "");
    }

    /*
     * #####################################################
     *
     * @Descriptions --- Select the value from the Dropdown
     *
     * @param driver -- WebDriver parameter
     *
     * @param xpathExpress -- xpath of the Web Element
     * ####################################################
     */
    public static void selectFromDrpDwn(By by,WaitStrategy waitStrategy,String value,String elementName){
        DriverManager.getDriver().findElement(by);
        WebElement element = ExplicitWaitFactory.performExplicitWait(by, waitStrategy);
        element.click();
        Select select = new Select(element);
        List<WebElement> allOptions = select.getOptions();
        for (int i=0;i<allOptions.size();i++){
            WebElement option = allOptions.get(i);
            String optionValue = option.getText();
            if (optionValue.equalsIgnoreCase(value)){
                select.selectByVisibleText(value);
                break;
            }
        }
        log().info("selected  "+elementName+" as "+value);
    }

    /*
     * ################################################
     *
     * @Descriptions --- select Date in calander pop-up
     *
     * ################################################
     */
    public static void selectDate(By by,WaitStrategy waitStrategy){
        DriverManager.getDriver().findElement(by);
        WebElement element = ExplicitWaitFactory.performExplicitWait(by, waitStrategy);
        element.click();
    }

    /*
     * ##############################################################
     *
     * @Descriptions --- scroll to Element
     *
     * @param driver--WebDriver
     *
     * @param xpathExpress- xpath expression of the element
     * ##############################################################
     */
    public static void scrollByElement(By by,WaitStrategy waitstrategy){
        WebElement element = ExplicitWaitFactory.performExplicitWait(by, waitstrategy);
        element = DriverManager.getDriver().findElement(by);
        ((JavascriptExecutor)DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView();",element);
    }

    /*
     * ##############################################################
     *
     * @Descriptions --- switch To Window
     *
     * @param driver--WebDriver
     *
     * @param xpathExpress- xpath expression of the element
     * ##############################################################
     */
    public static String switchToWindow(String previousWindowId){
        Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!previousWindowId.equals(windowHandle)) {
                DriverManager.getDriver().switchTo().window(windowHandle);
            }
        }
        return DriverManager.getDriver().getWindowHandle();
    }

    /*
     * ################################################
     *
     * @Descriptions ---Iterating the Drop Down values
     *
     * @param driver -- WebDriver parameter
     *
     * @param xpathExpress -- xpath of the Web Element
     * ################################################
     */
    public static void menuItemDrpDwn(By by, String enterMenuItem){
        try {
            List<WebElement> menuList = DriverManager.getDriver().findElements(by);
            for (int i = 0; i < menuList.size(); i++) {
                String menuItem = menuList.get(i).getText();
                if (menuItem.equals(enterMenuItem)) {
                    menuList.get(i).click();
                    System.out.println("Selected "+enterMenuItem+" option from menu");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * ##############################################################
     *
     * @Descriptions --- MoveToElement
     *
     * @param driver--WebDriver
     *
     * @param xpathExpress- xpath expression of the element
     * ##############################################################
     */
    public static void mouseOver(By by,WaitStrategy waitstrategy,String elementName){
        try {
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("arguments[0].scrollIntoView(true);", DriverManager.getDriver().findElement(by));
            WebElement element =ExplicitWaitFactory.performExplicitWait(by, waitstrategy);
        } catch (Exception e) {
            WebElement element =ExplicitWaitFactory.performExplicitWait(by, waitstrategy);
            element = DriverManager.getDriver().findElement(by);
            Actions action = new Actions(DriverManager.getDriver());
            action.moveToElement(element).build().perform();
            System.out.println("Mouse overed on "+elementName+"");
        }

    }

    /*
     * #####################################################
     *
     * @Descriptions --- function to pause the particular element
     *
     * @param millisecond the wait time in millisecond
     * #####################################################
     */
    public static void waitupto(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
     * #####################################################
     *
     * @Descriptions --- get title of the web-page
     *
     * #####################################################
     */
    public static String getPage_Title() {
        return DriverManager.getDriver().getTitle();
    }
}
