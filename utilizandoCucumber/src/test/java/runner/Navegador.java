package runner;

import org.openqa.selenium.edge.EdgeDriver;

import drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navegador extends Drivers {

	public static void abrirNavegador() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");

	}
	public static void fecharNavegador () {
		driver.quit();
	}
}
