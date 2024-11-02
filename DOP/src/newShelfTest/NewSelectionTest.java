package newShelfTest;

import org.junit.Assert;
import org.junit.Test;
import newshelf.*;

public class NewSelectionTest{
	@Test
	public void testGetAgeOrTitle1() {
		Comic c = new Comic("Spiderman",23);
		Assert.assertTrue(NewSelection.getAgeOrTitle(c) == "Spiderman");
	}
	
	@Test
	public void testGetAgeOrTitle2() {
		Comic c = new Comic("Spiderman",23);
		Assert.assertFalse(NewSelection.getAgeOrTitle(c) == "Name");
	}
}