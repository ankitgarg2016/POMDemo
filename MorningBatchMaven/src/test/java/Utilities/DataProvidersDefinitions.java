package Utilities;

import org.testng.annotations.DataProvider;

public class DataProvidersDefinitions {

	@DataProvider(name = "SearchProvider")
	public static Object[][] getDataFromDataprovider() {

		return new Object[][] { { "testUser1", "PasswordTestUser1" }, { "testUser2", "PasswordTestUser2" } };
	}


}
