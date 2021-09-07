package selenium_session_1;

import org.openqa.selenium.firefox.FirefoxDriver;

/*Fire-Fox:
 * 1) gecko driver download and copy to project main folder.
 * 2) browser to run we need execution Engine which is gecko driver.
 * */
public class Ex2 {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver(); // 1st step
		driver.get("http://www.facebook.com"); // launch web site of given link //2nd step
	}
}
