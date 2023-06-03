package org.example;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class WebApplicationAutomation {
    public static void main(String args[]){
        Playwright playwright = Playwright.create();
           Browser browser =  playwright.chromium().launch( new BrowserType.LaunchOptions().setHeadless(false));
           BrowserContext context = browser.newContext();
           Page page = context.newPage();
           context.tracing().start(new Tracing.StartOptions().setSnapshots(true).setScreenshots(true).setSources(false));
           page.navigate("https://get.adobe.com/uk/reader/otherversions");
           page.locator("//div//*[@id='step1']").click();
           page.locator("//option[@value='Windows 11']").click();
//           try {
//               page.wait(5000);
//           }
//           catch (InterruptedException e){
//               e.printStackTrace();
//           }
//
//           context.tracing().stop(new Tracing.StopOptions().setPath(Paths.get("./target")));
//            page.close();
//           context.close();
//           browser.close();
//           playwright.close();

    }
}
