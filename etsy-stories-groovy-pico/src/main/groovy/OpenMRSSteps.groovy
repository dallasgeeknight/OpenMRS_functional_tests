import com.github.tanob.groobe.GrooBe
import org.jbehave.core.annotations.*
import pages.*

public class OpenMRSSteps {

  Login login
  Home home

  @Given("I am on the login page")
  public void givenIAmOnTheLoginPage(){
    login.go()
  }

  @When("I enter admin for user")
  public void whenIEnterAdminForUser(){
    login.fillUser("admin")
  }

  @When("I enter xxxxxx for password")
  public void whenIEnterXxxxxxForPassword(){
    login.fillPassword("xxxxxx")
  }

  @When("click submit")
  public void whenClickSubmit(){
    login.clickSubmit()
    sleep(5000)
  }

  @Then("I am logged in")
  public void thenIAmLoggedIn(){
    home.isLoggedIn()
  }

  @Then("I am not logged in")
  public void thenIAmNotLoggedIn(){
    login.isNotLoggedIn()
  }

  @When("I enter OpenMRS1 for password")
  public void whenIEnterOpenMRS1ForPassword(){
    login.fillPassword("OpenMRS1")
   }


}
