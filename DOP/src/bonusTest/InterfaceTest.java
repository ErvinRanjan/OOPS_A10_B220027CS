package bonusTest;
import org.junit.Test;
import org.junit.Assert;
import bonus.*;
public class InterfaceTest{
	@Test
	public void test1() {
		Assert.assertTrue(new Comic("Spiderman",10,"Batman").compareTo(new Comic("Spiderman",11,"Batman")) == -1);	
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(new Fiction("fiction").compareTo(new Fiction("fiction")) == 0);	
	}
	
	@Test
	public void test3() {
		Assert.assertTrue(new TextBook("Math",10).compareTo(new TextBook("Math",10)) == 0);	
	}
}