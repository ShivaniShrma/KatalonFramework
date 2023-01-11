import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
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
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.RpaChallengeUrl)

WebUI.click(findTestObject('Web_OR/RPA/Page_Rpa Challenge/Startbutton'))

Object excelData = ExcelFactory.getExcelDataWithDefaultSheet(GlobalVariable.RpaChallengeExcelLcation, 'Sheet1', true)

for (int index = 1; index <= excelData.getRowNumbers(); index++) {
    WebUI.setText(findTestObject('Web_OR/RPA/Page_Rpa Challenge/First Name'), excelData.getValue('First_Name', index))

    WebUI.setText(findTestObject('Web_OR/RPA/Page_Rpa Challenge/Last Name'), excelData.getValue('Name_Last', index))

    WebUI.setText(findTestObject('Web_OR/RPA/Page_Rpa Challenge/Company Name'), excelData.getValue('Company_Name', index))

    WebUI.setText(findTestObject('Web_OR/RPA/Page_Rpa Challenge/Role in Company'), excelData.getValue('Role_in_Company', index))

    WebUI.setText(findTestObject('Web_OR/RPA/Page_Rpa Challenge/Address'), excelData.getValue('Address', index))

    WebUI.setText(findTestObject('Web_OR/RPA/Page_Rpa Challenge/Email'), excelData.getValue('Email', index))

    WebUI.setText(findTestObject('Web_OR/RPA/Page_Rpa Challenge/Phone Number'), excelData.getValue('Phone_Number', index))

    WebUI.click(findTestObject('Web_OR/RPA/Page_Rpa Challenge/Submit'))
}

