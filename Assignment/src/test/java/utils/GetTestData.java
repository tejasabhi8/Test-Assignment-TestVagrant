package utils;

import baseclass.BaseTest;

public class GetTestData extends BaseTest{
	
	//Wiki
	public static String getWikiUrl() {
		return config_prop.getProperty("wiki_url");
	}
	
	public static String getWikiSearchBar() {
		return loc_prop.getProperty("wiki_search_bar_id");
	}
	
	public static String getWikiSearchButton() {
		return loc_prop.getProperty("wiki_search_button_id");
	}
	
	public static String getWikiCountryName() {
		return loc_prop.getProperty("wiki_country_xpath");
	}
	
	public static String getWikiReleaseDate() {
		return loc_prop.getProperty("wiki_release_date_xpath");
	}
	
	
	//IMDB
	public static String getImdbUrl() {
		return config_prop.getProperty("imdb_url");
	}
	
	public static String getImdbSearchBar() {
		return loc_prop.getProperty("imdb_search_bar_id");
	}
	
	public static String getImdbSearchButton() {
		return loc_prop.getProperty("imdb_search_button_id");
	}
	
	public static String getImdbCountryName() {
		return loc_prop.getProperty("imdb_country_xpath");
	}
	
	public static String getImdbReleaseDate() {
		return loc_prop.getProperty("imdb_release_date_xpath");
	}
	
	//Get Movie name
	public static String getMovieName() {
		return config_prop.getProperty("movie_name");
	}

}
