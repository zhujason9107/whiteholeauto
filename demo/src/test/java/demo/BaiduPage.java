package demo;

import org.suren.autotest.web.framework.annotation.AutoLocator;
import org.suren.autotest.web.framework.annotation.AutoPage;
import org.suren.autotest.web.framework.selenium.WebPage;

import com.surenpi.autotest.webui.core.LocatorType;
import com.surenpi.autotest.webui.ui.Button;
import com.surenpi.autotest.webui.ui.Text;

@AutoPage(url = "http://baidu.com")
public class BaiduPage extends WebPage {

	@AutoLocator(locator = LocatorType.BY_ID, value = "kw")
    private Text keyword;
    @AutoLocator(locator = LocatorType.BY_ID, value = "su")
    private Button searchBut;
    public Text getKeyword()
    {
        return keyword;
    }
    public void setKeyword(Text keyword)
    {
        this.keyword = keyword;
    }
    public Button getSearchBut()
    {
        return searchBut;
    }
    public void setSearchBut(Button searchBut)
    {
        this.searchBut = searchBut;
    }

}
