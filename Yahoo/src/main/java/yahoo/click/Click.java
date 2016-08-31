package yahoo.click;

import Common.Base;
import org.testng.annotations.Test;

public class Click extends Base{
    @Test
    public void SearchItem() throws InterruptedException {
        clickByXpath("#yui_3_18_0_6_1472661892952_1465");
        sleepFor(5);
    }
}
