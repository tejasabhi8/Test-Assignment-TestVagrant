# Test-Assignment-TestVagrant
Movie Information Validation program to extract Country and Release date of a movie.
The sources of extraction are [IMDB](https://www.imdb.com/) and [Wikipedia](https://en.wikipedia.org/)
## Technologies Used:
__**Java, Selenium**__ and __**TestNG**__
## Development Platform:
Eclipse IDE
## Steps to run the project
- STEP 1. Clone the project from the [github](https://github.com/tejasabhi8/Test-Assignment-TestVagrant.git)
- STEP 2. Open Eclipse IDE in your system
- STEP 3. Import the project to Eclipse
- STEP 4. Expand the file explorer on the left hand side to open files in the project
- STEP 5. (OPTIONAL) 
    - Expand (src/test/java) *_configfiles_* and open *_config.properties_* file
    - You can change the _movie_name_ property to any movie that needs to be searched for.
- STEP 6. Select and open **_testng.xml_** file
- STEP 7. Right click and Select _**Run as**_
- STEP 8. Choose **_TestNG Suite_** option
- STEP 9. The results of extraction can be viewed in **_result.txt_** file present in outputdata folder

## Features of the project
The project is based on Java and Selenium. TestNG is used to verify the extracted data.
- Basically it has two test cases
  - Verify Country Name
  - Verify Release Date
- Since the release date format of the extracted data are not matching, the project formats the extracted data to a common format and then asserts the values.
- The results of extraction can be viewed in **_result.txt_** file present in outputdata folder.
- Further the code used to develop the project is modularized and commented wherever neccessary for better understanding.
- The project is developed to execute on Chrome using chrome driver, but could be enhanced to support any required browser if needed.

## Enhancements
- The project could be improvised in terms of logging messages
-  As I was facing some issues with maven in my local, so couldn't build the project so as to run using maven using command line. It would have been better if the project was to implement these features as well.
