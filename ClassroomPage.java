package Pages;

import java.util.List;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.BaseTest;

//import Aulas_Base.TestBase;

public class ClassroomPage extends BaseTest {
	// Actions ac;
	@FindBy(xpath = "//div[text()='Automation Testing']")
	WebElement AutomationClass;
	@FindBy(xpath = "//div[text()='CSE']")
	WebElement CSESection;
	@FindBy(xpath = "//div[text()='ECE']")
	WebElement ECESection;
	@FindBy(xpath = "//a[@href='/classroom']")
	WebElement Classrooms;
	@FindBy(xpath = "//span[text()='Create New Class']")
	WebElement CreateClassButton;
	@FindBy(xpath = "(//div[contains(@class,'m')]/input)[1]")
	WebElement ClassNameField;
	@FindBy(xpath = "(//div[contains(@class,'m')]/input)[2]")
	WebElement SectionField;
	@FindBy(xpath = "//div[@class='ant-select-selector']")
	WebElement CourseSelector;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	WebElement Course1;
	@FindBy(xpath = "//span[text()='Create']")
	WebElement Createbutton;
	@FindBy(xpath = "//span[text()='Add Now']")
	WebElement AddNowbutton;
	@FindBy(xpath = "(//div[@class='cursor-pointer'])[2]")
	WebElement Close;
	@FindBy(xpath = "//div[@class='cursor-pointer m-r-20']")
	WebElement BackButton;
	@FindBy(xpath = "//span[text()='Maybe Later']")
	WebElement MaybeLaterbutton;
	/// *************Create Subjects*******************///
	@FindBy(xpath = "//span[text()='Create']")
	WebElement CreateSubjectbutton;
	@FindBy(xpath = "(//input[contains(@class,'ant')])[1]")
	WebElement AddSubjectName1;
	@FindBy(xpath = "//div[text()='+ Add Another Subject']")
	WebElement AddanotherSubject;
	@FindBy(xpath = "//input[contains(@class,'ant')][2]")
	WebElement AddSubjectName2;
	@FindBy(xpath = "(//span[text()='Create'])[2]")
	WebElement Create;
	/// *********Add Chapters**************************///
	@FindBy(xpath = "(//div[text()='+ Add Chapters'])[1]")
	WebElement AddChapters;
	@FindBy(xpath = "(//input[@class='ant-input input-text-grey m-t-10'])[1]")
	WebElement ChapterName1;
	@FindBy(xpath = "//div[text()='+ Add Another Chapter']")
	WebElement AddAnotherChapterBtn;
	@FindBy(xpath = "(//input[@class='ant-input input-text-grey m-t-10'])[2]")
	WebElement ChapterName2;
	@FindBy(xpath = "//span[text()='Add']")
	WebElement Add;
	@FindBy(xpath = "(//div[@class='box-sequare__batch r-c-c-c cursor-pointer'])[1]")
	WebElement ClickonClass;
	@FindBy(xpath = "//span[text()='Browse']")
	WebElement ClickBrowse;
	@FindBy(xpath = "(//div[text()='View All'])[1]")
	WebElement ChapterViewAll;
	// *******************Resources ***************************//
	@FindBy(xpath = "(//div[@class='r-c-c-c box-sequare__resources cursor-pointer'])[1]")
	WebElement ClickonSection;
	@FindBy(xpath = "//span[text()='Add to Section']")
	WebElement AddtoSection;
	@FindBy(xpath = "(//label[@class='ant-checkbox-wrapper'])[1]")
	WebElement Subject1;
	@FindBy(xpath = "(//label[@class='ant-checkbox-wrapper'])[2]")
	WebElement Subject2;
	@FindBy(xpath = "(//label[@class='ant-checkbox-wrapper'])[3]")
	WebElement Subject3;
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement YesButton;
	@FindBy(xpath = "//span[text()='No']")
	WebElement NoButton;
	@FindBy(xpath = "(//div[@class='ant-collapse-header'])[1]")
	WebElement ChaptersOpen;
	@FindBy(xpath = "//div[@class='cursor-pointer m-r-20']")
	WebElement ResourcesBack;
	// ***************Edit Curriculum*******************//
	@FindBy(xpath = "//span[text()='Edit Curriculum']")
	WebElement EditCurriculum;
	@FindBy(xpath = "(//div[@class='r-jsb m-b-20 cursor-pointer'])[1]")
	WebElement ClickSubject;
	@FindBy(xpath = "//div[@class='text-mdl']")
	WebElement EditIcon;
	@FindBy(xpath = "//input[contains(@class,'ant-input')]")
	WebElement Edittextfield;
	@FindBy(xpath = "//span[text()='Save']")
	WebElement Savebutton;
	@FindBy(xpath = "//div[@class='text-mdl m-l-20']")
	WebElement DeleteICon;
	@FindBy(xpath = "//span[text()='Confirm']")
	WebElement ConfirmButton;
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement Cancelbutton;
	@FindBy(xpath = "//div[@class='ant-dropdown-trigger r-c-c icon-round-bg__grey cursor-pointer']")
	WebElement Dottedbutton;
	@FindBy(xpath = "//div[text()='Browse Subjects']")
	WebElement BrowseSubjects;
	// -----> Resources Page ---->
	@FindBy(xpath = "//div[text()='Create Subject']")
	WebElement CreateSubject;
	@FindBy(xpath = "//span[text()='Create']")
	WebElement Create1;
	// ----> Create Subjects ---->
	@FindBy(xpath = "//button[@class='ant-btn btn-radius-15__height-38 m-r-20 dark-grey']")
	WebElement EditChapters1;
	@FindBy(xpath = "(//span[@class='ant-checkbox'])[1]")
	WebElement SelectChapter1;
	@FindBy(xpath = "(//input[@class='ant-input input-text-grey m-l-20'])[1]")
	WebElement EditChapter1;
	@FindBy(xpath = "//span[text()='Done']")
	WebElement Done;
	@FindBy(xpath = "//span[text()='Delete']")
	WebElement Delete;
	@FindBy(xpath = "(//div[contains(@class,'cursor')])[2]")
	WebElement LeftArrowbutton;

