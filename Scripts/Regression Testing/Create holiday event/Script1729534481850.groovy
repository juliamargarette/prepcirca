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

WebUI.navigateToUrl('https://dev.web.prepcirca.com/')

WebUI.setText(findTestObject('Object Repository/Page_PrepCirca V2/input_Login_username'), 'lia@dashurai.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_PrepCirca V2/input_Login_password'), 'xRkMkEGOFPJvN61N/sX4qQ==')

WebUI.click(findTestObject('Object Repository/Page_PrepCirca V2/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_PrepCirca V2/svg_Subject_lucide lucide-calendar-icon str_f5d304'))

WebUI.click(findTestObject('Object Repository/Page_PrepCirca V2/div_Add event'))

WebUI.setText(findTestObject('Object Repository/Page_PrepCirca V2/input__name'), 'PCRT_HOLIDAYEVENT')

WebUI.click(findTestObject('Object Repository/Page_PrepCirca V2/div__tomselect-1-ts-control'))

WebUI.click(findTestObject('Object Repository/Page_PrepCirca V2/div_Holiday'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_PrepCirca V2/select_Select an option School EventPersona_e622a4'), 
    'HOLIDAY', true)

WebUI.click(findTestObject('Object Repository/Page_PrepCirca V2/input__box rounded-md w-full px-3 py-2 bloc_2bc69b'))

WebUI.click(findTestObject('Object Repository/Page_PrepCirca V2/span_25'))

WebUI.click(findTestObject('Object Repository/Page_PrepCirca V2/input__box rounded-md w-full px-3 py-2 bloc_2bc69b_1'))

WebUI.click(findTestObject('Object Repository/Page_PrepCirca V2/span_26'))

WebUI.click(findTestObject('Object Repository/Page_PrepCirca V2/div_Create'))
