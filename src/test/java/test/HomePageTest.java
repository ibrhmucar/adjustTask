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

      srcpg.searchbar.sendKeys("SDET");
      srcpg.searchButton.click();
      String expectedWord = "SDET";
      String actualWord = Driver.get().findElement(By.xpath(srcpg.searchContent)).getText();
      Assert.assertTrue(expectedWord.equals(actualWord));


      srcpg.quickSearchBar.sendKeys("Apple Company");
      srcpg.getQuickSearchButtom.click();
      String expectedPageContent = "Apple Inc.";
      String actualPageContent = Driver.get().findElement(By.xpath(srcpg.pageContent)).getText();
      Assert.assertTrue(expectedPageContent.equals(actualPageContent));
   }





}
