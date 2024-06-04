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

WebUI.navigateToUrl('https://e-learning.msa.edu.eg')

WebUI.switchToWindowTitle('MSA E-Learning')

WebUI.setText(findTestObject('Object Repository/Page_MSA E-Learning/input_Username_username (2)'), '210607')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MSA E-Learning/input_Password_password (2)'), 'NDcmUT2lGoHJw/a5Lv4vMA==')

WebUI.click(findTestObject('Object Repository/Page_MSA E-Learning/button_Log in (2)'))

WebUI.click(findTestObject('Object Repository/Page_MSA E-Learning/a_My courses'))

WebUI.click(findTestObject('Object Repository/Page_My courses/img_Faculty Of Computer Science_icon'))

WebUI.click(findTestObject('Object Repository/Page_My courses/a_Remove from view                         _db06c4'))

WebUI.closeBrowser()

