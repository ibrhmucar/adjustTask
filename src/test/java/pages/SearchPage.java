package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;

public class SearchPage extends BasePage{

    @FindBy(xpath = "(//input[@id='ooui-php-1'])[1]")
    public WebElement searchbar;

    @FindBy(xpath = "(//span[@class='oo-ui-labelElement-label'][normalize-space()='Search'])[1]")
    public WebElement searchButton;

    @FindBy (xpath = "(//input[@id='searchInput'])[1]")
    public WebElement quickSearchBar;

    @FindBy (xpath = "(//input[@id='searchButton'])[1]")
    public WebElement getQuickSearchButtom;


    public String searchContent = "(//a[contains(text(),'SDET')])[1]";
    public String pageContent = "(//span[@class='mw-page-title-main'])[1]";


}
