package BP7_Selenium_TestCase.Recruitment.Candidates;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CAN07_P_Valid_Add_Candidate extends Candidates_Page {

    //Add Cancidates with valid data
    @Test
    public void Recruitment_CAN06_P_Valid_Add_Candidate() throws InterruptedException {
        System.out.println("Add Cancidates with valid data");
//        //Input valid Username
//        Auth.inputUsername("Admin");
//        Thread.sleep(1000);
//        //Input valid Password
//        Auth.inputPassword("s3Kol4HQA!*");
//        Thread.sleep(1000);
//        //Click Button Login
//        Auth.ButtonLogin();
//        Assert.assertTrue(driver.getPageSource().contains("Welcome Karyawan"));
//        Thread.sleep(2000);
//
        // Open menu Recruitment
//        Rec.MenuRecruitment();
//        Thread.sleep(1000);
//        // Open SubMenu Candidates
//        Rec.Candidates();
//        Thread.sleep(1000);
//        // Click Add Button
//        Rec.ButtonAddCandidates();
//        Thread.sleep(1000);
//        //Input Mandatory First name
        Rec.CandidatesInputFirstName("Demo");
        Thread.sleep(1000);
        //Input Middle Name
        Rec.CandidatesInputMiddleName("BP");
        Thread.sleep(1000);
        //Input Mandatory Last Name
        Rec.CandidatesInputLastName("QA7");
        Thread.sleep(1000);
        //Input Mandatory Email
        Rec.CandidatesInputEmail("ekki.permanaa@gmail.com");
        Thread.sleep(1000);
        //Input Contact
        Rec.CandidatesInputContact("0852937657600");
        Thread.sleep(1000);
        //Pick Job Vacancy
        Rec.CandidatesPickJobVac();
        Thread.sleep(1000);
        Select candidatespicksJob = new Select(driver.findElement(By.id("addCandidate_vacancy")));
        //candidatespick.selectByVisibleText("TesQA1");
        candidatespicksJob.selectByValue("3");

//        Rec.fileInput = driver.findElement(By.id("addCandidate_resume"));
//        fileInput.sendKeys("/path/to/file.jpg");
        //Input Keywords
        Rec.CandidatesInputKeywords("CilsyQAA");
        Thread.sleep(1000);
        //Input Comments
        Rec.CandidatesInputComments("Sekolah QA Batch7 BP");
        Thread.sleep(1000);
//        //Pick Date
//        Rec.CandidatesPickDate();
//        Thread.sleep(1000);
//        Select startMonth = new Select(driver.findElement(By.className("  ui-datepicker-current-day")));
//        startMonth.selectByValue("21");
//        Thread.sleep(2000);

        //Button Save Candidates
        Rec.ButtonSaveCandidates();
        Assert.assertTrue(driver.getPageSource().contains("Successfully Saved"));
        Thread.sleep(1000);
        Rec.CandidtatesButtonBack();
        Thread.sleep(1000);
        //Back to List



    }
}
