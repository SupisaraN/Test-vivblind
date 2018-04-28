import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys



WebUI.openBrowser('')

WebUI.navigateToUrl('http://vivblind.play2pay.me/')

WebUI.click(findTestObject('Register page/Register volunteer'))
WebUI.setText(findTestObject('Register page/input_EMAIL'), 'supisara.norkaew@gmail.com')
WebUI.setText(findTestObject('Register page/input_PASSWORD'), '123456')
WebUI.setText(findTestObject('Register page/input_password_confirmation'), '123456')
WebUI.setText(findTestObject('Register page/input_FIRST_NAME_TH'), 'ศุภิสรา')
WebUI.setText(findTestObject('Register page/input_LAST_NAME_TH'), 'หน่อแก้ว')
WebUI.setText(findTestObject('Register page/input_FIRST_NAME_EN'), 'Supisara')
WebUI.setText(findTestObject('Register page/input_LAST_NAME_EN'), 'Norkaew')
WebUI.setText(findTestObject('Register page/input_BIRTH_DATE'), '08/07/1995')
WebUI.selectOptionByLabel(findTestObject('Register page/RELIGION'), 'พุทธ', true)
WebUI.selectOptionByLabel(findTestObject('Register page/EDUCATIONAL'), 'ปริญญาตรี', true)
WebUI.selectOptionByLabel(findTestObject('Register page/CAREER'), 'นักศึกษา', true)
WebUI.setText(findTestObject('Register page/input_ADDRESS_NO'), '522/137')
WebUI.setText(findTestObject('Register page/input_ADDRESS_MOO'), '10')
WebUI.setText(findTestObject('Register page/input_ADDRESS_ROAD'), 'พหลโยธิน')
WebUI.delay(2)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Register page/ADDRESS_PROVINCE'),'เชียงราย', false)
WebUI.delay(2)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Register page/ADDRESS_DISTRICT'),'เมืองเชียงราย', false)
WebUI.delay(2)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Register page/ADDRESS_SUBDISTRICT'),'สันทราย', false)
WebUI.delay(2)
WebUI.setText(findTestObject('Register page/input_ADDRESS_POSTCODE'), '57000')

WebUI.delay(2)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Register page/STATUS_EDU_WORK'),'กำลังศึกษา', false)

WebUI.setText(findTestObject('Register page/input_ADDRESS_ALL'), 'วิทยาลัยศิลปะ สื่อ และเทคโนโลยี')
WebUI.setText(findTestObject('Register page/input_PHONE'), '053773476')
WebUI.setText(findTestObject('Register page/input_CELL_PHONE'), '0882376942')
WebUI.setText(findTestObject('Register page/input_FAX'), '-')

WebUI.click(findTestObject('Register page/input_submit'))


WebUI.delay(2)
WebUI.verifyTextPresent("กรุณากรอกอีเมลที่ใช้งานจริงเพื่อให้ทางมูลนิธิติดต่อกลับได้", false)
WebUI.delay(2)
WebUI.verifyTextPresent("อีเมลนี้ถูกใช้งานไปแล้ว", false)
//WebUI.closeBrowser()