	/// **************Add Students **************************//
	@FindBy(xpath = "(//span[text()='Add Students'])[1]")
	WebElement AddStudentsbutton;
	@FindBy(xpath = "//input[@class='ant-input']")
	WebElement SearchByName;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	WebElement SelStudentName;
	@FindBy(xpath = "//span[text()='Add']")
	WebElement Addbutton;
	@FindBy(xpath = "(//span[@class='anticon anticon-close ant-tag-close-icon'])[1]")
	WebElement SelStudentClose;

	/// *************View Deatils **************///
	@FindBy(xpath = "//div[text()='View Details']")
	WebElement ViewDetails;
	@FindBy(xpath = "//span[@class='ant-input-group-addon']")
	WebElement Search;
	@FindBy(xpath = "//span[contains(@class,'ant-input-affix-wrapper-lg')]")
	WebElement SearchStuName;
	@FindBy(xpath = "(//span[@class='ant-checkbox'])[2]")
	WebElement SelectStudent1;
	@FindBy(xpath = "//span[text()='Transfer']")
	WebElement Transfer;
	@FindBy(xpath = "(//div[@class='r-c-c icon-square-bg__yellow cursor-pointer m-r-20'])[1]")
	WebElement TransferIcon;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement StandardSelector;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	WebElement SelectClass1;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
	WebElement SectionSelector;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[11]")
	WebElement Section1;
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement Cancel;
	@FindBy(xpath = "(//span[text()='Transfer'])[2]")
	WebElement Transferbutton1;
	@FindBy(xpath = "//span[text()='Unassign']")
	WebElement Unassign;
	@FindBy(xpath = "(//div[@class='r-c-c icon-square-bg__red cursor-pointer'])[1]")
	WebElement UnassignIcon;
	@FindBy(xpath = "//span[text()='Yes']")
	WebElement Yes;
	@FindBy(xpath = "//span[text()='No']")
	WebElement No;

	/// *********** Add Section Puls Icon ******************************///

	@FindBy(xpath = "(//div[@class='r-c-c icon-round-bg__grey cursor-pointer'])[2]")
	WebElement PlusIcon;
	@FindBy(xpath = "(//span[@class='ant-checkbox'])[1]")
	WebElement CloneSubject1;
	@FindBy(xpath = "//input[@class='ant-input input-text-grey']")
	WebElement NewSectionName;
	@FindBy(xpath = "//div[@class='ant-select-selector']")
	WebElement CourseNameSelector;
	@FindBy(xpath = "(//div[@class='ant-select-selector'])[1]")
	WebElement CourseNameSelector1;
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[1]")
	WebElement Course;
	@FindBy(xpath = "//span[text()='Create']")
	WebElement CreateButton;
	@FindBy(xpath = "//span[text()='Clone']")
	WebElement CloneButton;
	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement CancelButton;
	///// **********Class Edit Icon****************///

