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
import com.kms.katalon.core.configuration.RunConfiguration

WebUI.callTestCase(findTestCase('Common/OpenBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('PracticeForm/Inputs/txt_Firstname'), firstName)

WebUI.setText(findTestObject('PracticeForm/Inputs/txt_Lastname'), lastName)

WebUI.setText(findTestObject('PracticeForm/Inputs/txt_Email'), email)

WebUI.click(findTestObject('PracticeForm/Radio/rdo_GenderMale'))

WebUI.setText(findTestObject('PracticeForm/Inputs/txt_Mobile'), mobile)

WebUI.click(findTestObject('PracticeForm/Dropdown/Subjects/input_Subjects'))

WebUI.setText(findTestObject('PracticeForm/Dropdown/Subjects/input_Subjects'), 'ac')

WebUI.waitForElementVisible(findTestObject('PracticeForm/Dropdown/Subjects/input_Subjects'), 5)

WebUI.click(findTestObject('PracticeForm/Dropdown/Subjects/select_Accounting'))

WebUI.click(findTestObject('PracticeForm/Dropdown/Subjects/input_Subjects'))

WebUI.setText(findTestObject('PracticeForm/Dropdown/Subjects/input_Subjects'), 'comp')

WebUI.waitForElementVisible(findTestObject('PracticeForm/Dropdown/Subjects/input_Subjects'), 5)

WebUI.click(findTestObject('PracticeForm/Dropdown/Subjects/select_ComputerScience'))

WebUI.click(findTestObject('PracticeForm/Dropdown/Subjects/input_Subjects'))

WebUI.setText(findTestObject('PracticeForm/Dropdown/Subjects/input_Subjects'), 'Math')

WebUI.waitForElementVisible(findTestObject('PracticeForm/Dropdown/Subjects/input_Subjects'), 5)

WebUI.click(findTestObject('PracticeForm/Dropdown/Subjects/select_Maths'))

WebUI.click(findTestObject('PracticeForm/Checkbox/chk_Sports'))

WebUI.click(findTestObject('PracticeForm/Checkbox/chk_Reading'))

WebUI.click(findTestObject('PracticeForm/Checkbox/chk_Music'))

String projectDir = RunConfiguration.getProjectDir()
String path = projectDir + "/Include/files/upload/file_example.jpg"

WebUI.uploadFile(findTestObject('PracticeForm/Upload/upload_Picture'), path)

WebUI.setText(findTestObject('PracticeForm/Inputs/txt_CurrentAddress'), currentAddress)

WebUI.click(findTestObject('PracticeForm/Dropdown/StateAndCity/input_State'))

WebUI.click(findTestObject('PracticeForm/Dropdown/StateAndCity/select_StateNCR'))

WebUI.click(findTestObject('PracticeForm/Dropdown/StateAndCity/input_City'))

WebUI.click(findTestObject('PracticeForm/Dropdown/StateAndCity/select_CityDelhi'))

WebUI.click(findTestObject('PracticeForm/Buttons/btn_Submit'))

WebUI.verifyElementText(findTestObject('PracticeForm/Assertion/txt_SuccessMessageSubmit'), 'Thanks for submitting the form')

WebUI.callTestCase(findTestCase('Common/CloseBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

