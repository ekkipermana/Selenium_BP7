package BP7_Selenium_TestCase.Recruitment.Candidates;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CAN01_N_BlankAll extends Candidates_Page{
    @Test
    public void Recruitment_CAN01_N_BlankAll() throws InterruptedException {
        System.out.println("Add Cancidates failed with test blank fill");
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
        Rec.MenuRecruitment();
        Thread.sleep(1000);
        // Open SubMenu Candidates
        Rec.Candidates();
        Thread.sleep(1000);
        // Click Add Button
        Rec.ButtonAddCandidates();
        Thread.sleep(1000);
        //Input Mandatory First name
        Rec.CandidatesInputFirstName("");
        Thread.sleep(1000);
        //Input Middle Name
        Rec.CandidatesInputMiddleName("");
        Thread.sleep(1000);
        //Input Mandatory Last Name
        Rec.CandidatesInputLastName("");
        Thread.sleep(1000);
        //Input Mandatory Email
        Rec.CandidatesInputEmail("");
        Thread.sleep(1000);
        //Input Contact
        Rec.CandidatesInputContact("");
        Thread.sleep(1000);
        //Pick Job Vacancy
//        Rec.CandidatesPickJobVac();
//        Thread.sleep(1000);
//    Select candidatespicksJob = new Select(driver.findElement(By.id("addCandidate_vacancy")));
//    //candidatespick.selectByVisibleText("TesQA1");
//        candidatespicksJob.selectByValue("3");
        //Input Keywords
        Rec.CandidatesInputKeywords("");
        Thread.sleep(1000);
        //Input Comments
        Rec.CandidatesInputComments("");
        Thread.sleep(1000);
        //        //Pick Date
//        Rec.CandidatesPickDate();
//        Thread.sleep(1000);
//        Select startMonth = new Select(driver.findElement(By.className("  ui-datepicker-current-day")));
//        startMonth.selectByValue("21");
//        Thread.sleep(2000);

        //Button Save Candidates
        Rec.ButtonSaveCandidates();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getPageSource().contains("Required"));
        Thread.sleep(2000);
        driver.get("http://qa.cilsy.id/symfony/web/index.php/recruitment/addCandidate");
        driver.navigate().refresh();


    }
}
