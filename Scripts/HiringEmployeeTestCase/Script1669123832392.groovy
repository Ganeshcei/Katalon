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

WebUI.click(findTestObject('Personnel Management Page/PersonnelMangement_Hire employee'))

WebUI.setText(findTestObject('Personnel Management Page/HireEmployee_FirstName'), HiringEmployeeFirstName)

WebUI.setText(findTestObject('Personnel Management Page/HireEmployee_LastName'), HiringEmployeeLastName)

WebUI.click(findTestObject('Personnel Management Page/HireEmployee_EmploymentStartDate'))

WebUI.setText(findTestObject('Personnel Management Page/HireEmployee_EmploymentStartDate'), HiringEmployeeStartDate)

WebUI.click(findTestObject('Personnel Management Page/HireEmployee_EmploymentTypeId'))

WebUI.delay(2)

WebUI.setText(findTestObject('Personnel Management Page/HireEmployee_EmploymentTypeId'), 'Hourly')

WebUI.setText(findTestObject('Personnel Management Page/HireEmployee_EmploymentCategory'), 'Intern')

WebUI.click(findTestObject('Personnel Management Page/HireEmployee_Hire'))

WebUI.click(findTestObject('Personnel Management Page/Home-symbol'))

