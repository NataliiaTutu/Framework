package com.framework.pages;

import org.openqa.selenium.support.PageFactory;
import com.framework.web.WebDriverUtils;

public class ExamplePage {

    public ExamplePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
