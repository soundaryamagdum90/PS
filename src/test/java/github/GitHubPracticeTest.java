package github;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GitHubPracticeTest {
	@Test
	public void githubsPractice() {
		Reporter.log("Hii Github",true);
		String Browser=System.getProperty("browser");
		System.out.println(Browser);
	}


}
