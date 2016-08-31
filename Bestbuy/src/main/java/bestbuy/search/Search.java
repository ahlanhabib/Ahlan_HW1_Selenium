package bestbuy.search;
import Common.Base;
import org.testng.annotations.Test;

public class Search extends Base {

        @Test
        public void SearchItem() throws InterruptedException {
            typeByCss("#gh-search-input", "Laptop" );
            clickByCss(".search-button");
            sleepFor(2);
        }
}
