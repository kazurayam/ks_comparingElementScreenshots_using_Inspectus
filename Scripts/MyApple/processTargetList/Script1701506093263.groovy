import java.nio.file.Files

import org.openqa.selenium.WebDriver

import com.kazurayam.inspectus.materialize.selenium.WebPageMaterializingFunctions
import com.kazurayam.materialstore.core.Material
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

TestObject toTestObject(Target target) {
	TestObject tObj = new TestObject(target.getHandle().getBy().toString())
	tObj.addProperty()	
}

Objects.requireNonNull(store)
Objects.requireNonNull(jobName)
Objects.requireNonNull(jobTimestamp)
Objects.requireNonNull(targetList)

WebUI.openBrowser('')
WebUI.setViewPortSize(1024, 800)

WebDriver driver = DriverFactory.getWebDriver()

targetList.eachWithIndex { target, index ->
	WebUI.navigateToUrl(target.getUrl().toExternalForm())
	WebUI.waitForElementPresent(toTestOutput(target), 10)
	// take Element screenshot
	WebElementMaterializingFunctions pmf = new WebElementMaterializingFunctions(store, jobName, jobTimestamp)
	pmf.setScrollTimeout(1000)
	Map<String, String> attributes = ["step": String.format("%02d", index + 1)]
	
	// save as PNG
	Material png = pmf.storeElementScreenshot.accept(driver, target, attributes, target.getHandle().getBy())
	assert Files.exists(png.toPath())
}

WebUI.closeBrowser()
