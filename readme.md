# Integration Testing 

Integration testing for Spring Boot Web Application using Selenium and Cucumber.

1. Thymeleaf
2. Spring Boot
3. Cucumber
4. Selenium

## Dependencies
You can check inside the pom.xml for the detail.

1. Spring-boot-starter-thymeleaf
2. Cucumber Java 5.6.0
3. JUnit 4.13
4. Selenium-java
5. TestNG 6.8
6. Chrome Browser: Version 117.0.5938.149  check from [here](https://chromedriver.chromium.org/downloads)
7. Chrome Driver: ChromeDriver 118.0.5993.70

# Run ChromDriver for Selenium on Mac
## Install chromedriver using
```brew cask install chromedriver```
## Start chrome driver brew services start chromedriver
```brew services start chromedriver```
## Terminal
```
ivovosahlik@Ivos-MacBook-Pro bin % pwd
/opt/homebrew/bin
ivovosahlik@Ivos-MacBook-Pro bin % chromeDriver -v
ChromeDriver 118.0.5993.70 (e52f33f30b91b4ddfad649acddc39ab570473b86-refs/branch-heads/5993@{#1216})
```
## Is need to set path to chrome driver

```System.setProperty("webdriver.chrome.driver","/opt/homebrew/bin/chromedriver");```