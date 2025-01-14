import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Scenario_3/Page_/a_Sign In'), 0)

WebUI.click(findTestObject('Object Repository/Scenario_3/Page_/a_Sign In'))

WebUI.waitForElementPresent(findTestObject('Scenario_3/Page_Customer Login/input_Email_loginusername'), 0)

WebUI.setText(findTestObject('Object Repository/Scenario_3/Page_Customer Login/input_Email_loginusername'), GlobalVariable.UserID)

WebUI.waitForElementPresent(findTestObject('Scenario_3/Page_Customer Login/input_Password_loginpassword'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Scenario_3/Page_Customer Login/input_Password_loginpassword'), 
    GlobalVariable.Password)

WebUI.waitForElementPresent(findTestObject('Scenario_3/Page_Customer Login/span_Sign In'), 0)

WebUI.click(findTestObject('Object Repository/Scenario_3/Page_Customer Login/span_Sign In'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Scenario_3/Page_My Account/a_My Cart                    1             _241c1f'), 
    0)

WebUI.click(findTestObject('Scenario_3/Page_My Account/a_My Cart                    1             _241c1f'))

WebUI.waitForElementPresent(findTestObject('Scenario_3/Page_My Account/button_Proceed to Checkout'), 0)

WebUI.click(findTestObject('Object Repository/Scenario_3/Page_My Account/button_Proceed to Checkout'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Scenario_3/Page_Checkout/input_Street Address Line 1_street0'), 0)

WebUI.sendKeys(findTestObject('Scenario_3/Page_Checkout/input_Street Address Line 1_street0'), GlobalVariable.Street)

WebUI.waitForElementPresent(findTestObject('Scenario_3/Page_Checkout/input_City_city'), 0)

WebUI.setText(findTestObject('Object Repository/Scenario_3/Page_Checkout/input_City_city'), GlobalVariable.City)

WebUI.waitForElementPresent(findTestObject('Scenario_3/Page_Checkout/select_Please select a region, state or pro_d80c8a'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Scenario_3/Page_Checkout/select_Please select a region, state or pro_d80c8a'), 
    '1', true)

WebUI.waitForElementPresent(findTestObject('Scenario_3/Page_Checkout/input_ZipPostal Code_postcode'), 0)

WebUI.setText(findTestObject('Object Repository/Scenario_3/Page_Checkout/input_ZipPostal Code_postcode'), GlobalVariable.Zipcode)

WebUI.waitForElementPresent(findTestObject('Scenario_3/Page_Checkout/input_Phone Number_telephone'), 0)

WebUI.setText(findTestObject('Object Repository/Scenario_3/Page_Checkout/input_Phone Number_telephone'), GlobalVariable.PhoneNumber)

WebUI.waitForElementPresent(findTestObject('Scenario_3/Page_Checkout/input_Flat Rate_ko_unique_4'), 0)

WebUI.click(findTestObject('Object Repository/Scenario_3/Page_Checkout/input_Flat Rate_ko_unique_4'))

WebUI.waitForElementPresent(findTestObject('Scenario_3/Page_Checkout/span_Next'), 0)

WebUI.click(findTestObject('Object Repository/Scenario_3/Page_Checkout/span_Next'))

WebUI.waitForElementPresent(findTestObject('Scenario_3/Page_Checkout/span_Place Order'), 0)

WebUI.click(findTestObject('Object Repository/Scenario_3/Page_Checkout/span_Place Order'))

WebUI.waitForElementPresent(findTestObject('Scenario_3/Page_Success Page/span_Thank you for your purchase'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Scenario_3/Page_Success Page/span_Thank you for your purchase'), 
    'Thank you for your purchase!')

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

