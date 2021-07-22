package BP7_Selenium_TestCase.Recruitment.Vacancy;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VAN09_P_Valid_Add_Vacancy extends Vacancy_Page {
    @Test
    public void Vacancies_VAN08_P_Valid_Add_Vacancy() throws InterruptedException {
        System.out.println("Add Vacancies with valid data");
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
        // Click SubMenu Vacancies
        Rec.Vacancies();
        Thread.sleep(1000);
        // Click Add Button
        Rec.ButtonAddVacancies();
        Thread.sleep(1000);


        // Pick Mandator Job Title
        Rec.VacancyPickJobTittle();
        Select vacanciespicksTittleJob = new Select(driver.findElement(By.id("addJobVacancy_jobTitle")));
        //candidatespick.selectByVisibleText("QA Engineer Batch 7");
        vacanciespicksTittleJob.selectByValue("2");
        Thread.sleep(1000);
        //Input Mandatory Vacany Name
        Rec.VacancyInputName("QA Automation Engineersss");
        Thread.sleep(1000);
        //Input Mandatory Hiring Manager
        Rec.VacancyInputManager("Karyawan Teladan");
        Thread.sleep(1000);
        //Input Numbers of positions
        Rec.VacancyInputNumberPositions("2");
        Thread.sleep(1000);
        //Input Numbers of positions
        Rec.VacancyInputDescriptions("SekolahQA Batch7");
        Thread.sleep(1000);

        //Click Button Save
        Rec.VacancyButtonSave();
        Assert.assertTrue(driver.getPageSource().contains("Successfully Saved"));
        Thread.sleep(1000);
        //Cliack Button Save
        Rec.VacancyButtonBack();
        Thread.sleep(1000);


    }

    }
