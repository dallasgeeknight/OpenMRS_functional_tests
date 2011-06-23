package pages

import java.util.concurrent.TimeUnit
import org.jbehave.web.selenium.WebDriverProvider
import org.openqa.selenium.By

class Login extends BasePage {

  def Login(WebDriverProvider webDriverProvider) {
    super(webDriverProvider)
  }

  def go() {
    get("http://localhost:8080/openmrs/")
  }

  def fillUser(String name) {
    findElement(By.id("username")).sendKeys(name)
  }

  def fillPassword(String password) {
    findElement(By.id("password")).sendKeys(password)
  }

  def clickSubmit() {
    findElement(By.xpath("//input[@type = 'submit']")).click()
  }

  def isNotLoggedIn(){
    getPageSource().shouldContain "Invalid username/password", "should not be logged in"
  }

}
