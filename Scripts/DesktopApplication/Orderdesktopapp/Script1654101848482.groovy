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

Windows.startApplicationWithTitle('C:\\Users\\TX\\Katalon Studio\\katalonframework-Shivani\\Applications', 'Orders - Untitled')

Windows.click(findWindowsObject('Object Repository/Desktop_OR/Order Application/New Order Button'))

Windows.click(findWindowsObject('Object Repository/Desktop_OR/Order Application/Customer Name'))

Windows.setText(findWindowsObject('Object Repository/Desktop_OR/Order Application/Customer Name'), Customer)

WebUI.verifyCheckpoint(findCheckpoint('null'), false)

Windows.setText(findWindowsObject('Object Repository/Desktop_OR/Order Application/Streetname'), Street)

WebUI.verifyMatch('73668 East Daniels Way', '73668 East Daniels Way', false)

Windows.click(findWindowsObject('Object Repository/Desktop_OR/Order Application/City Name'))

Windows.setText(findWindowsObject('Object Repository/Desktop_OR/Order Application/City Name'), City)

WebUI.verifyMatch('Thousands Oaks', 'Thousands Oaks', false)

Windows.setText(findWindowsObject('Object Repository/Desktop_OR/Order Application/State Name'), State)

WebUI.verifyMatch('NE', 'NE', false)

Windows.setText(findWindowsObject('Object Repository/Desktop_OR/Order Application/Zip code'), zip)

WebUI.verifyMatch('6842', '6842', false)

Windows.click(findWindowsObject('Object Repository/Desktop_OR/Order Application/Select CardName'))

Windows.setText(findWindowsObject('Object Repository/Desktop_OR/Order Application/CardNumber'), CardNo)

Windows.verifyMatch('1330019087', '1330019087', false)

Windows.setText(findWindowsObject('Object Repository/Desktop_OR/Order Application/ExpiryDateOfCard'), ExpDate)

Windows.verifyMatch('01/01/2023', '01/01/2023', false)

Windows.click(findWindowsObject('Desktop_OR/Order Application/Ok Button'))

Windows.click(findWindowsObject('Desktop_OR/Order Application/Edit OrderButton'))

Windows.click(findWindowsObject('Object Repository/Desktop_OR/Order Application/Click CustomerName'))

Windows.clearText(findWindowsObject('Object Repository/Desktop_OR/Order Application/Edit CustomerName'))

Windows.setText(findWindowsObject('Object Repository/Desktop_OR/Order Application/Edit CustomerName'), Edit_Customer)

Windows.verifyMatch('Kristen', 'Kristen', false)

Windows.click(findWindowsObject('Desktop_OR/Order Application/Ok Button'))

Windows.click(findWindowsObject('Desktop_OR/Order Application/Delete Button'))

Windows.click(findWindowsObject('Desktop_OR/Order Application/Confirmation page'))

Windows.click(findWindowsObject('Desktop_OR/Order Application/Yes Button'))

Windows.click(findWindowsObject('Desktop_OR/Order Application/Close application Button'))

Windows.click(findWindowsObject('Desktop_OR/Order Application/No Button'))

