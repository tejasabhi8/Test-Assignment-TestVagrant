package baseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import utils.FileUtils;
import utils.GetTestData;

public class Wiki extends BaseTest{
	
	
	
	public static void loadWikiUrl(){
		driver.get(config_prop.getProperty("wiki_url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	public static String extractCountryforWiki() throws IOException {
	
		driver.findElement(By.id(GetTestData.getWikiSearchBar())).sendKeys(movieName); //get id for search bar in IMDB
		driver.findElement(By.id(GetTestData.getWikiSearchButton())).click();
		
		wiki_country = driver.findElement(By.xpath(GetTestData.getWikiCountryName())).getText(); //Extract Country Name
		
		//log.info("Country Name Extracted from Wikipedia for movie "+movieName+"is: "+wiki_country);
		
		//Add text to result file
		String country_text = "Country Name Extracted from Wikipedia for movie "+movieName+" is :---> "+wiki_country;
		FileUtils.AddDataToFile(country_text);
		
		return wiki_country;

	}
	

	public static String extractReleaseDateforWiki() throws IOException {
		
		driver.findElement(By.id(GetTestData.getWikiSearchBar())).sendKeys(movieName); //get id for search bar in IMDB
		driver.findElement(By.id(GetTestData.getWikiSearchButton())).click();
		
		wiki_release = driver.findElement(By.xpath(GetTestData.getWikiReleaseDate())).getText(); //Extract Release Date
		
		//log.info("Release Date Extracted from Wikipedia for movie "+movieName+"is: "+wiki_release);
		
		//Add text to result file
		String release_text = "Release Date Extracted from Wikipedia for movie "+movieName+" is :---> "+wiki_release;
		FileUtils.AddDataToFile(release_text);
		
		return wiki_release;
	}

}