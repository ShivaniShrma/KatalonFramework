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

CustomKeywords.'applicationKeyword.WebKeywords.login'(Username, Password, findTestObject('Web_OR/Adactin/AdactinSpy/Page_Adactin.com - Hotel Reservation System/Spy_inputUsername'), 
    findTestObject('Web_OR/Adactin/AdactinSpy/Page_Adactin.com - Hotel Reservation System/Spy_inputPassword'), findTestObject(
        'Web_OR/Adactin/AdactinSpy/Page_Adactin.com - Hotel Reservation System/Spy_loginButton'), GlobalVariable.AdactinUrl)

CustomKeywords.'applicationKeyword.WebKeywords.ScreenShotAsCheckpoint'('AdactinScreenshot3')

CustomKeywords.'applicationKeyword.WebKeywords.BookHotelAndVerifyCheckinCheckoutDates'(findTestObject('Web_OR/Adactin/AdactinSpy/Page_Adactin.com - Search Hotel/Spy_inputdatepick_in'), 
    findTestObject('Web_OR/Adactin/AdactinSpy/Page_Adactin.com - Search Hotel/Spy_inputdatepick_out'), findTestObject('Web_OR/Adactin/AdactinSpy/Page_Adactin.com - Search Hotel/Spy_Select Location'), 
    findTestObject('Web_OR/Adactin/AdactinSpy/Page_Adactin.com - Search Hotel/Spy_Select Hotel'), findTestObject('Web_OR/Adactin/AdactinSpy/Page_Adactin.com - Search Hotel/Spy_Select Room Type'), 
    findTestObject('Web_OR/Adactin/AdactinSpy/Page_Adactin.com - Search Hotel/SpySubmit'), findTestObject('Web_OR/Adactin/AdactinSpy/Page_Adactin.com - Select Hotel/ArrivalDateCheck'), 
    findTestObject('Web_OR/Adactin/AdactinSpy/Page_Adactin.com - Select Hotel/DepartureDateCheck'), Location, HotelName, 
    RoomType)

CustomKeywords.'applicationKeyword.WebKeywords.logout'(findTestObject('Web_OR/Adactin/AdactinSpy/Page_Adactin.com - Search Hotel/Spy_Logout'))

