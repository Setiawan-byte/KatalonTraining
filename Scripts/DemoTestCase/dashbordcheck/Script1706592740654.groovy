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

WebUI.callTestCase(findTestCase('DemoTestCase/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard  nopCommerce administration/a_Wait_nopSideBarPusher'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  nopCommerce administration/i_right fas fa-angle-left_1'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  nopCommerce administration/p_System information'))

WebUI.click(findTestObject('Object Repository/Page_System information  nopCommerce admini_06785a/div_System information'))

WebUI.click(findTestObject('Object Repository/Page_System information  nopCommerce admini_06785a/i_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_System information  nopCommerce admini_06785a/p_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  nopCommerce administration/a_Recommended hosting for your store'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  nopCommerce administration/i_right fas fa-angle-left_1'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  nopCommerce administration/i_right fas fa-angle-left_1'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  nopCommerce administration/button_btn btn-tool'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  nopCommerce administration/i_right fas fa-angle-left_1'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  nopCommerce administration/abackTop'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  nopCommerce administration/a_Logout'))

WebUI.closeBrowser()

