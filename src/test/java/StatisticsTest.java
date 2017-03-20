//import Data.UserData;
//import Pages.LoginPage;
//import Pages.StatisticsPage;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//
//
///**
// * Created by berestenko on 14.03.17.
// */
//public class StatisticsTest extends BasicTest{
//    private StatisticsPage statisticsPage = PageFactory.initElements(BasicTest.getWebDriver(), StatisticsPage.class);
//    private LoginPage loginPage = PageFactory.initElements(BasicTest.getWebDriver(), LoginPage.class);
//
//    @Before
//    public void Login() throws Exception {
//        loginPage.open();
//        UserData user = new UserData("sample", "sample1");
//        loginPage = loginPage.loginAs(user);
//    }
//
//    @Test
//    public void OpenDetailedTableWithouFilters() throws Exception {
//        statisticsPage.open();
//        statisticsPage.isElementPresentInDetailedTable(statisticsPage.statisticsTable);
//    }
//
//
//    @Test
//    public void OpenAggregatedTableWithouFilters() throws Exception {
//        statisticsPage.open();
//        statisticsPage.buttonAggregatedTable.click();
//        statisticsPage.isElementPresentInDetailedTable(statisticsPage.aggregatedTable);
//    }
//
//    @Test
//    public void OpenAggregatedChartWithouFilters() throws Exception {
//        statisticsPage.open();
//        statisticsPage.buttonAggregatedChart.click();
//        statisticsPage.isElementPresentInDetailedTable(statisticsPage.aggregatedChart);
//    }
//
//    @Test
//    public void SetUpTagFilter() throws Exception{
//        statisticsPage.fieldTag.click();  //не находит поля для ввода
//        statisticsPage.type(statisticsPage.fieldTag, "file-510");
//        statisticsPage.fieldTag.sendKeys(Keys.ENTER);
//        statisticsPage.checkFilter("file-510");
//    }
//
//
//
//
//}
