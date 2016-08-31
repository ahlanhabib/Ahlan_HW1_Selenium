package kayak.find;
import Common.Base;
import org.testng.annotations.Test;

public class Find extends Base {

    @Test
    public void SearchItem() throws InterruptedException {
        typeByCss(".locationField.col", "Veg" );
        clickByCss("#city-35107-350");
        clickByXpath(".//*[@id='datepicker']/div[4]/span[2]/span[2]/span[1]/span[5]/span");
        clickByXpath(".//*[@id='datepicker']/div[4]/span[2]/span[2]/span[5]/span[6]/span");
        clickByCss(".Common-Widgets-Button.searchButton");
        sleepFor(3);
    }
}