	@FindBy(xpath = "(//div[@class='r-c-c icon-round-bg__grey cursor-pointer'])[1]")
	WebElement ClassEditIcon;
	@FindBy(xpath = "//input[@class='ant-input input-text-grey']")
	WebElement ClassName;
	@FindBy(xpath = "(//input[@class='ant-input input-text-grey flex-1 m-r-10'])[1]")
	WebElement SectionName;
	@FindBy(xpath = "(//div[@class='r-c-c icon-square-bg__yellow cursor-pointer m-l-20 m-r-20'])[1]")
	WebElement TransferIcon1;
	@FindBy(xpath = "//label[@class='ant-checkbox-wrapper m-b-20']")
	WebElement KeeptheSubjects;
	@FindBy(xpath = "//span[text()='Confirm']")
	WebElement Confirm;
	@FindBy(xpath = "(//span[text()='Cancel'])[2]")
	WebElement Cancel1;
	@FindBy(xpath = "(//span[text()='Cancel'])[1]")
	WebElement ClassCancel;
	@FindBy(xpath = "//span[text()='Save']")
	WebElement Save;
	@FindBy(xpath = "(//div[@class='r-c-c icon-square-bg__red cursor-pointer'])[1]")
	WebElement EditDeleteICon;

	///// **********Section Edit Icon****************///
	@FindBy(xpath = "(//div[@class='box-sequare__batch r-c-c-c cursor-pointer'])[1]")
	WebElement Class;
	@FindBy(xpath = "(//div[@class='r-c-c icon-round-bg__grey cursor-pointer'])[1]")
	WebElement SectionEditIcon;
	@FindBy(xpath = "(//input[@class='ant-input input-text-grey'])[1]")
	WebElement ClassName1;
	@FindBy(xpath = "(//input[@class='ant-input input-text-grey'])[2]")
	WebElement SectionName1;
	@FindBy(xpath = "//span[text()='Update']")
	WebElement Update;

	@FindBy(xpath = "//span[@class='anticon anticon-close ant-notification-close-icon']")
	WebElement PopUpClose;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public ClassroomPage() {
		PageFactory.initElements(driver, this);
	}

	public void ClickonClassrooms() throws InterruptedException {
		Thread.sleep(2000);
		Classrooms.click();
		Thread.sleep(2000);
	}

