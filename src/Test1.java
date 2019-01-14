import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PARESHAN\\Desktop\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/webtable/file.html");
		driver.manage().window().maximize();
		List<WebElement> tr=driver.findElements(By.tagName("tr"));
		System.out.println(tr.size());
		for(WebElement row : tr) {
			List<WebElement> td=row.findElements(By.tagName("tr"));
			System.out.println(td.size());
			for(WebElement col : td) {
				System.out.println(col.getText());
			}
		}
		
	}

}
