package youtube.search;

import Common.Base;
import org.testng.annotations.Test;

public class Search extends Base {

    @Test
    public void SearchItem() throws InterruptedException {
        typeByCss("#masthead-search-term", "peoplentech" );
        clickByCss("#search-btn");
        sleepFor(2);
    }
}
