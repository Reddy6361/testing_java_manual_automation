package selenium_session_1;

import org.openqa.selenium.chrome.ChromeDriver;

/*Chrome:
 * 1) chrome driver download and copy to project main folder.
 * 2) browser to run we need execution Engine which is chrome driver.
 * */
public class Ex3 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); // 1st step
		driver.get("http://www.facebook.com"); // launch web site of given link //2nd step
	}
}
