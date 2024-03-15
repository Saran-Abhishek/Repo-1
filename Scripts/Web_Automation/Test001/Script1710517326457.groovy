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

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

//WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.rightClick(findTestObject('Object Repository/Web_Automation/Test001/Page_OrangeHRM/img'))
WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/Web_Automation/Test001/Page_OrangeHRM/h5_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Web_Automation/Test001/Page_OrangeHRM/h5_Login'), 'Login')

WebUI.setText(findTestObject('Object Repository/Web_Automation/Test001/Page_OrangeHRM/input_Username_username'), 'Admin')
WebUI.takeScreenshot()
WebUI.setEncryptedText(findTestObject('Object Repository/Web_Automation/Test001/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')
WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/Web_Automation/Test001/Page_OrangeHRM/button_Login'))

WebUI.rightClick(findTestObject('Object Repository/Web_Automation/Test001/Page_OrangeHRM/h6_Dashboard'))

WebUI.verifyElementText(findTestObject('Object Repository/Web_Automation/Test001/Page_OrangeHRM/h6_Dashboard'), 'Dashboard')
WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/Web_Automation/Test001/Page_OrangeHRM/i_Dashboard_oxd-icon bi-caret-down-fill oxd_d2fd49'))

WebUI.click(findTestObject('Object Repository/Web_Automation/Test001/Page_OrangeHRM/a_Logout'))

WebUI.rightClick(findTestObject('Object Repository/Web_Automation/Test001/Page_OrangeHRM/h5_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Web_Automation/Test001/Page_OrangeHRM/h5_Login'), 'Login')
WebUI.takeScreenshot()
