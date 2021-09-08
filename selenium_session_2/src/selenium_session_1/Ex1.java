package selenium_session_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*LOCATORS:
 * step1: Study HTML attributes.
 * step2:Email
 * Note:
 *  1) to type into given field use .sendKeys("");
 *  2) we can use [1]id attribute , if there is no id field search for other
 *  locater i.e, [2]name, [3] best way is X-path what industries use.
 * */
public class Ex1 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/hris-hr-software-demo/");
		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("pankaj");// 1st way to access the fields in
																					// html
		driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("mutha");
		driver.findElement(By.name("Email")).sendKeys("pankaj@gmail.com");// 2nd way to access the fields in html
		driver.findElement(
				By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div/div/form/fieldset/div[4]/div/input"))
				.sendKeys("6361317502");// 3rd way to access the fields in html
	}
}
