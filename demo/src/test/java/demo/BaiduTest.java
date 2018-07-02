package demo;

import java.io.IOException;

import org.suren.autotest.web.framework.annotation.AutoApplication;
import org.suren.autotest.web.framework.settings.Phoenix;
import org.suren.autotest.web.framework.util.ThreadUtil;

@AutoApplication
public class BaiduTest {
	
	public static void main(String[] args) throws IOException {
		Phoenix phoenix = new Phoenix(BaiduTest.class);
		phoenix.init();
		
		BaiduPage page = phoenix.getPage(BaiduPage.class);
		page.open();
		page.getKeyword().fillValue("PhoenixAutotest");
		page.getSearchBut().click();
		
		ThreadUtil.silentSleep(3000);
		
		phoenix.close();

	}

}
