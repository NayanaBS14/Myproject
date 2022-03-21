package Pages;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Todo_Page {
	
	WebDriver driver;
		 	
	By todoInput =By.xpath("//input[@placeholder=\"What needs to be done?\"]");
	By todoListLabel =By.xpath("//label[contains(text(),'Adding Todo action')]");
	By todoListLabeladd =By.xpath("//label[contains(text(),'Adding First Todo action')]");
	By todoListLabelClear =By.xpath("//label[contains(text(),'')]");
	By todoListRemove =By.xpath("//button[@class='destroy'][1]");
	By todoListCheck =By.xpath("//input[@class='toggle'][1]");
	By todoClearCompleted =By.xpath("//button[@class='clear-completed']");
	By todoClickEdit =By.xpath("//input[@class='edit']");
	
	public void TodoPagelogin(){
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://todomvc.com/examples/angular2/");
		driver.manage().window().maximize();
	}
	
	public void verifyTitle()
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "Angular2 • TodoMVC";
		assertEquals(expectedTitle,actualTitle);	
	    driver.quit();
	}
		
	public void enterTodoFunction(String action) {
		driver.findElement(todoInput).sendKeys(action);
		
	}
	
    public void clickEnterTodoFunction() {
    	driver.findElement(todoInput).sendKeys(Keys.ENTER);
    }
    
    public void checkTodoFunction() {
    	driver.findElement(todoListCheck).click();
    }
    
    public void clearCompletedTodoFunction() {
    	driver.findElement(todoClearCompleted).click();
    	driver.quit();
    }
      
    public void removeTodoFunction() {
    	driver.findElement(todoListLabel).click();
    	driver.findElement(todoListRemove).click();
    	driver.quit();
	} 
    
    public void removeTodoFunctionadded() {
    	driver.findElement(todoListLabeladd).click();
    	driver.findElement(todoListRemove).click();
    	driver.quit();
	}
      
   public void editTodoFunction(String editedText) {
	   Actions actions = new Actions(driver);
	   WebElement elementLocator = driver.findElement(todoListLabeladd);
	   WebElement elementLocatorClear = driver.findElement(todoListLabelClear);
	   actions.doubleClick(elementLocator).perform();
	   driver.findElement(todoClickEdit).click();
	   driver.findElement(todoClickEdit).clear();
	   actions.doubleClick(elementLocatorClear).perform();
	   driver.findElement(todoClickEdit).click();
	   driver.findElement(todoClickEdit).sendKeys(editedText);
	   clickEnterTodoFunction();
	   driver.quit();
   }
     
   public void todoPageWrongURLTitleVerify(){
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://todomvc.com/examples/angular3/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Page not found · GitHub Pages";
		assertEquals(expectedTitle,actualTitle);	
	    driver.quit();	    
	}
   
   public void emptyTodoList()
   {
	   Actions actions = new Actions(driver);
	   WebElement elementLocator = driver.findElement(todoListLabeladd);
	   actions.doubleClick(elementLocator).perform();
	   driver.findElement(todoClickEdit).click();
	   driver.findElement(todoClickEdit).clear();	 
   }
   
   public void emptyTodoListRemove()
   {
	   Actions actions = new Actions(driver);
	   WebElement elementLocator = driver.findElement(todoListLabeladd);
	   WebElement elementLocatorClear = driver.findElement(todoListLabelClear);
	   actions.doubleClick(elementLocator).perform();
	   driver.findElement(todoClickEdit).click();
	   driver.findElement(todoClickEdit).clear();
	   actions.doubleClick(elementLocatorClear).perform();
	   driver.findElement(todoClickEdit).click();
	   driver.findElement(todoClickEdit).sendKeys(Keys.ENTER);
	   driver.quit();
   }
	 
}
