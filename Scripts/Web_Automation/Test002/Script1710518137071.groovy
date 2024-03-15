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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/button_Login'))

WebUI.rightClick(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/path_Today_cls-1'))

WebUI.click(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/div_Quick Launch'))

WebUI.verifyElementText(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/h6_Dashboard'), 'Dashboard')

WebUI.click(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/svg_Today_oxd-icon'))

WebUI.verifyElementText(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/h6_Leave'), 'Leave')

WebUI.setText(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/input'), 'Abhi')

WebUI.click(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/div_Assign LeaveEmployee NameInvalidLeave T_d7f15d'))

WebUI.setText(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/input'), 'Abhishek')

WebUI.sendKeys(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/div_Assign LeaveEmployee NameInvalidLeave T_d7f15d'))

WebUI.click(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/div_-- Select --'))

WebUI.rightClick(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/input_From Date_oxd-input oxd-input--focus'))

WebUI.click(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/div_To Date'))

WebUI.click(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/i_From Date_oxd-icon bi-calendar oxd-date-i_f3a9ef'))

WebUI.click(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/i_From Date_oxd-icon bi-calendar oxd-date-i_f3a9ef'))

WebUI.setText(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/input'), 'hints')

WebUI.sendKeys(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/input'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/input'), '')

WebUI.click(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/span_Job'))

WebUI.click(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/a_Job Titles'))

WebUI.verifyElementText(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/span_Job'), 'Job')

WebUI.click(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/label'))

WebUI.click(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/i_Account Assistant_oxd-icon bi-check oxd-c_99ac27'))

WebUI.verifyElementText(findTestObject('Object Repository/Web_Automation/Test002/Page_OrangeHRM/div_Automaton Tester'), 
    'Automaton Tester')

