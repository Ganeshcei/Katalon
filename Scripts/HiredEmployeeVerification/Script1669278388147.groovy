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

WebUI.click(findTestObject('Dashboard Page/Personnel management'))

WebUI.click(findTestObject('Personnel Management Page/Recently hired workers'))

WebUI.click(findTestObject('Personnel Management Recently Hired Workers Page/SearchFilter Inputbox'))

WebUI.setText(findTestObject('Personnel Management Recently Hired Workers Page/SearchFilter Inputbox'), (HiredEmployeeFirstName + 
    ' ') + HiredEmployeeLastName)

WebUI.click(findTestObject('Personnel Management Recently Hired Workers Page/Search name DropdownValue'))

HiredEmployeeName = WebUI.getAttribute(findTestObject('Personnel Management Recently Hired Workers Page/SearchResult SearchName field'), 
    'Value')

WebUI.verifyMatch(HiredEmployeeName, (HiredEmployeeFirstName + ' ') + HiredEmployeeLastName, false)

WebUI.click(findTestObject('Personnel Management Page/Home-symbol'))

