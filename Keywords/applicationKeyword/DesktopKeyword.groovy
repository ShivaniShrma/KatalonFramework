package applicationKeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class DesktopKeyword {
	@Keyword
	def editRecord(String editCustomer) {

		Windows.click(findWindowsObject('Desktop_OR/Order Application/Edit OrderButton'))

		Windows.click(findWindowsObject('Object Repository/Desktop_OR/Order Application/Click CustomerName'))

		Windows.clearText(findWindowsObject('Object Repository/Desktop_OR/Order Application/Edit CustomerName'))

		Windows.setText(findWindowsObject('Object Repository/Desktop_OR/Order Application/Edit CustomerName'), editCustomer)

		Windows.click(findWindowsObject('Desktop_OR/Order Application/Ok Button'))
	}

	@Keyword
	def addRecord(String Url, String customer, String street, String city, String state, String zip, String cardNo, String ExpDate) {

		Windows.startApplicationWithTitle(Url, 'Orders - Untitled')
				
		Windows.click(findWindowsObject('Object Repository/Desktop_OR/Order Application/New Order Button'))

		Windows.click(findWindowsObject('Object Repository/Desktop_OR/Order Application/Customer Name'))

		Windows.setText(findWindowsObject('Object Repository/Desktop_OR/Order Application/Customer Name'), customer)

		Windows.setText(findWindowsObject('Object Repository/Desktop_OR/Order Application/Streetname'), street)

		Windows.click(findWindowsObject('Object Repository/Desktop_OR/Order Application/City Name'))

		Windows.setText(findWindowsObject('Object Repository/Desktop_OR/Order Application/City Name'), city)

		Windows.setText(findWindowsObject('Object Repository/Desktop_OR/Order Application/State Name'), state)

		Windows.setText(findWindowsObject('Object Repository/Desktop_OR/Order Application/Zip code'), zip)

		Windows.click(findWindowsObject('Object Repository/Desktop_OR/Order Application/Select CardName'))

		Windows.setText(findWindowsObject('Object Repository/Desktop_OR/Order Application/CardNumber'), cardNo)

		Windows.setText(findWindowsObject('Object Repository/Desktop_OR/Order Application/ExpiryDateOfCard'), ExpDate)

		Windows.click(findWindowsObject('Desktop_OR/Order Application/Ok Button'))
	}

	@Keyword
	def deleteRecordAndCloseApplication() {
		Windows.click(findWindowsObject('Desktop_OR/Order Application/Delete Button'))

		Windows.click(findWindowsObject('Desktop_OR/Order Application/Confirmation page'))

		Windows.click(findWindowsObject('Desktop_OR/Order Application/Yes Button'))

		Windows.click(findWindowsObject('Desktop_OR/Order Application/Close application Button'))

		Windows.click(findWindowsObject('Desktop_OR/Order Application/No Button'))
		WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)
	}
	
	@Keyword
	def deleteRecords_Negative() {
		Windows.click(findWindowsObject('Desktop_OR/Order Application/Delete Button'))
		
		WebUI.verifyMatch('Please specify the item to delete.', 'Please specify the item to delete.', false)
		
		Windows.click(findWindowsObject('Desktop_OR/Order Application/Warning Ok Button'))
		
		Windows.click(findWindowsObject('Desktop_OR/Order Application/Close application Button'))
		WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)
	}
}

