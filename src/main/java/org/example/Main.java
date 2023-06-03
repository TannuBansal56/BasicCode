package org.example;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser  = playwright.chromium().launch( new BrowserType.LaunchOptions().setHeadless(false));
//        BrowserContext context = browser.newContext(new Browser.NewContextOptions().setUserAgent("Mozilla/5.0 (Linux; Android 8.0; Pixel 2 Build/OPD3.170816.012) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3765.0 Mobile Safari/537.36")
//                .setViewportSize(400, 700)
//                .setDeviceScaleFactor(2.625)
//                .setIsMobile(true)
//                .setHasTouch(true));

        BrowserContext context  = browser.newContext();
        Page page = context.newPage();
        context.tracing().start( new Tracing.StartOptions().setScreenshots(true).setSnapshots(true));
        page.navigate("https://www.amazon.in/");
//        page.route("**", route -> {
//            System.out.println(route.request().url());
//            route.resume();
//        });

        String searchBox = "//input[@id='twotabsearchtextbox']";
        page.locator(searchBox).type("headphones");
        page.locator(searchBox).click();
      //  page.keyboard().press("Enter");
        String searchDropDown  = "//div[@class='two-pane-results-container']//div[contains(@class,'suggestion-ellipsis-direction')]";

            Thread.sleep(4000);

            Locator Elements = page.locator(searchDropDown);
            int count = Elements.count();
            System.out.println("Total element count is: " + count);

            for (int i = 0; i < count; i++) {
                System.out.println(Elements.nth(i).textContent());
                if (Elements.nth(i).textContent().trim().equalsIgnoreCase("headphones wireless")) {
                    Elements.nth(i).click();
                    System.out.println("Element is clicked!!!!");
                    break;
                } else {
                   System.out.println("Element your looking is not available!!! please check the text");
                }

            }

            context.tracing().stop(new Tracing.StopOptions().setPath(Path.of("./target")));



//        BrowserContext context1 = browser.newContext();
//        Page page2 = context1.newPage();
//        page2.navigate("http://yahoo.com");

    }

    }

