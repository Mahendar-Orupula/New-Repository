package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Aulas_Base.BaseTest;

public class CoursePage extends BaseTest
{
	//@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[1]/li[4]")
	@FindBy(xpath="//a[@href ='/course']")
	WebElement Course;
	@FindBy(xpath="//button[@class='ant-btn']")
	WebElement AddCourse;
	@FindBy(xpath="(//input[@class='ant-input'])[1]")
	WebElement CourseName;
	@FindBy(xpath="(//input[@class='ant-input'])[4]")
	WebElement CourseDuration;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[1]")
	WebElement CourseDurationIn;
	@FindBy(xpath="//div[text()='Day(s)']")
	WebElement CourseDurationInDays;
	@FindBy(xpath="//div[text()='Month(s)']")
	WebElement CourseDurationInMonths;
	@FindBy(xpath="//div[text()='Year(s)']")
	WebElement CourseDurationInYears;
	@FindBy(xpath="(//input[@class='ant-input'])[2]")
	WebElement Description;
	@FindBy(xpath="(//div[@class='ant-picker datePicker'])[1]")
	WebElement StartDate;
	@FindBy(xpath="(//button[@class='ant-picker-header-next-btn'])[1]")
	WebElement NextMonth;
	@FindBy(xpath="(//div[@class='ant-picker-cell-inner'])[9]")
	WebElement Date1;
	@FindBy(xpath="(//div[@class='ant-picker datePicker'])[2]")
	WebElement EndDate;
	@FindBy(xpath="(//button[@class='ant-picker-header-super-next-btn'])[2]")
	WebElement NextYear;
	@FindBy(xpath="(//div[@class='ant-picker-cell-inner'])[71]")
	WebElement Date2;
	@FindBy(xpath="(//input[@class='ant-input'])[3]")
	WebElement TotalCourseFee;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[2]")
	WebElement BillingPlan;
	@FindBy(xpath="//div[text()='Monthly']")
	WebElement MonthlyPlan;
	@FindBy(xpath="//div[text()='Quarterly']")
	WebElement QuarterlyPlan;
	@FindBy(xpath="//div[text()='Half Yearly']")
	WebElement HalfYearlyPlan;
	@FindBy(xpath="//div[text()='Annually']")
	WebElement AnnuallyPlan;
	@FindBy(xpath="(//div[text()='One time'])[2]")
	WebElement OneTimePlan;
	@FindBy(xpath="//div[text()='One time']")
	WebElement OneTimePlan1;
	@FindBy(xpath="//div[text()='Customize']")
	WebElement CustomizePlan;
	@FindBy(xpath="(//input[@class='ant-input'])[5]")
	WebElement FirstInstalment;
	@FindBy(xpath="//div[text()='+ADD INSTALLMENT']")
	WebElement ADDINSTALLMENT;
	@FindBy(xpath="(//input[@class='ant-input'])[6]")
	WebElement SecondInstalment;
	@FindBy(xpath="(//button[@class='ant-btn'])[2]")
	WebElement CancelButton;
	@FindBy(xpath="(//button[@class='ant-btn'])[3]")
	WebElement AddButton;
	//**************Deletecourse********************//
	@FindBy(xpath="(//div[@class='box-shadow courseCardB'])[1]")
	WebElement OpenCourse;
	@FindBy(xpath="(//button[@class='ant-btn'])[2]")
	WebElement CourseUpdate;
	@FindBy(xpath="//div[@class='ant-page-header-back-button']")
	WebElement BackButton;
	
	
	@FindBy(xpath="(//button[@class='ant-btn'])[1]")
	WebElement CourseDelete;
	@FindBy(xpath="//span[@class='ant-input-affix-wrapper ant-input-affix-wrapper-lg']/input")
	WebElement CourseSearch;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-lg ant-btn-icon-only ant-input-search-button']")
	WebElement CourseSearchButton;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement CourseDeleteYes;
	@FindBy(xpath="(//button[@class='ant-btn'])[3]")
	WebElement CourseDeleteNo;
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	public CoursePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickonCourse() throws InterruptedException
	{
		Thread.sleep(1000);
		Course.click();
		Thread.sleep(1000);

	}
	public void CancelCourse() throws InterruptedException
	{
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CancelButton.click();
		Thread.sleep(2000);
		
	}
	public void Course1(String Name,String Duration,String Des,String Fee) throws InterruptedException
	{
		Thread.sleep(1000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys(Name);
		Thread.sleep(2000);
		CourseDuration.sendKeys(Duration);
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInYears.click();
		Thread.sleep(2000);
		Description.sendKeys(Des);
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys(Fee);
		Thread.sleep(2000);
		WebElement CourseFeePlan5 = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan5);
      	Thread.sleep(1000);
		BillingPlan.click();
		Thread.sleep(2000);
		AnnuallyPlan.click();
		Thread.sleep(2000);
		AddButton.click();
		Thread.sleep(2000);
		WebElement messagElement = driver.findElement(By.xpath("//div[@class='ant-notification-notice-content']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		Thread.sleep(2000);
	}
	public void Course2(String Name,String Duration,String Des,String Fee,String fee1,String fee2) throws InterruptedException
	{
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys(Name);
		Thread.sleep(2000);
		CourseDuration.sendKeys(Duration);
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInMonths.click();
		Thread.sleep(2000);
		Description.sendKeys(Des);
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys(Fee);
		Thread.sleep(2000);
		WebElement CourseFeePlan9 = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan9);
      	Thread.sleep(2000);
		BillingPlan.click();
		Thread.sleep(2000);
		CustomizePlan.click();
		Thread.sleep(2000);
		FirstInstalment.sendKeys(fee1);
		Thread.sleep(2000);
		ADDINSTALLMENT.click();
		Thread.sleep(2000);
		SecondInstalment.sendKeys(fee2);
		Thread.sleep(2000);
		AddButton.click();
		Thread.sleep(2000);
		WebElement messagElement = driver.findElement(By.xpath("//div[@class='ant-notification-notice-content']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		Thread.sleep(2000);

	}
	public void Course3(String Name,String Duration,String Des,String Fee) throws InterruptedException
	{
		Thread.sleep(2000);
		AddCourse.click();
		Thread.sleep(2000);
		CourseName.sendKeys(Name);
		Thread.sleep(2000);
		CourseDuration.sendKeys(Duration);
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInDays.click();
		Thread.sleep(2000);
		Description.sendKeys(Des);
		Thread.sleep(2000);
		StartDate.click();
		Thread.sleep(2000);
		NextMonth.click();
		Thread.sleep(2000);
		Date1.click();
		Thread.sleep(2000);
		TotalCourseFee.sendKeys(Fee);
		Thread.sleep(2000);
		WebElement CourseFeePlan10 = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan10);
      	Thread.sleep(2000);
		BillingPlan.click();
		Thread.sleep(2000);
		OneTimePlan.click();
		Thread.sleep(2000);
		AddButton.click();
		Thread.sleep(2000);
		WebElement messagElement = driver.findElement(By.xpath("//div[@class='ant-notification-notice-content']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		Thread.sleep(2000);

	}

	
	public void SearchCourse(String Name) throws InterruptedException
	{
		Thread.sleep(2000);
		CourseSearch.sendKeys(Name);
		Thread.sleep(2000);
		CourseSearchButton.click();
		Thread.sleep(2000);
		
	}
	
	public void CourseUpdate() throws InterruptedException
	{
		Thread.sleep(2000);
		OpenCourse.click();
		Thread.sleep(2000);
		CourseDurationIn.click();
		Thread.sleep(2000);
		CourseDurationInYears.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		WebElement CourseFeePlan = driver.findElement(By.xpath("//div[text()='Course Fee Plan']"));
		Thread.sleep(1000);
      	js.executeScript("arguments[0].scrollIntoView(true)", CourseFeePlan);
      	Thread.sleep(2000);
		BillingPlan.click();
		Thread.sleep(2000);
		MonthlyPlan.click();
		Thread.sleep(2000);
		CourseUpdate.click();
		Thread.sleep(2000);
		WebElement messagElement = driver.findElement(By.xpath("//div[@class='ant-notification-notice-content']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		Thread.sleep(2000);
		
	}
	public void CourseDelete() throws InterruptedException
	{
		Thread.sleep(2000);
		OpenCourse.click();
		Thread.sleep(1000);
		CourseDelete.click();
		Thread.sleep(2000);
		CourseDeleteNo.click();
		Thread.sleep(1000);
		CourseDelete.click();
		Thread.sleep(2000);
		CourseDeleteYes.click();
		Thread.sleep(2000);
		WebElement messagElement = driver.findElement(By.xpath("//div[@class='ant-notification-notice-content']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		Thread.sleep(2000);
	}

	
	
	
	
	
	}
	
	

		
	
