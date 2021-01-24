package com.selenium.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.MalformedURLException;
import java.net.URL;



@SpringBootTest
class SampleApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void runChrome() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WINDOWS);
		URL url=new URL("http://192.168.10.48:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(url, cap);
		driver.get("https://google.com/");
		String title = driver.getTitle();
		Assertions.assertEquals("Google",title);
         Thread.sleep(2000);
		driver.close();
	}
}
