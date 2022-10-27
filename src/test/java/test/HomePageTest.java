package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;
import utilities.Driver;


@Test
public class HomePageTest extends TestBase {

   SearchPage srcpg = new SearchPage();

   public void adjustTask () {
      // 1- Navigate to URL and verify it.
      String expectedURL="https://en.wikipedia.org/w/index.php?search";
      String actualURL = Driver.get().getCurrentUrl();
      Assert.assertTrue(expectedURL.equals(actualURL));

      // 2- Write "SDET" to the main search bar and search. Verify that the word that "SDET" appears in the search result.
      srcpg.searchbar.sendKeys("SDET");
      srcpg.searchButton.click();
      String expectedWord = "SDET";
      String actualWord = Driver.get().findElement(By.xpath(srcpg.searchContent)).getText();
      Assert.assertTrue(expectedWord.equals(actualWord));

      // 3- Write "Apple Company" to the "Search Wikipedia" box and search. Verify that the word appears on the new results page.
      srcpg.quickSearchBar.sendKeys("Apple Company");
      srcpg.getQuickSearchButtom.click();
      String expectedPageContent = "Apple Inc.";
      String actualPageContent = Driver.get().findElement(By.xpath(srcpg.pageContent)).getText();
      Assert.assertTrue(expectedPageContent.equals(actualPageContent));

   }





}
