package oldShelfTest;

import org.junit.Test;
import org.junit.Assert;
import oldshelf.*;

public class OldSelectionTest{
	@Test
	public void testGetAgeOrTitle1() {
		Comic c = new Comic("Spiderman",54);
		Assert.assertTrue(OldSelection.getAgeOrTitle(c) == "Spiderman");
	}
	
	@Test
	public void testGetAgeOrTitle2() {
		Comic c = new Comic("Spiderman",34);
		Assert.assertFalse(OldSelection.getAgeOrTitle(c) == "Name");
	}
}