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

WebUI.waitForElementPresent(findTestObject('Scenario_2/Page_Customer Login/input_Email_loginusername'), 0)

WebUI.setText(findTestObject('Object Repository/Scenario_2/Page_Customer Login/input_Email_loginusername'), GlobalVariable.UserID)

WebUI.waitForElementPresent(findTestObject('Scenario_2/Page_Customer Login/input_Password_loginpassword'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Scenario_2/Page_Customer Login/input_Password_loginpassword'), 
    GlobalVariable.Password)

WebUI.waitForElementPresent(findTestObject('Scenario_2/Page_Customer Login/span_Sign In'), 0)

WebUI.click(findTestObject('Object Repository/Scenario_2/Page_Customer Login/span_Sign In'))

WebUI.waitForElementPresent(findTestObject('Scenario_2/Page_Home Page/span_Shorts_ui-menu-icon ui-icon ui-icon-carat-1-e'), 
    0)

WebUI.click(findTestObject('Object Repository/Scenario_2/Page_Home Page/span_Shorts_ui-menu-icon ui-icon ui-icon-carat-1-e'))

WebUI.waitForElementPresent(findTestObject('Scenario_2/Page_Men/a_Jackets'), 0)

WebUI.click(findTestObject('Object Repository/Scenario_2/Page_Men/a_Jackets'))

WebUI.waitForElementPresent(findTestObject('Scenario_2/Page_Jackets - Tops - Men/img_Add to Compare_product-image-photo'), 
    0)

WebUI.click(findTestObject('Scenario_2/Page_Jackets - Tops - Men/img_Add to Compare_product-image-photo'))

WebUI.waitForElementPresent(findTestObject('Scenario_2/Page_Montana Wind Jacket/div_S'), 0)

WebUI.click(findTestObject('Object Repository/Scenario_2/Page_Montana Wind Jacket/div_S'))

WebUI.waitForElementPresent(findTestObject('Scenario_2/Page_Montana Wind Jacket/div_Color_option-label-color-93-item-49'), 
    0)

WebUI.click(findTestObject('Object Repository/Scenario_2/Page_Montana Wind Jacket/div_Color_option-label-color-93-item-49'))

WebUI.waitForElementPresent(findTestObject('Scenario_2/Page_Montana Wind Jacket/span_Add to Cart'), 0)

WebUI.click(findTestObject('Object Repository/Scenario_2/Page_Montana Wind Jacket/span_Add to Cart'))

WebUI.waitForElementPresent(findTestObject('Scenario_2/Page_Montana Wind Jacket/div_You added Montana Wind Jacket to your s_af8450'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Scenario_2/Page_Montana Wind Jacket/div_You added Montana Wind Jacket to your s_af8450'), 
    'You added Montana Wind Jacket to your shopping cart.')

WebUI.waitForElementPresent(findTestObject('Scenario_2/Page_Montana Wind Jacket/a_My Cart                    1             _241c1f'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Scenario_2/Page_Montana Wind Jacket/a_My Cart                    1             _241c1f'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

