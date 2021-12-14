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
import org.openqa.selenium.Cookie as Cookie
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
for(def rowIdx = 0; rowIdx < findTestData('testUsers').getAllData().size(); rowIdx++) {
	WebUI.openBrowser('https://news.baidu.com/')
	
	WebUI.click(findTestObject('logintest/Page_/a_'))
	
	// 需要注意的是，这里的column和row的值，都是从1开始
	def userName = findTestData('testUsers').getValue(1, rowIdx + 1)
	def password = findTestData('testUsers').getValue(2, rowIdx + 1)
	
	login(userName, password)
	
	WebUI.click(findTestObject('logintest/Page_/input_TANGRAM__PSP_12__submit'))

	WebUI.closeBrowser()
}
def login(def userName, def password) {
	WebUI.setText(findTestObject('logintest/Page_/input_userName'), userName)

	WebUI.setText(findTestObject('logintest/Page_/input_password'), password)
}

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.coderbar.com/')

WebUI.click(findTestObject('Object Repository/Login/Page_/li_'))

WebUI.click(findTestObject('Object Repository/Login/Page_/div_'))

WebUI.setText(findTestObject('Object Repository/Login/Page_/input__ant-input ant-input-lg'), '17600961892')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_/input__ant-input ant-input-lg_1'), '1y+k39m+RIxpY6IY5i4s4A==')

WebUI.openBrowser(‘‘)

‘必须先访问一个地址，才能设置cookie‘

WebUI.navigateToUrl(GlobalVariable.G_URL)

‘获取driver‘

WebDriver driver = DriverFactory.getWebDriver()

‘设置cookie变量‘

Cookie ck = new Cookie('session', '6NuSrfC2AjwSLvBQlwvowA')

‘添加cookie‘

driver.manage().addCookie(ck)

‘刷新页面以使cookie生效‘

WebUI.refresh()

assert true

WebUI.click(findTestObject('Object Repository/Login/Page_/button_'))

WebUI.click(findTestObject('Object Repository/Login/Page_/div__1'))

WebUI.click(findTestObject('Object Repository/Login/Page_/input__ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/Login/Page_/button_'))

WebUI.closeBrowser()

