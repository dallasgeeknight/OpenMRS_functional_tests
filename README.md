# OpenMRS being tested with JBehave, Groovy, Selenium 2.0

## Running the stories

This will run the build and (after a minute or so) Firefox will open and test the etsy.com website:

    mvn install 

You should see Firefox (installed on your system) flicker as it tests Etsy.com

This will run a single story (one contained in a login.story file):

    mvn install -DstoryFilter=login

TODO - This will run a suite based on the meta filters in the three story files:

TODO     mvn install -Dmeta.filter="+color red"

This will run tests in parallel in SauceLabs' stack (if you use the SauceLabs tunnel):

(use YOUR details from YOUR [SauceLabs.com](http://saucelabs.com) account)

    mvn install -DSAUCE_USERNAME=your_sauce_id -DSAUCE_ACCESS_KEY=your_sauce_access_key

## Viewing the results

In a directory target/view, a page named 'navigator.html' has been generated.  If you open that in Firefox, Safari or Internet Explorer (but not Chrome), you can see the three stories that have run and their completion status.

There should be a row for each story.  The rows are double-clickable to see the details of the story run.

PS - The navigator.html output is actually from http://paul-hammant.github.com/StoryNavigator/downloads.html and unzipped into src/main/storynavigator/ so that it can be customized if needed.  Get a fresh copy, rather than use the one checked into the JBehave tutorial.



