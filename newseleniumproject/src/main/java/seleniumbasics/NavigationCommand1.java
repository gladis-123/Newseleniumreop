package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationCommand1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver obj1=new EdgeDriver();
obj1.manage().window().maximize();
obj1.get("https://www.selenium.dev/about");
obj1.navigate().back();
obj1.navigate().forward();
obj1.navigate().refresh();
obj1.navigate().to("https://www.seleniumeasy.com");
obj1.close();


	}

}
