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

Mobile.startApplication('/Users/magical/Downloads/app-release-1639395726817.apk', true)

Mobile.tap(findTestObject('Object Repository/browes/android.view.View'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Object Repository/browes/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/browes/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/browes/android.view.View (2)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/browes/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/browes/android.widget.ImageView (2)'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/browes/android.widget.ImageView (3)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/browes/android.view.View (3)'), 0)

Mobile.tapAndHold(findTestObject(''), 0, 0)

Mobile.tap(findTestObject('Object Repository/browes/android.widget.ImageView (4)'), 0)

Mobile.tap(findTestObject('Object Repository/browes/android.view.View (4)'), 0)

Mobile.tap(findTestObject('Object Repository/browes/android.view.View (5)'), 0)

Mobile.tap(findTestObject('Object Repository/browes/android.widget.ImageView (5)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/browes/android.widget.ImageView (6)'), 0)

Mobile.tap(findTestObject('Object Repository/browes/android.view.View (6)'), 0)

Mobile.tap(findTestObject('Object Repository/browes/android.view.View (7)'), 0)

Mobile.tap(findTestObject('Object Repository/browes/android.view.View (8)'), 0)

Mobile.tap(findTestObject('Object Repository/browes/android.view.View (9)'), 0)

Mobile.tap(findTestObject('Object Repository/browes/android.view.View (10)'), 0)

Mobile.tap(findTestObject('Object Repository/browes/android.view.View (11)'), 0)

Mobile.closeApplication()

