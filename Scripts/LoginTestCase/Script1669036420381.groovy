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

WebUI.navigateToUrl('https://trial-y3rzqz.trial.operations.dynamics.com/?mode=trial&cmp=DAT&mi=DefaultDashboard')

WebUI.setText(findTestObject('SignInPage/Username'), 'hegil42779@jernang.com')

WebUI.click(findTestObject('SignInPage/UsernameSignIn'))

WebUI.setEncryptedText(findTestObject('SignInPage/Password'), '8HVXlXBceI5rMXjUqmD6og==')

WebUI.click(findTestObject('SignInPage/PasswordSignIn'))

WebUI.click(findTestObject('SignInPage/StaySignedIn_YesButton'))

WebUI.click(findTestObject('Dashboard Page/Dive in'))

WebUI.click(findTestObject('Dashboard Page/Lets get started'))

