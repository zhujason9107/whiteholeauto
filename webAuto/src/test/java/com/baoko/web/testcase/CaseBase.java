package com.baoko.web.testcase;

import com.baoko.web.base.DriverBase;

public class CaseBase {
	public DriverBase InitDriver(String browser){
		return new DriverBase(browser);
	}
}
