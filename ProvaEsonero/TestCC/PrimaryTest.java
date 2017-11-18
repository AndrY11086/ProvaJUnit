import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PrimaryTest {

	private static ContoCorrente cc;
	
	@BeforeClass
	public static void initCC(){
		cc = new ContoCorrente();
	}
	
	@Test(timeout = 5000)
	public void contoIniziale(){
		Assert.assertEquals(0, cc.saldoDiPartenza());
	}
	
	@Test
	public void saldoAttuale(){
		Assert.assertEquals(0 ,cc.getSaldo());
	}
	
	@AfterClass
	public static void depositaInCC(){
		cc.deposita(5000);
		System.out.println(cc.getSaldo());
		
		cc = null;
	}
}
