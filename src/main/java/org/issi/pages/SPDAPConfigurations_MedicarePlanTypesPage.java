package org.issi.pages;

import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class SPDAPConfigurations_MedicarePlanTypesPage extends  BasePage{
    public static Actions action;

    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAPConfiguration
     * Sub-mobule name --->Medicare Plan Types
     * Pages --> Medicare Plan Types Elements
     *
     * ##############################################################
     */

    public SPDAPConfigurations_MedicarePlanTypesPage() {

    }
    public  final static By clickONSPDAPConfigurations=By.xpath("//a[contains(text(),'SPDAP Configurations')]");
    public static void clickOnSPDAPConfigurations(){
        action = new Actions(DriverManager.getDriver());
        WebElement mainMenu = DriverManager.getDriver().findElement(clickONSPDAPConfigurations);
        action.moveToElement(mainMenu);
    }

    public static final By clickOnMedicarePlan=By.xpath("//a[contains(text(),'Medicare Plan Types')]");
    public static void clickOnMedicarePlan(){
        clickOnSPDAPConfigurations();
        WebElement mainMenu2 =DriverManager.getDriver().findElement(clickOnMedicarePlan);
        action.moveToElement(mainMenu2).click().build().perform();
    }

    public static final By clickOnaddnewRole=By.xpath("//a[@id='addnewRole']");
    public static void clickOnaddnewRole(){
        waitupto(1000);
        clickOn(clickOnaddnewRole, WaitStrategy.CLICKABLE,"Add New Role");
        waitupto(1000);
    }

    public static final By OrganizationNameSelect=By.xpath("//select[@id='txtDrug_Company']");
    public static void selectOrganizationName(String OrganizationName){
        selectFromDrpDwn(OrganizationNameSelect,WaitStrategy.CLICKABLE,OrganizationName,"Organization Name ->");
        waitupto(1000);
    }

    public static final By PlanNameText=By.xpath("//input[@id='txtID_MedicareDrugPlan']");
    public static void enterDocumentName(String PlanName){
        enterText(PlanNameText,PlanName,WaitStrategy.PRESENCE,"Plan Name ->");
        waitupto(1000);
    }

    public static final By ContractIDText=By.xpath(" //input[@id='txtCONTACT_id']");
    public static void enterContractID(String ContractID){
        enterText(ContractIDText,ContractID,WaitStrategy.PRESENCE,"Contract ID ->");
        waitupto(1000);
    }

    public static final By PlanIDText=By.xpath("//input[@id='txtPerscr_B_Plan']");
    public static void enterPlanID(String PlanID){
        enterText(PlanIDText,PlanID,WaitStrategy.PRESENCE,"Plan ID ->");
        waitupto(1000);
    }

    public static final By PartCText=By.xpath("//input[@id='txtPartc']");
    public static void enterPartC(String PartC){
        enterText(PartCText,PartC,WaitStrategy.PRESENCE,"PartC ->");
        waitupto(1000);
    }
    public static final By PlanDBasicText=By.xpath("//input[@id='txtPartDBasic']");
    public static void enterPlanDBasic(String PlanDBasic){
        enterText(PlanDBasicText,PlanDBasic,WaitStrategy.PRESENCE,"PlanD Basic ->");
        waitupto(1000);
    }
    public static final By PartDSuppText=By.xpath("//input[@id='txtPartDSupp']");
    public static void enterPartDSupp(String PartDSupp){
        enterText(PartDSuppText,PartDSupp,WaitStrategy.PRESENCE,"PartD Supp ->");
        waitupto(1000);
    }
    public static final By PlanDTotalText=By.xpath("//input[@id='txtPartDTotal']");
    public static void enterPlanDTotal(String PlanDTotal){
        enterText(PlanDTotalText,PlanDTotal,WaitStrategy.PRESENCE,"PlanD Total ->");
        waitupto(1000);
    }
    public static final By PartD100LISText=By.xpath("//input[@id='txtPartD100LIS']");
    public static void enterPartD100LIS(String PartD100LIS){
        enterText(PartD100LISText,PartD100LIS,WaitStrategy.PRESENCE,"PartD 100LIS ->");
        waitupto(1000);
    }
    public static final By PlanD75LISText=By.xpath("//input[@id='txtPartD75LIS']");
    public static void enterPlanD75LIS(String PlanD75LIS){
        enterText(PlanD75LISText,PlanD75LIS,WaitStrategy.PRESENCE,"Plan D75LIS ->");
        waitupto(1000);
    }
    public static final By PartD50LISText=By.xpath(" //input[@id='txtPartD50LIS']");
    public static void enterPartD50LIS(String PartD50LIS){
        enterText(PartD50LISText,PartD50LIS,WaitStrategy.PRESENCE,"PartD 50LIS ->");
        waitupto(1000);
    }
    public static final By PlanD25LISText=By.xpath(" //input[@id='txtPartD25LIS']");
    public static void enterPlanD25LIS(String PlanD25LIS){
        enterText(PlanD25LISText,PlanD25LIS,WaitStrategy.PRESENCE,"PlanD 25LIS ->");
        waitupto(1000);
    }
    public static final By SPDAPSub0LISText=By.xpath(" //input[@id='txtSPDAPSub0LIS']");
    public static void enterSPDAPSub0LIS(String SPDAPSub0LIS){
        enterText(SPDAPSub0LISText,SPDAPSub0LIS,WaitStrategy.PRESENCE,"SPDAP Sub0LIS ->");
        waitupto(1000);
    }
    public static final By SPDAPSub25LISText=By.xpath("//input[@id='txtSPDAPSub25LIS']");
    public static void enterSPDAPSub25LIS(String SPDAPSub25LIS){
        enterText(SPDAPSub25LISText,SPDAPSub25LIS,WaitStrategy.PRESENCE,"SPDAP Sub25LIS ->");
        waitupto(1000);
    }
    public static final By SPDAPSub50LISText=By.xpath("//input[@id='txtSPDAPSub50LIS']");
    public static void enterSPDAPSub50LIS(String SPDAPSub50LIS){
        enterText(SPDAPSub50LISText,SPDAPSub50LIS,WaitStrategy.PRESENCE,"SPDAP Sub50LIS ->");
        waitupto(1000);
    }
    public static final By SPDAPSub75LISText=By.xpath("//input[@id='txtSPDAPSub75LIS']");
    public static void enterSPDAPSub75LIS(String SPDAPSub75LIS){
        enterText(SPDAPSub75LISText,SPDAPSub75LIS,WaitStrategy.PRESENCE,"SPDAP Sub75LIS ->");
        waitupto(1000);
    }
    public static final By ConPlanIDText=By.xpath("//input[@id='txtConPlanID']");
    public static void enterConPlanID(String ConPlanID){
        enterText(ConPlanIDText,ConPlanID,WaitStrategy.PRESENCE,"ConPlan ID ->");
        waitupto(1000);
    }


    private static final By savebtn = By.xpath("//input[@value='Save']");
    private static final By canclebtn = By.xpath(" //input[@value='Cancel']");
    public static void clickOnButtonsInMediacrePlan(){
        waitupto(1000);
        clickOn(savebtn,WaitStrategy.CLICKABLE,"Click on Save Button");
    }

    private static final By SearchOrganization = By.xpath("//input[@id='SearchLookupTypecode']");
    private static final By SearchPlan = By.xpath(" //input[@id='SearchLookupTypeName']");
    private static final By SearchContractID = By.xpath("  //input[@id='SearchLookupTypeDesc' and @placeholder='Contract ID']");
    private static final By SearchPlanID = By.xpath(" //input[@id='SearchLookupTypeDesc' and @placeholder='Plan ID']");

    public static void searchRecordInMedicarePlan(String searchValue,String value){
        if (searchValue.equalsIgnoreCase("Organization")){
            enterText(SearchOrganization,value,WaitStrategy.PRESENCE,"Search Organization ->");
        }else if (searchValue.equalsIgnoreCase("Plan")){
            enterText(SearchPlan,value,WaitStrategy.PRESENCE,"Search Plan ->");
        }else if (searchValue.equalsIgnoreCase("ContractID")){
            enterText(SearchContractID,value,WaitStrategy.PRESENCE,"Search ContractID ->");
        }else if (searchValue.equalsIgnoreCase("PlanID")){
            enterText(SearchPlanID,value,WaitStrategy.PRESENCE,"Search PlanID ->");
        }
    }

    private static final By clickOnBulkPrintbtn = By.xpath("//input[@value='Print']");
    public static void selectBulkPrintbtnMP(){

        clickOn(clickOnBulkPrintbtn,WaitStrategy.CLICKABLE,"Click On bulk print button to print all records");
        String printbtn = DriverManager.getDriver().getWindowHandle();
        Set<String> printbtn1 = DriverManager.getDriver().getWindowHandles();
        Iterator<String> printbt2 = printbtn1.iterator();
        while (printbt2.hasNext()) {
            String pt1 = printbt2.next();
            if (!printbtn.equals(pt1)) {
                DriverManager.getDriver().switchTo().window(pt1);
                waitupto(3000);
            }
        }
        DriverManager.getDriver().close();
        DriverManager.getDriver().switchTo().window(printbtn);
        waitupto(3000);
    }

    private static final By clickOnDeletebtn = By.xpath("//input[@value='Delete']");
    public static void selectDeletebtnMP(){
        clickOn(clickOnDeletebtn,WaitStrategy.CLICKABLE,"click on delect button to delete all records ");
        waitupto(1000);
        DriverManager.getDriver().switchTo().alert().accept();
    }

    private static final By clickOnPrintbtn = By.xpath("//a[@title='Print']");
    public static void clickOnPrintbtnMP(){

        clickOn(clickOnPrintbtn,WaitStrategy.CLICKABLE,"Click On print button");
        waitupto(1000);
    }

    private static final By selectAllCheckBox = By.xpath("//input[@id='chkSelectAll']");
    public static void selectCheckBox(){
        clickOn(selectAllCheckBox,WaitStrategy.CLICKABLE,"Select All Check Box");
        waitupto(1000);
    }
}