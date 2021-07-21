package BP7_Selenium_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Recruitment {

    WebDriver driver;
    public Recruitment(WebDriver driver) {
        this.driver = driver;
    }

    ///////CANDIDATES////////
    //  Input Username
    By ClickRecruitment = By.id("menu_recruitment_viewRecruitmentModule");
    public void MenuRecruitment() {
        driver.findElement(ClickRecruitment).click();
    }
    // Click Menu Candidates
    By ClickCandidates = By.id("menu_recruitment_viewCandidates");
    public void Candidates() {
        driver.findElement(ClickCandidates).click();
    }
    // Click Button AddCandidates
    By CandidatesAddButton = By.id("btnAdd");
    public void ButtonAddCandidates() {
        driver.findElement(CandidatesAddButton).click();
    }
    // Click Button Save Candidates
    By CandidatesSaveButton = By.id("btnSave");
    public void ButtonSaveCandidates() {
        driver.findElement(CandidatesSaveButton).click();
    }
    // Input Mandatory First Name
    By InputFirstNameCandidates = By.id("addCandidate_firstName");
    public void CandidatesInputFirstName (String FirstName) {
        driver.findElement(InputFirstNameCandidates).sendKeys(FirstName);
    }
    // Input  Middle Name
    By InputMiddleNameCandidates = By.id("addCandidate_middleName");
    public void CandidatesInputMiddleName(String MiddleName) {
        driver.findElement(InputMiddleNameCandidates).sendKeys(MiddleName);
    }
    // Input Mandatory Last Name
    By InputLastNameCandidates = By.id("addCandidate_lastName");
    public void CandidatesInputLastName(String LastName) {
        driver.findElement(InputLastNameCandidates).sendKeys(LastName);
    }
    // Input Mandatory Email
    By InputEmailCandidates = By.id("addCandidate_email");
    public void CandidatesInputEmail(String Email) {
        driver.findElement(InputEmailCandidates).sendKeys(Email);
    }
    // Input Contact Number
    By InputContactCandidates = By.id("addCandidate_contactNo");
    public void CandidatesInputContact (String Contact) {
        driver.findElement(InputContactCandidates).sendKeys(Contact);
    }
    // Input Keywords
    By InputKeywordsCandidates = By.id("addCandidate_keyWords");
    public void CandidatesInputKeywords (String Keywords) {
        driver.findElement(InputKeywordsCandidates).sendKeys(Keywords);
    }
    // Input Comments
    By InputCommentsCandidates = By.id("addCandidate_comment");
    public void CandidatesInputComments (String Comments) {
        driver.findElement(InputCommentsCandidates).sendKeys(Comments);
    }
    // Pick Job Vacancy
    By PickJobVacCandidates = By.id("addCandidate_vacancy");
    public void CandidatesPickJobVac () {
        driver.findElement(PickJobVacCandidates).click();
    }
    // DatePicker Candidates
    By DatePickerCandidates = By.id("addCandidate_appliedDate");
    public void CandidatesPickDate () {
        driver.findElement(DatePickerCandidates).click();
    }
    // Click Button Back
    By ButtonBackCandidates = By.id("btnBack");
    public void CandidtatesButtonBack () {
        driver.findElement(ButtonBackCandidates).click();
    }




    ///////VACANCIES////////
    // Pick Mandatory Job Title
    By PickJobTittleVacancy = By.id("addJobVacancy_jobTitle");
    public void VacancyPickJobTittle () {
        driver.findElement(PickJobTittleVacancy).click();
    }
    // Input Mandatory Vacancy Name
    By InputNameVacancy = By.id("addJobVacancy_name");
    public void VacancyInputName (String Vname) {
        driver.findElement(InputNameVacancy).sendKeys(Vname);
    }
    // Input Mandatory Hiring Manager
    By InputManagerVacancy = By.id("addJobVacancy_hiringManager");
    public void VacancyInputManager (String manager) {
        driver.findElement(InputManagerVacancy).sendKeys(manager);
    }
    // Input Number of positions
    By InputNumberPositionsVacancy = By.id("addJobVacancy_noOfPositions");
    public void VacancyInputNumberPositions (String num_positions) {
        driver.findElement(InputNumberPositionsVacancy).sendKeys(num_positions);
    }
    // Input Descriptions
    By InputDescriptionsVacancy = By.id("addJobVacancy_description");
    public void VacancyInputDescriptions (String desciptionsV) {
        driver.findElement(InputDescriptionsVacancy).sendKeys(desciptionsV);
    }
    // Click Save Vacancy
    By ButtonSaveVacancy = By.id("btnSave");
    public void VacancyButtonSave () {
        driver.findElement(ButtonSaveVacancy).click();
    }
    // Click Button Back
    By ButtonBackVacancy = By.id("btnBack");
    public void VacancyButtonBack () {
        driver.findElement(ButtonBackVacancy).click();
    }
}