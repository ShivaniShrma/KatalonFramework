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

public class MobileKeyword {
	@Keyword
	def login(String Username, String Password, Object usernameObj, Object passwordObj, Object loginbtn, String NameForScreenshot) {
		Mobile.startApplication(GlobalVariable.EriBankAndroidLocation, true)
		Mobile.setText(usernameObj,Username, 15)
		Mobile.setText(passwordObj, Password, 15)
		Mobile.takeScreenshotAsCheckpoint(NameForScreenshot, FailureHandling.STOP_ON_FAILURE)
		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(loginbtn, 0)
	}

	@Keyword
	def logout(Object logoutBtn) {
		Mobile.tap(logoutBtn, 0)
		Mobile.closeApplication()
	}

	@Keyword
	def EriBankMakePayment(Object MakePaymentObj, Object PhoneTextBoxObj, Object NameTextBoxObj, Object AmountTextBoxObj, String Phone, String Name, String Amount, Object SelectButtonObj, Object TextViewObj, Object PaymentButtonObj, Object YesButtonObj) {
		Mobile.tap(MakePaymentObj, 0)
		Mobile.setText(PhoneTextBoxObj, Phone, 0)

		Mobile.setText(NameTextBoxObj, Name, 0)

		Mobile.setText(AmountTextBoxObj, Amount, 0)
		Mobile.tap(SelectButtonObj, 0)

		Mobile.tap(TextViewObj, 0)

		Mobile.tap(PaymentButtonObj, 0)

		Mobile.tap(YesButtonObj, 0)
	}

	@Keyword
	def EriBankLoginNegative(String Username, String Password, Object usernameObj, Object passwordObj, Object loginbtn, Object CloseButtonObj, String NameForScreenshot) {
		(new applicationKeyword.MobileKeyword()).login(Username, Password, usernameObj, passwordObj, loginbtn, NameForScreenshot)
		Mobile.tap(findTestObject('Object Repository/Mobile_OR/EriBank/EriBankLoginNegative/TextView - Invalid username or password'),
				0)

		WebUI.verifyMatch('Invalid username or password', 'Invalid username or password', false)

		Mobile.tap(findTestObject('Object Repository/Mobile_OR/EriBank/EriBankLoginNegative/CloseButton'), 0)

		Mobile.closeApplication()
	}

	//	@Keyword
	//	def ScreenShotAsCheckpointForMobile(String NameForScreenshot) {
	//		Mobile.takeScreenshotAsCheckpoint(NameForScreenshot, FailureHandling.STOP_ON_FAILURE)
	//
	//		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
	//	}
}
