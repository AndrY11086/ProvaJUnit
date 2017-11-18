import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SecondaryTest {

	private static ContoCorrente cc;
	
	@Before
	public void initCC(){
		cc = new ContoCorrente();
	}
	@After
	public void cancCC(){
		cc = null;
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPrelievo(){
		
		cc.preleva(3000);
		cc.preleva(3000);
	}
	
	@Test
	public void testDeposito(){
		cc.deposita(2500);
		cc.deposita(2500);
		Assert.assertEquals(5000,cc.getSaldo());
	}
	
	@Test
	public void testPrelievoCorretto(){
		if(cc.getSaldo() > 2000)
			cc.preleva(2000);
		
		Assert.assertEquals(0 , cc.getSaldo());
	}
}
