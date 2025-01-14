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

WebUI.waitForElementPresent(findTestObject('Scenario_4/Page_Home Page/a_Sign In'), 0)

WebUI.click(findTestObject('Object Repository/Scenario_4/Page_Home Page/a_Sign In'))

WebUI.waitForElementPresent(findTestObject('Scenario_4/Page_Customer Login/input_Email_loginusername'), 0)

WebUI.setText(findTestObject('Object Repository/Scenario_4/Page_Customer Login/input_Email_loginusername'), GlobalVariable.UserID)

WebUI.waitForElementPresent(findTestObject('Scenario_4/Page_Customer Login/input_Password_loginpassword'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Scenario_4/Page_Customer Login/input_Password_loginpassword'), 
    GlobalVariable.Password)

WebUI.waitForElementPresent(findTestObject('Scenario_4/Page_Customer Login/span_Sign In'), 0)

WebUI.click(findTestObject('Object Repository/Scenario_4/Page_Customer Login/span_Sign In'))

WebUI.waitForElementPresent(findTestObject('Scenario_4/Page_Home Page/input_Search_q'), 0)

WebUI.setText(findTestObject('Object Repository/Scenario_4/Page_Home Page/input_Search_q'), 'Nike')

WebUI.waitForElementPresent(findTestObject('Scenario_4/Page_Home Page/button_Search'), 0)

WebUI.click(findTestObject('Object Repository/Scenario_4/Page_Home Page/button_Search'))

WebUI.waitForElementPresent(findTestObject('Scenario_4/Page_Search results for Nike/span_Search results for Nike'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Scenario_4/Page_Search results for Nike/span_Search results for Nike'), 
    'Search results for: \'Nike\'')

assert true

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

