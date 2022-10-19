package baseclass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

import utils.FileUtils;
import utils.GetTestData;

public class BaseTest {

	public static WebDriver driver;
	public static Properties config_prop = new Properties();
	public static Properties loc_prop = new Properties();
	public static FileReader config_fr; // to read config.properties file
	public static FileReader loc_fr; // to read locators.properties file
	public static Logger log = Logger.getLogger(BaseTest.class); //logger to add logs
	public static String movieName;
	public static String wiki_country;
	public static String wiki_release;
	public static String imdb_country;
	public static String imdb_release;
	
	// setup webdriver and establish connection for IMDB and Wiki URLs
	@BeforeClass
	public void setUp() throws IOException {

		// loading properties files of configuration and locators while initializing webdriver

		if (driver == null) {
			config_fr = new FileReader(System.getProperty("user.dir") + "\\src\\test\\java\\configfiles\\config.properties");
			loc_fr = new FileReader(System.getProperty("user.dir") + "\\src\\test\\java\\configfiles\\locators.properties");

			config_prop.load(config_fr);
			loc_prop.load(loc_fr);
			movieName = GetTestData.getMovieName();//Read Movie name from config.files
			FileUtils.AddDataToFile("MOVIE NAME - "+movieName);
			FileUtils.AddSpearator();

		}

		// configurable for required browser, but currently setup is done for chrome browser
		if (config_prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src\\test\\java\\driver\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		
		log.info("Started Driver");

	}

	// close the webdriver after the execution
	@AfterClass
	public void tearDown() {
		driver.quit();
		log.info("Teardown successful");
	}

}
