package base;

import java.io.FileInputStream;
import java.util.Properties;

public class TestBaseClass {

	// public static WebDriver driver;
	public static Properties prop;

	public TestBaseClass() throws Exception {

		prop = new Properties();

		FileInputStream ip = new FileInputStream("Properties\\config.properties");
		prop.load(ip);

	}

	/*
	 * public static void initialization() {
	 * 
	 * String browser = prop.getProperty("browser");
	 * 
	 * if (browser.equalsIgnoreCase("chrome")) { //
	 * 
	 * System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	 * 
	 * // String downloadFilepath = prop.getProperty("DOWNLOADPATH"); String
	 * downloadFilepath = System.getProperty("user.dir") + "\\Downloads";
	 * HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	 * chromePrefs.put("profile.default_content_settings.popups", 0);
	 * chromePrefs.put("download.default_directory", downloadFilepath);
	 * //ChromeOptions options = new ChromeOptions();
	 * //options.setExperimentalOption("prefs", chromePrefs); //driver = new
	 * ChromeDriver(options); } else if (browser.equalsIgnoreCase("firefox")) {
	 * System.setProperty("webdriver.gecko.driver", "//Drivers//chromedriver.exe");
	 * driver = new FirefoxDriver(); }
	 * 
	 * driver.manage().window().maximize();
	 * 
	 * driver.manage().deleteAllCookies();
	 * 
	 * // driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 * 
	 * driver.manage().timeouts().pageLoadTimeout(400, TimeUnit.SECONDS);
	 * 
	 * // loading the url
	 * 
	 * // driver.get(prop.getProperty("url"));
	 * 
	 * // prop.getProperty("url");
	 * 
	 * }
	 */

}
