package selenium_final_exam_valio;

public enum Enums {

	driverPath("D:/Selenuim_drivers/chromedriver.exe"), driverType("webdriver.chrome.driver"), pragmaticURL(
			"http://shop.pragmatic.bg"), inputNameLocator(
					"input-name"), inputEmailLocator("input-email"), inputEnquiryLocator(
							"input-enquiry"), contactUsLocator("Contact Us"), buttonSubmitLocator(
									"input.btn.btn-primary"), buttonContinueLocator("Continue");

	private final String value;

	private Enums(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
