package baseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import utils.FileUtils;
import utils.GetTestData;

public class Imdb extends BaseTest{
	
	
	public static void loadImdbUrl() {
		driver.get(GetTestData.getImdbUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	

	public static String extractCountryforImdb() throws IOException {
		
		driver.findElement(By.id(GetTestData.getImdbSearchBar())).sendKeys(movieName); //get id for search bar in Imdb
		driver.findElement(By.xpath(GetTestData.getImdbSearchButton())).click();
		
		imdb_country = driver.findElement(By.xpath(GetTestData.getImdbCountryName())).getText(); //Extract Country Name
		
		//log.info("Country Name Extracted from IMDB for movie "+movieName+"is: "+imdb_country);
		
		//Add text to result file
		String country_text = "Country Name Extracted from IMDB for movie "+movieName+" is :---> "+imdb_country;
		FileUtils.AddDataToFile(country_text);
		FileUtils.AddSpearator();
		
		return imdb_country;

	}
	

	public static String extractReleaseDateforImdb() throws IOException {
		
		driver.findElement(By.id(GetTestData.getImdbSearchBar())).sendKeys(movieName); //get id for search bar in Imdb
		driver.findElement(By.xpath(GetTestData.getImdbSearchButton())).click();
		System.out.println("IMDB");
		imdb_release = driver.findElement(By.xpath(GetTestData.getImdbReleaseDate())).getText(); //Extract Release Date
		
		//log.info("Release Date Extracted from IMDB for movie "+movieName+"is: "+imdb_release);
		
		//Add text to result file
		String release_text = "Release Date Extracted from IMDB for movie "+movieName+" is :---> "+imdb_release;
		FileUtils.AddDataToFile(release_text);
		FileUtils.AddSpearator();
		
		return imdb_release;
				
	}

}
