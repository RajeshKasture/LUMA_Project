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

WebUI.waitForElementPresent(findTestObject('Secnario_1/Page_Home Page/a_Create an Account'), 0)

WebUI.click(findTestObject('Object Repository/Secnario_1/Page_Home Page/a_Create an Account'))

WebUI.waitForElementPresent(findTestObject('Secnario_1/Page_Create New Customer Account/input_First Name_firstname'), 0)

WebUI.setText(findTestObject('Object Repository/Secnario_1/Page_Create New Customer Account/input_First Name_firstname'), 
    GlobalVariable.FirstName)

WebUI.waitForElementPresent(findTestObject('Secnario_1/Page_Create New Customer Account/input_Last Name_lastname'), 0)

WebUI.setText(findTestObject('Object Repository/Secnario_1/Page_Create New Customer Account/input_Last Name_lastname'), 
    GlobalVariable.LastName)

WebUI.waitForElementPresent(findTestObject('Secnario_1/Page_Create New Customer Account/input_Email_email'), 0)

WebUI.setText(findTestObject('Object Repository/Secnario_1/Page_Create New Customer Account/input_Email_email'), GlobalVariable.Email)

WebUI.waitForElementPresent(findTestObject('Secnario_1/Page_Create New Customer Account/input_Password_password'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Secnario_1/Page_Create New Customer Account/input_Password_password'), 
    GlobalVariable.Password)

WebUI.waitForElementPresent(findTestObject('Secnario_1/Page_Create New Customer Account/input_Confirm Password_password_confirmation'), 
    0)

WebUI.setEncryptedText(findTestObject('Object Repository/Secnario_1/Page_Create New Customer Account/input_Confirm Password_password_confirmation'), 
    GlobalVariable.Password)

WebUI.waitForElementPresent(findTestObject('Secnario_1/Page_Create New Customer Account/span_Create an Account'), 0)

WebUI.click(findTestObject('Object Repository/Secnario_1/Page_Create New Customer Account/span_Create an Account'))

WebUI.delay(4)

WebUI.waitForElementPresent(findTestObject('Secnario_1/Page_My Account/div_Thank you for registering with Main Web_e69dd7'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Secnario_1/Page_My Account/div_Thank you for registering with Main Web_e69dd7'), 
    'Thank you for registering with Main Website Store.')

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

