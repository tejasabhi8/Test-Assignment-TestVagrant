package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass.BaseTest;
import baseclass.Imdb;
import baseclass.Wiki;
import utils.DateUtils;
import utils.FileUtils;


public class VerifyExtractedData extends BaseTest{
	
		@Test
		public void verifyCountry() throws IOException{
			Wiki.loadWikiUrl();
			
			String wiki_country = Wiki.extractCountryforWiki();
			Imdb.loadImdbUrl();
			String imdb_country = Imdb.extractCountryforImdb();
			
			Assert.assertEquals(wiki_country, imdb_country);

		
	}
	
		@Test
		public void verifyRelease() throws IOException{
			
			Wiki.loadWikiUrl();
			String wiki_release = Wiki.extractReleaseDateforWiki(); //Extract Data from Wiki - //Extracted Format = 17 December 2021
			String date_wiki = DateUtils.formatDateWiki(wiki_release); //Parse the extracted date into comparable format
			//log.info("Release date in Wikipedia after formatting: ----> "+date_wiki);
			
			
			Imdb.loadImdbUrl();
			String imdb_release = Imdb.extractReleaseDateforImdb(); //Extract Data from Wiki - //Extracted Format = December 17, 2021 (United States)
			String date_imdb = DateUtils.formatDateImdb(imdb_release); //Parse the extracted date into comparable format
			//log.info("Release date in IMDB after formatting: ----> "+date_imdb);
			
			FileUtils.AddDataToFile("Release date in Wikipedia after formatting: ----> "+date_wiki);
			FileUtils.AddDataToFile("Release date in IMDB after formatting: ----> "+date_imdb);
			FileUtils.AddSpearator();
			
			Assert.assertEquals(date_wiki, date_imdb);
		
	}

}
