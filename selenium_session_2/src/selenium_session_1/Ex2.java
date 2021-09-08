package selenium_session_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*X path*/
/* * Note:
 * Steps to get X-path:
 * 1) inspect the field which we want to get the xpath.
 * 2) select element
 * 3) right click
 * 4) copy
 * 5) copy full X-path
 * */
/*Hierarchy:
 * 1) HTML
 * 2) body
 * 3) input
 * --> HTML/body/input (it will never be same)
 * 
 * */
public class Ex2 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/hris-hr-software-demo/");
		driver.findElement(
				By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div/div/form/fieldset/div[4]/div/input"))
				.sendKeys("6361317502");
	}
}
