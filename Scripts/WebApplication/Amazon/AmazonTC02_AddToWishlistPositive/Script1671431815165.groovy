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

WebUI.navigateToUrl(GlobalVariable.AmazonUrl)

WebUI.click(findTestObject('Object Repository/Web_OR/Amazon/AmazonAddToWishlist/Page_Online Shopping site/Account Lists'))

WebUI.setText(findTestObject('Web_OR/Amazon/AmazonSpyAll/Page_Amazon Sign In/input_Email'), Username)

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/WebApplication/AmazonUsernameCheckpoint'), false)

WebUI.click(findTestObject('Web_OR/Amazon/AmazonSpyAll/Page_Amazon Sign In/input_Email_continue'))

WebUI.setEncryptedText(findTestObject('Web_OR/Amazon/AmazonSpyAll/Page_Amazon Sign In/input_Password'), Password)

WebUI.click(findTestObject('Web_OR/Amazon/AmazonSpyAll/Page_Amazon Sign In/input_PasswordBtn'))

WebUI.setText(findTestObject('Web_OR/Amazon/AmazonSpyAll/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/input_SearchBox'), 
    BookName)

WebUI.click(findTestObject('Web_OR/Amazon/AmazonSpyAll/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/inputnav-search-submit-button'))

WebUI.click(findTestObject('Web_OR/Amazon/AmazonSpyAll/Page_Amazon.in  Alchemist/The Alchemist'))

WebUI.switchToWindowTitle('Buy The Alchemist Book Online at Low Prices in India | The Alchemist Reviews & Ratings - Amazon.in')

WebUI.click(findTestObject('Web_OR/Amazon/AmazonSpyAll/Page_Buy The Alchemist Book Online at Low Prices in India  The Alchemist Reviews  Ratings - Amazon.in/AddToWishlistBtn'))

WebUI.click(findTestObject('Web_OR/Amazon/AmazonSpyAll/Page_Buy The Alchemist Book Online at Low Prices in India  The Alchemist Reviews  Ratings - Amazon.in/View Your WishList'))

WebUI.click(findTestObject('Web_OR/Amazon/AmazonSpyAll/Page_Amazon.in/deleteItemFromWishlist'))

WebUI.click(findTestObject('Web_OR/Amazon/AmazonSpyAll/Page_Amazon.in Shopping Cart/ThreeLinesForOpeningSignOut'))

WebUI.click(findTestObject('Web_OR/Amazon/AmazonSpy/Page_Online Shopping site in India Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in/a_Sign Out'))

WebUI.closeBrowser()

