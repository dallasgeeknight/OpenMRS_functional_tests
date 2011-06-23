package pages

import java.util.concurrent.TimeUnit
import org.jbehave.web.selenium.WebDriverProvider
import org.openqa.selenium.By

class Home extends BasePage {

  def Home(WebDriverProvider webDriverProvider) {
    super(webDriverProvider)
  }

  def isLoggedIn() {
    getPageSource().shouldContain "Currently logged in as", "not logged in"
  }

}
