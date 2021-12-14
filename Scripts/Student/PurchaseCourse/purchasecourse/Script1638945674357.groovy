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

WebUI.navigateToUrl('https://www.coderbar.com/')

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_/li_'))

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_/div_'))

WebUI.setText(findTestObject('Object Repository/PurchaseCourse/Page_/input__ant-input ant-input-lg'), '17600961892')

WebUI.setEncryptedText(findTestObject('Object Repository/PurchaseCourse/Page_/input__ant-input ant-input-lg_1'), '1y+k39m+RIxpY6IY5i4s4A==')

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_/input__ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_/button_'))

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_/a_'))

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_/img__listCardImg'))

WebUI.switchToWindowTitle('JavaScript-20211124_直播课 | 码农吧')

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_JavaScript-20211124_/div_0'))

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_/button__1'))

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_/div__1'))

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_JavaScript-20211124_/span_17 JSON_ant-tree-switcher ant-tree-swi_73927f'))

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_JavaScript-20211124_/span_69 json'))

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_JavaScript-20211124_/use'))

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_JavaScript-20211124_/a_'))

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_/a__1'))

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_/a__1_2'))

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_/img__listCardImg_1'))

WebUI.switchToWindowTitle('AWS技术教育（第二期）_直播课 | 码农吧')

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_AWS_/div_'))

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_AWS_/div_499'))

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_/button__1'))

WebUI.click(findTestObject('Object Repository/PurchaseCourse/Page_/a__1'))

WebUI.closeBrowser()

