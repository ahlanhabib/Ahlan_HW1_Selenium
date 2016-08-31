package gov.search;
import Common.Base;
import org.testng.annotations.Test;

public class Search extends Base {

    @Test
    public void SearchItem() throws InterruptedException {
        typeByCss("#keyword-search-input", "Electrical Engineering" );
        typeByCss("#location-search-input", "California" );
        clickByCss(".btn.btn-gjobs-primary");
        sleepFor(5);
    }
}
