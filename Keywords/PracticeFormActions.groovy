import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class PracticeFormActions {

    static void fillBasicInfo(String first, String last, String email, String mobile) {
        WebUI.setText(findTestObject('PracticeForm/Inputs/txt_FirstName'), first)
        WebUI.setText(findTestObject('PracticeForm/Inputs/txt_LastName'), last)
        WebUI.setText(findTestObject('PracticeForm/Inputs/txt_Email'), email)
        WebUI.setText(findTestObject('PracticeForm/Inputs/txt_Mobile'), mobile)
    }

    static void selectGender(String gender) {
        switch (gender.toLowerCase()) {
            case 'male':
                WebUI.click(findTestObject('PracticeForm/Radio/rdo_GenderMale'))
                break
            case 'female':
                WebUI.click(findTestObject('PracticeForm/Radio/rdo_GenderFemale'))
                break
            default:
                WebUI.click(findTestObject('PracticeForm/Radio/rdo_GenderOther'))
        }
    }

    

    static void enterSubject(String subject) {
        WebUI.setText(findTestObject('PracticeForm/Inputs/txt_Subjects'), subject)
        
    }

    static void selectHobby(String hobby) {
        switch (hobby.toLowerCase()) {
            case 'sports':
                WebUI.click(findTestObject('PracticeForm/Checkbox/chk_Sports'))
                break
            case 'reading':
                WebUI.click(findTestObject('PracticeForm/Checkbox/chk_Reading'))
                break
            case 'music':
                WebUI.click(findTestObject('PracticeForm/Checkbox/chk_Music'))
                break
        }
    }

    static void uploadPicture(String filePath) {
        WebUI.uploadFile(findTestObject('PracticeForm/Upload/upload_Picture'), filePath)
    }

    static void selectStateAndCity() {
        WebUI.click(findTestObject('PracticeForm/Dropdown/select_State'))
        WebUI.click(findTestObject('PracticeForm/Dropdown/option_State_NCR'))

        WebUI.click(findTestObject('PracticeForm/Dropdown/select_City'))
        WebUI.click(findTestObject('PracticeForm/Dropdown/option_City_Delhi'))
    }

    static void submitForm() {
        WebUI.click(findTestObject('PracticeForm/Buttons/btn_Submit'))
    }
}