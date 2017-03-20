//package Pages;
//
//import Utils.Config;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import static org.junit.Assert.assertEquals;
//
///**
// * Created by berestenko on 14.03.17.
// */
//
//    public class StatisticsPage extends Page {
//        public StatisticsPage(WebDriver driver) {
//            super(driver);
//        }
//
//        @Override
//        public void open(){
//            driver.get(Config.getProperty("portal_url_details"));
//        }
//
//
////Statistics elements in detail table
//        @FindBy(id = "select-tag")
//        public WebElement fieldTag;
//
//        @FindBy(id = "select-phone")
//        public WebElement fieldPhone;
//
//        @FindBy(id = "date-from")
//        public WebElement fieldDateFrom;
//
//        @FindBy(id = "date-to")
//        public WebElement fieldDateTo;
//
//        @FindBy(id = "select-step")
//        public WebElement fieldStepBy;
//
//        @FindBy(css =".well.well-sm.tooltip-toggle")
//        public WebElement filter;
//
//        @FindBy(css = ".tab-pane.active")
//        public WebElement statisticsTable;
//
//        @FindBy(linkText = "Detailed table")
//        public WebElement buttonDetailedTable;
//
//        @FindBy(linkText = "Aggregated table")
//        public WebElement buttonAggregatedTable;
//
//        @FindBy(css = ".table.table-bordered")
//        public WebElement aggregatedTable;
//
//        @FindBy(linkText = "Aggregated chart")
//        public WebElement buttonAggregatedChart;
//
//        @FindBy(id = "chart")
//        public WebElement aggregatedChart;
//
//
//
//        public StatisticsPage isElementPresentInDetailedTable(WebElement element){
//            isElementPresent(element);
//            return PageFactory.initElements(driver, StatisticsPage.class);
//        }
//
//        public StatisticsPage checkFilter(String setUpFilter){
//            assertEquals(setUpFilter, filter.getText());
//            return PageFactory.initElements(driver, StatisticsPage.class);
//
//        }
//
//
//
//    }
//
//
