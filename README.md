# Challenge-Selenium

## Introduction
This automation project performs the following;
- Visits www.imdb.com
- Search for your a movie
- Verifys that a list of search results are seen
- Clicks the first search result
- Verifys that you are on the page of the correct movie

## How to run
1. Please clone from main
2. Open the project in any IDE (Eclipse/IntelliJ)
3. Right-click on the testng.xml file and select "Run '...\testng.xml'"
The scripts should run successfully

## Technical Details
- Language : JAVA as the programming language
- Framework : Page Object Model design pattern with Page Factory, TestNG.
- POM: As per the Page Object Model, I have maintained a class for every web page being used in the scripts. Each web page has a separate class and that class holds the functionality and members of that web page.
- Packages: Separate packages for Page Objects and Tests.
- Properties File : All the details which change as per the environment and authorization such as test browser, URL etc are kept in the data.properties file.
- Extent Reports: For the reporting purpose, using Extent Reports.
- Screenshots:  Screenshots of failed test cases will be captured, stored and be added to the extent reports.
- Maven: Using Maven for build, execution, and dependency purpose.
- Version Control Tool: using Git as a repository to store test scripts.
