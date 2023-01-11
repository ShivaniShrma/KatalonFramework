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

CustomKeywords.'commonKeywords.RefreshBrowser.refreshBrowser'()

WebUI.navigateToUrl(GlobalVariable.OrangeHrmUrl)

CustomKeywords.'applicationKeyword.WebKeywords.login'(Username, Password, findTestObject('Web_OR/OrangeHrm/OrangeHrmLogin/Page_OrangeHRM/input_Username_username'), 
    findTestObject('Web_OR/OrangeHrm/OrangeHrmLogin/Page_OrangeHRM/input_Password_password'), findTestObject('Web_OR/OrangeHrm/OrangeHrmLogin/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Web_OR/OrangeHrm/OrangeHrm_LeaveDetails/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Web_OR/OrangeHrm/OrangeHrm_LeaveDetails/Page_OrangeHRM/Admin'))

WebUI.click(findTestObject('Object Repository/Web_OR/OrangeHrm/OrangeHrm_LeaveDetails/Page_OrangeHRM/Leave'))

WebUI.click(findTestObject('Object Repository/Web_OR/OrangeHrm/OrangeHrm_LeaveDetails/Page_OrangeHRM/Reports'))

WebUI.click(findTestObject('Object Repository/Web_OR/OrangeHrm/OrangeHrm_LeaveDetails/Page_OrangeHRM/Leave Entitlements and Usage Report'))

WebUI.click(findTestObject('Object Repository/Web_OR/OrangeHrm/OrangeHrm_LeaveDetails/Page_OrangeHRM/CAN - Bereavement'))

WebUI.click(findTestObject('Object Repository/Web_OR/OrangeHrm/OrangeHrm_LeaveDetails/Page_OrangeHRM/date_2022-01-01 - 2022-12-31'))

WebUI.click(findTestObject('Object Repository/Web_OR/OrangeHrm/OrangeHrm_LeaveDetails/Page_OrangeHRM/Select'))

WebUI.click(findTestObject('Object Repository/Web_OR/OrangeHrm/OrangeHrm_LeaveDetails/Page_OrangeHRM/Select'))

WebUI.click(findTestObject('Object Repository/Web_OR/OrangeHrm/OrangeHrm_LeaveDetails/Page_OrangeHRM/button_Generate'))

WebUI.click(findTestObject('Object Repository/Web_OR/OrangeHrm/OrangeHrm_LeaveDetails/Page_OrangeHRM/Linda Anderson'))

WebUI.click(findTestObject('Object Repository/Web_OR/OrangeHrm/OrangeHrm_LeaveDetails/Page_OrangeHRM/span_Paul Collings'))

CustomKeywords.'applicationKeyword.WebKeywords.logout'(findTestObject('Web_OR/OrangeHrm/OrangeHrm_LeaveDetails/Page_OrangeHRM/Logout'))

WebUI.closeBrowser()

