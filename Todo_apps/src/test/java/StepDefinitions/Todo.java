package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Pages.Todo_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Todo {
	
	WebDriver driver;
	Todo_Page todoPage =new Todo_Page();
	
	@Given("user login to TODOs list")
	public void user_login_to_tod_os_list() {
		todoPage.TodoPagelogin();
	}

	@Given("user verify the TODOs page")
	public void user_verify_the_TODOs_page() {
		todoPage.verifyTitle();	
	}
	
	@When("user writes in the TODO field")
	public void user_writes_in_the_todo_field() {
		todoPage.enterTodoFunction("Adding Todo action");
		todoPage.clickEnterTodoFunction();	   
	}

	@Then("user removes first TODO item")
	public void user_removes_first_todo_item() {
	    todoPage.removeTodoFunction();
	}

	@Given("user adds the first TODOs item")
	public void user_adds_the_first_tod_os_item() {
		todoPage.enterTodoFunction("Adding First Todo action");
		todoPage.clickEnterTodoFunction();   
	}

	@Given("user adds the second TODOs item")
	public void user_adds_the_second_tod_os_item() {
		todoPage.enterTodoFunction("Adding second Todo action");
		todoPage.clickEnterTodoFunction();
	}

	@Given("user adds the third TODOs item")
	public void user_adds_the_third_tod_os_item() {
		todoPage.enterTodoFunction("Adding Third Todo action");
		todoPage.clickEnterTodoFunction();
	}

	@And("user able to complete created TODO list")
	public void user_able_to_complete_created_todo_list() {
		todoPage.checkTodoFunction();
	}

	@Then("user able to clear completed TODO list")
	public void user_able_to_clear_completed_todo_list() {
		todoPage.clearCompletedTodoFunction();
	}
    
	@Then("user removes first TODO item added")
	public void user_removes_first_todo_item_added() {
	    todoPage.removeTodoFunctionadded();
	}
	
	@Then("user able to edit and save TODO list")
	public void user_able_to_edit_and_save_todo_list() {
	   todoPage.editTodoFunction("Edited action");
	}
	
	@Given("user verify the TODOs page Title")
	public void user_verify_the_tod_os_page_title() {  
	   todoPage.todoPageWrongURLTitleVerify();	
	}
	
	@Then("user should not able to edit and save empty TODO list")
	public void user_should_not_able_to_edit_and_save_empty_todo_list() {
	    todoPage.emptyTodoList();
	}
	
	@Then("user should not able to save the empty Todo list")
	public void user_should_not_able_to_save_the_empty_todo_list() {
		todoPage.emptyTodoListRemove();
	}

}
