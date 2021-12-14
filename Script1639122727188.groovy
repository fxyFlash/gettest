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
import selenium
import webdriver
import time
import os
import yaml

url = 'https://www.baidu.com/'


driver = webdriver.Chrome()

driver.get(url)

driver.implicitly_wait(5)

driver.maximize_window()

driver.delete_all_cookies()

print(driver.get_cookies())

fileDir = os.path.split(os.path.realpath(__file__))[0]
yamlFileName = os.path.join(fileDir,'cookies.yaml')
f = open(yamlFileName,'r',encoding='utf-8')
cont = f.read()
cookies = yaml.load(cont)

cookiesList = cookies.get('cookies')

print(cookiesList)

for cookie in cookiesList:
	print(cookie)
	driver.add_cookie(cookie)

print(driver.get_cookies())

time.sleep(5)
driver.get(url)
driver.refresh()

time.sleep(15)

driver.quit()