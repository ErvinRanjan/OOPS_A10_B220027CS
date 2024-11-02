package bonusTest;
import org.junit.Test;
import org.junit.Assert;
import bonus.*;
public class ComicTest{
	@Test
	public void test1() {
		Comic c = new Comic("Spiderman",34,"Batman");
		Assert.assertTrue(c.printName() == "Spiderman");
	}
	
	@Test
	public void test2() {
		TextBook t = new TextBook("Math",10);
		Assert.assertTrue(t.printName() == 10);
	}
}