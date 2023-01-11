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

public class WebKeywords {
	@Keyword
	def login(String Username, String Password, Object usernameObj, Object passwordObj, Object loginbtn, String Url) {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(Url)
		WebUI.setText(usernameObj,Username)

		WebUI.setText(passwordObj, Password)

		WebUI.click(loginbtn)
	}

	@Keyword
	def logout(Object logoutBtn) {
		WebUI.click(logoutBtn)
		WebUI.closeBrowser()
	}

	@Keyword
	def BookHotelAndVerifySelectedHotel(Object Today_DateObj, Object Tommorow_DateObj, Object Spy_SelectLocationObj, Object Spy_SelectHotelObj, Object Spy_SelectRoomTypeObj, Object SpySubmitObj, String Location, String HotelName, String RoomType) {
		WebUI.selectOptionByValue(Spy_SelectLocationObj, Location, true)

		WebUI.selectOptionByValue(Spy_SelectHotelObj, HotelName, true)

		WebUI.selectOptionByValue(Spy_SelectRoomTypeObj, RoomType, true)

		(new commonKeywords.gettingDate()).TodayDate(Today_DateObj)
		(new commonKeywords.gettingDate()).TommorowDate(Tommorow_DateObj)
		WebUI.click(SpySubmitObj)

		WebUI.verifyMatch(Location, 'Sydney', false)
	}

	@Keyword
	def BookHotelAndVerifyCheckinCheckoutDates(Object Today_DateObj, Object Tommorow_DateObj, Object Spy_SelectLocationObj, Object Spy_SelectHotelObj, Object Spy_SelectRoomTypeObj, Object SpySubmitObj, Object ArrivalDateCheckObj, Object DepartureDateCheckObj, String Location, String HotelName, String RoomType) {
		Date todaysDate = new Date()
		String today = todaysDate.format('dd/MM/yyyy')
		String tommorrow = todaysDate.plus(1).format('dd/MM/yyyy')

		WebUI.selectOptionByValue(Spy_SelectLocationObj, Location, true)

		WebUI.selectOptionByValue(Spy_SelectHotelObj, HotelName, true)

		WebUI.selectOptionByValue(Spy_SelectRoomTypeObj, RoomType, true)

		(new commonKeywords.gettingDate()).TodayDate(Today_DateObj)
		(new commonKeywords.gettingDate()).TommorowDate(Tommorow_DateObj)
		WebUI.click(SpySubmitObj)

		WebUI.verifyElementAttributeValue(ArrivalDateCheckObj, 'value', today, 30)

		WebUI.verifyElementAttributeValue(DepartureDateCheckObj, 'value', tommorrow, 30)
	}

	@Keyword
	def ScreenShotAsCheckpoint(String NameForScreenShot) {
		WebUI.takeFullPageScreenshotAsCheckpoint(NameForScreenShot)

		WebUI.delay(2)
	}
}