	public void Overview() throws InterruptedException {
		WebElement messagElement = driver.findElement(By.xpath("(//div[@class='text-xs dark-grey'])[1]"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		String exp = "Total number of classes";
		WebElement text = driver.findElement(By.xpath("(//div[@class='text-md color-black bold-600 '])[1]"));
		String message = text.getText();
		int TotalClasses = Integer.parseInt(message);
		if (exp.equals(act)) {
			System.out.println(" : - " +TotalClasses);
		}
		Thread.sleep(2000);
		WebElement messagElement1 = driver.findElement(By.xpath("(//div[@class='text-xs dark-grey'])[2]"));
		String act1 = messagElement1.getText();
		System.out.println("The actual text is:" + act1);
		String exp1 = "Total number of sections";
		WebElement text1 = driver.findElement(By.xpath("(//div[@class='text-md color-black bold-600 '])[2]"));
		String message1 = text1.getText();
		int TotalSections = Integer.parseInt(message1);
		if (exp1.equals(act1)) {
			System.out.println(" : -  " + TotalSections);
		}
		Thread.sleep(2000);
		WebElement messagElement2 = driver.findElement(By.xpath("(//div[@class='text-xs dark-grey'])[3]"));
		String act2 = messagElement2.getText();
		System.out.println("The actual text is:" + act2);
		String exp2 = "Total number of students";
		WebElement text2 = driver.findElement(By.xpath("(//div[@class='text-md color-black bold-600 '])[3]"));
		String message2 = text2.getText();
		int TotalStudents = Integer.parseInt(message2);
		if (exp2.equals(act2)) {
			System.out.println(" : - " +TotalStudents );
		}
		Thread.sleep(2000);
		WebElement messagElement3 = driver.findElement(By.xpath("(//div[@class='text-xs dark-grey'])[4]"));
		String act3 = messagElement3.getText();
		System.out.println("The actual text is:" + act3);
		String exp3 = "Avg. sections in a class";
		WebElement text3 = driver.findElement(By.xpath("(//div[@class='text-md color-black bold-600 '])[4]"));
		String message3 = text3.getText();
		int AvgSections = Integer.parseInt(message3);
		if (exp3.equals(act3)) {
			System.out.println(" : - " + AvgSections);
		}
		Thread.sleep(2000);
		WebElement messagElement4 = driver.findElement(By.xpath("(//div[@class='text-xs dark-grey'])[5]"));
		String act4 = messagElement4.getText();
		System.out.println("The actual text is:" + act4);
		String exp4 = "Avg. students in a class";
		WebElement text4 = driver.findElement(By.xpath("(//div[@class='text-md color-black bold-600 '])[5]"));
		String message4 = text4.getText();
		int AvgStudents = Integer.parseInt(message4);
		if (exp4.equals(act4)) {
			System.out.println(" : - " +AvgStudents);
		}
		
		
		int ActualAvgStudents=0;
		ActualAvgStudents=TotalStudents/TotalClasses;
		System.out.println("Actual Avg. students in a class  "+ActualAvgStudents);
		
		int ActualAvgSections=0;
		ActualAvgSections=TotalStudents/TotalSections;
		System.out.println("Actual Avg. sections in a class  "+ActualAvgSections);

	}

	public void CreateaNewClass(String SectionName) throws InterruptedException {
		Thread.sleep(2000);
		CreateClassButton.click();
		Thread.sleep(2000);
		String uuid = UUID.randomUUID().toString();
		ClassNameField.sendKeys(uuid);
		System.out.println(" Class Name is :-"+uuid);
		Thread.sleep(2000);
		SectionField.sendKeys(SectionName);
		Thread.sleep(2000);
		// CourseSelector.click();
		// Thread.sleep(2000);
		// Course1.click();
		// Thread.sleep(2000);
		Createbutton.click();
		
		WebElement messagElement = driver.findElement(By.xpath("//div[text()='Class Successfully Created!']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		String exp = "Class Successfully Created!";
		if (exp.equals(act)) {
			Thread.sleep(2000);
			MaybeLaterbutton.click();
			Thread.sleep(2000);

		} else {
			Thread.sleep(2000);
			Close.click();
			Thread.sleep(2000);
		}
		
	}

	public void AutomationClass() throws InterruptedException {
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
		Thread.sleep(1000);
		CSESection.click();
		Thread.sleep(2000);
	}
	public void AutomationClassECE() throws InterruptedException {
		Thread.sleep(1000);
		WebElement AutomationClass = driver.findElement(By.xpath("//div[text()='Automation Testing']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", AutomationClass);
		Thread.sleep(1000);
		ECESection.click();
		Thread.sleep(2000);
	}

	public void AddStudent(String StudentName) throws InterruptedException {
		Thread.sleep(2000);
		AutomationClass();
		Thread.sleep(2000);
		AddStudentsbutton.click();
		Thread.sleep(2000);
		SearchByName.sendKeys(StudentName);
		Thread.sleep(2000);
		SelStudentName.click();
		Thread.sleep(2000);
		Addbutton.click();
		Thread.sleep(2000);
		WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		String exp = "success";
		WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
		String message = text.getText();
		if (exp.equals(act)) {
			System.out.println("The success message is:  " + message);
			Thread.sleep(2000);
			PopUpClose.click();

		} else {
			System.out.println("The The failure messgae is: " + message);
			Thread.sleep(2000);
			PopUpClose.click();
			Thread.sleep(2000);
			Close.click();
			Thread.sleep(2000);
		}

	}
	public void PopUpContent()
	{
		WaitTil(2000);
		WebElement messagElement = driver.findElement(By.xpath("//div[@class='ant-notification-notice-content']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
	}

	public void ClassCreation() throws InterruptedException {
		WaitTil(2000);
		AutomationClass();
		WaitTil(2000);
		AddStudentsbutton.click();
		WaitTil(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='ant-select-item-option-content']"));
		int size = ele.size();
		for (int i = 0; i < size; i++) {
			driver.findElement(By.xpath("//span[@class='ant-input-affix-wrapper']")).sendKeys("mahendar");
			System.out.println("Searching Student name Entered");
			WaitTil(1000);
			ele.get(i).click();
			System.out.println("size ele clicked" + size);
			WaitTil(1000);
			Addbutton.click();
			System.out.println("add  Student clicked");
			WaitTil(2000);
			WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
			String act = messagElement.getText();
			System.out.println("The actual text is:" + act);
			String exp = "success";
			WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
			String message = text.getText();
			if (exp.equals(act)) {
				System.out.println("The success message is:  " + message);
				WaitTil(1000);
				PopUpClose.click();

			} else {
				System.out.println("The The failure messgae is: " + message);
				WaitTil(1000);
				PopUpClose.click();
				WaitTil(2000);
				SelStudentClose.click();
			}

		}

	}

	public void Curriculum() throws InterruptedException {
		Thread.sleep(2000);
		AutomationClass();
		WebElement AddSubjects = driver.findElement(By.xpath("//div[text()='Add Subjects']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", AddSubjects);
		Thread.sleep(1000);
		CreateSubjectbutton.click();
		Thread.sleep(2000);
		AddSubjectName1.sendKeys("Maths");
		Thread.sleep(2000);
		AddanotherSubject.click();
		Thread.sleep(2000);
		AddSubjectName2.sendKeys("Android Development");
		Thread.sleep(2000);
		Create.click();
		System.out.println("****** Subjects Created ************");
		Thread.sleep(2000);
		PopUpContent();
		Thread.sleep(1000);
		/*
		WebElement messagElement5 = driver.findElement(By.xpath("//div[@class='text-xs bold-600 text-center blue cursor-pointer m-t-10']"));
		String act5 = messagElement.getText();
        String exp="+ Add Chapters";
		AddChapters.click();
		Thread.sleep(2000);
		ChapterName1.sendKeys("Automation Testing");
		Thread.sleep(2000);
		AddAnotherChapterBtn.click();
		Thread.sleep(2000);
		ChapterName2.sendKeys("Android Development");
		Thread.sleep(2000);
		Add.click();
		Thread.sleep(2000);
		PopUpContent();
		Thread.sleep(1000);
		System.out.println("****** Chapters Created ************");
		Thread.sleep(2000);
		*/
		ChapterViewAll.click();
		Thread.sleep(2000);
		BackButton.click();
		Thread.sleep(2000);
		WebElement AddSubjects1 = driver.findElement(By.xpath("//div[text()='Add Subjects']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", AddSubjects1);
		ClickBrowse.click();
		Thread.sleep(2000);
		Resource();
		Thread.sleep(2000);

	}

	public void Resource() throws InterruptedException {
		Thread.sleep(2000);
		ClickonSection.click();
		Thread.sleep(2000);
		ChaptersOpen.click();
		Thread.sleep(2000);
		AddtoSection.click();
		Thread.sleep(2000);
		NoButton.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		ClickonSection.click();
		Thread.sleep(2000);
		AddtoSection.click();
		Thread.sleep(3000);
		List<WebElement> li = driver.findElements(By.xpath("//span[@class='ant-checkbox']"));
		int size = li.size();
		System.out.println(li);
		for (int i = 0; i < size; i++) {
			li.get(i).click();
		}
		Thread.sleep(2000);
		YesButton.click();
		Thread.sleep(2000);
		PopUpContent();
		Thread.sleep(2000);
	}

	public void EditCurriculum() throws InterruptedException {
		Thread.sleep(2000);
		Curriculum();
		Thread.sleep(2000);
		EditCurriculum.click();
		Thread.sleep(2000);
		ClickSubject.click();
		Thread.sleep(2000);
		EditIcon.click();
		WebElement textedit = Edittextfield;
		textedit.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		textedit.sendKeys(Keys.DELETE);
		textedit.sendKeys("Automated_Cars");
		Savebutton.click();
		Thread.sleep(2000);
		PopUpContent();
		Thread.sleep(2000);
		ClickSubject.click();
		Thread.sleep(2000);
		DeleteICon.click();
		Thread.sleep(2000);
		Cancelbutton.click();
		System.out.println("****** Delete Cancelled ************");
		Thread.sleep(2000);
		DeleteICon.click();
		Thread.sleep(2000);
		ConfirmButton.click();
		Thread.sleep(2000);
		PopUpContent();
		Thread.sleep(4000);
		ClickSubject.click();
		WebElement ele = driver.findElement(By.xpath("//span[@class='m-l-5 dark-grey']"));
		String actual = ele.getText();
		System.out.println("The Total Chapters are :-" + actual);
		String exp = "(" + "0" + ")";
		if (exp.equals(actual)) {
			driver.findElement(By.xpath("(//span[text()='Add Chapters'])[1]")).click();
			Thread.sleep(2000);
			ChapterName1.sendKeys("Automation Testing");
			Thread.sleep(2000);
			AddAnotherChapterBtn.click();
			Thread.sleep(2000);
			ChapterName2.sendKeys("Android Development");
			Thread.sleep(2000);
			Add.click();
			Thread.sleep(2000);
			PopUpContent();
			Thread.sleep(1000);

		} else {
			System.out.println("Chapters are there in Subject ");

		}
		Thread.sleep(2000);
		EditChapters1.click();
		Thread.sleep(2000);
		WebElement Edit = EditChapter1;
		Edit.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		Edit.sendKeys(Keys.DELETE);
		Edit.sendKeys("Mobile Automation");
		Thread.sleep(2000);
		Done.click();
		Thread.sleep(4000);
		ClickSubject.click();
		Thread.sleep(2000);
		EditChapters1.click();
		Thread.sleep(2000);
		SelectChapter1.click();
		Thread.sleep(2000);
		Delete.click();
		Thread.sleep(2000);
		Cancelbutton.click();
		Thread.sleep(2000);
		Delete.click();
		Thread.sleep(2000);
		ConfirmButton.click();
		Thread.sleep(2000);
		DottedButton();
		Thread.sleep(2000);

	}

	public void DottedButton() throws InterruptedException {
		Thread.sleep(2000);
		Dottedbutton.click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		CreateSubject.click();
		Thread.sleep(2000);
		AddSubjectName1.sendKeys("Maths");
		Thread.sleep(2000);
		AddanotherSubject.click();
		Thread.sleep(2000);
		AddSubjectName2.sendKeys("Android Development");
		Thread.sleep(2000);
		Create1.click();
		Thread.sleep(2000);
		PopUpContent();
		System.out.println("****** Subjects Created ************");
		Thread.sleep(3000);
		Dottedbutton.click();
		Thread.sleep(3000);
		BrowseSubjects.click();
		Thread.sleep(2000);
		Resource();
		Thread.sleep(2000);
		for(int i=0;i<6;i++)
		{
			Thread.sleep(2000);
			BackButton.click();
			Thread.sleep(2000);
		}

	}



	public void ValidateStudentViewDetails() throws InterruptedException {
		AutomationClass();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[@class='dark-grey']"));
		String actual = ele.getText();
		System.out.println("The Total Students are :-" + actual);
		String exp = "(" + "0" + ")";
		if (exp.equals(actual)) {
			System.out.println("Zero Students are in The Class Please add Students");
			Thread.sleep(2000);
			BackButton.click();

		} else {
			Thread.sleep(2000);
			ViewDetails.click();
			Thread.sleep(2000);
			SelectStudent1.click();
			Thread.sleep(2000);
			Transfer.click();
			Thread.sleep(2000);
			Cancel.click();
			Thread.sleep(2000);
			Unassign.click();
			Thread.sleep(2000);
			No.click();
			Thread.sleep(2000);
			TransferIcon.click();
			Thread.sleep(2000);
			Cancel.click();
			Thread.sleep(2000);
			UnassignIcon.click();
			Thread.sleep(2000);
			No.click();
			Thread.sleep(2000);
			WebElement ViewDetailsStudentName = driver.findElement(By.xpath("(//div[@class='m-l-10 color-black bold-600 text-xs'])[1]"));
			String StudentName = ViewDetailsStudentName.getText();
			WebElement s = driver.findElement(By.xpath("//input[@class='ant-input ant-input-lg']"));
			s.sendKeys(StudentName);
			Thread.sleep(2000);
			s.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			BackButton.click();
			Thread.sleep(2000);
			BackButton.click();
		}

	}
    
    public void TransferStudents() throws InterruptedException
    {
    	AutomationClass();
    	WaitTil(2000);
		WebElement ele = driver.findElement(By.xpath("//span[@class='dark-grey']"));
		String actual = ele.getText();
		System.out.println("The Total Students are :-" + actual);
		String exp = "(" + "0" + ")";
		if (exp.equals(actual)) {
			System.out.println("Zero Students are in The Class Please add Students");
			Thread.sleep(2000);
			BackButton.click();

		} else {
			WaitTil(2000);
			ViewDetails.click();
			WaitTil(2000);
			TransferStudent();
			WaitTil(2000);
			IconTransferStudent();
			WaitTil(2000);
			BackButton.click();
			WaitTil(2000);
			BackButton.click();
			
		}
    }
    public void UnassignAndAddStudents() throws InterruptedException
    {
    	AutomationClass();
    	WaitTil(2000);
		WebElement ele = driver.findElement(By.xpath("//span[@class='dark-grey']"));
		String actual = ele.getText();
		System.out.println("The Total Students are :-" + actual);
		String exp = "(" + "0" + ")";
		if (exp.equals(actual)) {
			System.out.println("Zero Students are in The Class Please add Students");
			Thread.sleep(2000);
			BackButton.click();

		} else {
			WaitTil(2000);
			ViewDetails.click();
			WaitTil(2000);
			UnassignStudent();
			WaitTil(2000);
			IconUnassignStudent();
			WaitTil(2000);
			BackButton.click();
			WaitTil(2000);
			BackButton.click();
			
		}
    }

	public void TransferStudent() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//span[@class='dark-grey']"));
		String actual1 = ele1.getText();
		System.out.println("The Total Students are :-" + actual1);
		String exp1 = "(" + "0" + ")";
		if (exp1.equals(actual1)) {
			System.out.println("Zero Students are in The Class Please add Students");

		} else {
			Thread.sleep(2000);
			SelectStudent1.click();
			Thread.sleep(2000);
			Transfer.click();
			Thread.sleep(2000);
			StandardSelector.click();
			Thread.sleep(2000);
			SelectClass1.click();
			Thread.sleep(2000);
			SectionSelector.click();
			Thread.sleep(2000);
			Section1.click();
			Thread.sleep(2000);
			Transferbutton1.click();
			Thread.sleep(2000);
			PopUpContent();
		}

	}

	public void IconTransferStudent() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//span[@class='dark-grey']"));
		String actual1 = ele1.getText();
		System.out.println("The Total Students are :-" + actual1);
		String exp1 = "(" + "0" + ")";
		if (exp1.equals(actual1)) {
			System.out.println("Zero Students are in The Class Please add Students");

		} else {
			Thread.sleep(2000);
			SelectStudent1.click();
			Thread.sleep(2000);
			TransferIcon.click();
			Thread.sleep(2000);
			StandardSelector.click();
			Thread.sleep(2000);
			SelectClass1.click();
			Thread.sleep(2000);
			SectionSelector.click();
			Thread.sleep(2000);
			Section1.click();
			Thread.sleep(2000);
			Transferbutton1.click();
			Thread.sleep(2000);
			PopUpContent();
		}
	}
	public void UnassignStudent() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//span[@class='dark-grey']"));
		String actual1 = ele1.getText();
		System.out.println("The Total Students are :-" + actual1);
		String exp1 = "(" + "0" + ")";
		if (exp1.equals(actual1)) {
			System.out.println("Zero Students are in The Class Please add Students");

		} else {
			WebElement ViewDetailsStudentName = driver.findElement(By.xpath("(//div[@class='m-l-10 color-black bold-600 text-xs'])[1]"));
			String StudentName = ViewDetailsStudentName.getText();
			Thread.sleep(2000);
			SelectStudent1.click();
			Thread.sleep(2000);
			Unassign.click();
			Thread.sleep(2000);
			Yes.click();
			Thread.sleep(2000);
			PopUpContent();
			Thread.sleep(2000);
			AddStudentsbutton.click();
			Thread.sleep(2000);
			SearchByName.sendKeys(StudentName);
			Thread.sleep(2000);
			SelStudentName.click();
			Thread.sleep(2000);
			Addbutton.click();
			Thread.sleep(2000);
			WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
			String act = messagElement.getText();
			System.out.println("The actual text is:" + act);
			String exp = "success";
			WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
			String message = text.getText();
			if (exp.equals(act)) {
				System.out.println("The success message is:  " + message);
				PopUpClose.click();

			} else {
				System.out.println("The The failure messgae is: " + message);
				PopUpClose.click();
				Thread.sleep(2000);
				Close.click();
				Thread.sleep(2000);
			}

		}

	}


	public void IconUnassignStudent() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//span[@class='dark-grey']"));
		String actual1 = ele1.getText();
		System.out.println("The Total Students are :-" + actual1);
		String exp1 = "(" + "0" + ")";
		if (exp1.equals(actual1)) {
			System.out.println("Zero Students are in The Class Please add Students");

		} else {
			WebElement ViewDetailsStudentName = driver.findElement(By.xpath("(//div[@class='m-l-10 color-black bold-600 text-xs'])[1]"));
			String StudentName = ViewDetailsStudentName.getText();
			System.out.println(StudentName);
			Thread.sleep(2000);
			SelectStudent1.click();
			Thread.sleep(2000);
			UnassignIcon.click();
			Thread.sleep(2000);
			Yes.click();
			Thread.sleep(2000);
			PopUpContent();
			Thread.sleep(2000);
			AddStudentsbutton.click();
			Thread.sleep(2000);
			SearchByName.sendKeys(StudentName);
			Thread.sleep(2000);
			SelStudentName.click();
			Thread.sleep(2000);
			Addbutton.click();
			Thread.sleep(2000);
			WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
			String act = messagElement.getText();
			System.out.println("The actual text is:" + act);
			String exp = "success";
			WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
			String message = text.getText();
			if (exp.equals(act)) {
				System.out.println("The success message is:  " + message);
				Thread.sleep(2000);

			} else {
				System.out.println("The The failure messgae is: " + message);
				Thread.sleep(2000);
				Close.click();
				Thread.sleep(2000);
			}

		}
	}

	public void AddASection() throws InterruptedException {
		Thread.sleep(1000);
		WebElement Class = driver.findElement(By.xpath("//div[text()='0']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)", Class);
		Thread.sleep(1000);
		PlusIcon.click();
		Thread.sleep(2000);
		CancelButton.click();
		Thread.sleep(2000);
		PlusIcon.click();
		Thread.sleep(2000);
		NewSectionName.sendKeys("JME");
		Thread.sleep(2000);
		CourseNameSelector.click();
		Thread.sleep(2000);
		Course.click();
		Thread.sleep(2000);
		CreateButton.click();
		Thread.sleep(2000);
		WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		String exp = "success";
		WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
		String message = text.getText();
		if (exp.equals(act)) {
			System.out.println("The success message is:  " + message);
			Thread.sleep(2000);
			MaybeLaterbutton.click();

		} else {
			System.out.println("The The failure messgae is: " + message);
			Thread.sleep(2000);
			CancelButton.click();
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		PlusIcon.click();
		Thread.sleep(2000);
		CloneSubject1.click();
		Thread.sleep(2000);
		NewSectionName.sendKeys("JSE");
		Thread.sleep(2000);
		CloneButton.click();
		Thread.sleep(2000);
		WebElement messagElement1 = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
		String act1 = messagElement1.getText();
		System.out.println("The actual text is:" + act1);
		String exp1 = "success";
		WebElement text1 = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
		String message1 = text1.getText();
		if (exp1.equals(act1)) {
			System.out.println("The success message is:  " + message1);

		} else {
			System.out.println("The The failure messgae is: " + message1);
			Thread.sleep(2000);
			CancelButton.click();
			Thread.sleep(2000);
		}
	}

	public void UpdateSectionDetails() throws InterruptedException {
		Thread.sleep(2000);
		Class.click();
		Thread.sleep(3000);
		SectionEditIcon.click();
		Thread.sleep(2000);
		WebElement e = ClassName1;
		e.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		e.sendKeys(Keys.DELETE);
		e.sendKeys("0");
		Thread.sleep(2000);
		WebElement ele = SectionName1;
		ele.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		ele.sendKeys(Keys.DELETE);
		ele.sendKeys("C");
		// Thread.sleep(1000);
		// CourseNameSelector.click();
		// Thread.sleep(2000);
		// Course.click();
		Thread.sleep(2000);
		Update.click();
		Thread.sleep(2000);
		PopUpContent();
		WaitTil(2000);
		BackButton.click();
		
	}

	public void EditClassDetails() throws InterruptedException {
		Thread.sleep(2000);
		ClassEditIcon.click();
		Thread.sleep(2000);
		ClassCancel.click();
		Thread.sleep(2000);
		ClassEditIcon.click();
		Thread.sleep(2000);
		WebElement e = ClassName;
		e.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		e.sendKeys(Keys.DELETE);
		e.sendKeys("0");
		Thread.sleep(2000);
		WebElement ele = SectionName;
		ele.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		ele.sendKeys(Keys.DELETE);
		ele.sendKeys("AC");
		Thread.sleep(2000);
		CourseNameSelector1.click();
		Thread.sleep(3000);
		Course.click();
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
		WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		String exp = "success";
		WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
		String message = text.getText();
		if (exp.equals(act)) {
			System.out.println("The success message is:  " + message);

		} else {
			System.out.println("The The failure messgae is: " + message);
			ClassCancel.click();
			Thread.sleep(2000);
		}
	}

	public void ClassEditTransferIcon() throws InterruptedException {
		Thread.sleep(2000);
		ClassEditIcon.click();
		Thread.sleep(2000);
		TransferIcon1.click();
		Thread.sleep(2000);
		ClassCancel.click();
		Thread.sleep(2000);
		ClassEditIcon.click();
		Thread.sleep(2000);
		TransferIcon1.click();
		Thread.sleep(2000);
		CourseNameSelector1.click();
		Thread.sleep(3000);
		Course.click();
		Thread.sleep(2000);
		ClassName1.sendKeys("AB");
		Thread.sleep(2000);
		KeeptheSubjects.click();
		Thread.sleep(2000);
		Transfer.click();
		Thread.sleep(2000);
		WebElement messagElement = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		String exp = "success";
		WebElement text = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
		String message = text.getText();
		if (exp.equals(act)) {
			System.out.println("The success message is:  " + message);

		} else {
			System.out.println("The The failure messgae is: " + message);
			ClassCancel.click();
			Thread.sleep(2000);
		}
	}

	public void ClassDelete() throws InterruptedException {
		Thread.sleep(2000);
		ClassEditIcon.click();
		Thread.sleep(2000);
		EditDeleteICon.click();
		Thread.sleep(2000);
		WebElement messagElement = driver.findElement(By.xpath("//span[@class='ant-modal-confirm-title']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		String exp = "Not Allowed";
		if (exp.equals(act)) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='OK']")).click();
			Thread.sleep(2000);
			ClassCancel.click();
			Thread.sleep(2000);
		} else {
			Thread.sleep(2000);
			Cancel1.click();
			Thread.sleep(2000);
			EditDeleteICon.click();
			Thread.sleep(2000);
			Confirm.click();
			Thread.sleep(2000);
			Savebutton.click();
			Thread.sleep(2000);
			WebElement messagElement1 = driver.findElement(By.xpath("//*[@class='ant-notification-notice-message']"));
			String act1 = messagElement1.getText();
			System.out.println("The actual text is:" + act1);
			String exp1 = "success";
			WebElement text1 = driver.findElement(By.xpath("//*[@class='ant-notification-notice-description']"));
			String message1 = text1.getText();
			if (exp1.equals(act1)) {
				System.out.println("The success message is:  " + message1);

			} else {
				System.out.println("The The failure messgae is: " + message1);
				ClassCancel.click();
				Thread.sleep(2000);
			}

		}

	}

}
