package Calcolatrice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class CalcolatriceTest {

	private static Calcolatrice c;
	private static int a, b;
	
	@BeforeClass
	public static void creaCalcolatrice(){
		c = new Calcolatrice();
		System.out.println("c: " + c + " creazione riuscita");
		
		a=0;
		b=0;
	}
	
	@Before
	public void primaDiTutti(){
		a=5;
		b=2;
		System.out.println("Before");
	}
	
	@After
	public void dopo(){
		System.out.println("After");
	}
	
	@SuppressWarnings("deprecation")
	@Test(timeout=10000)
	public void sommaTest(){
		Assert.assertEquals(a+b, c.somma(a,b));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("test SOMMA riuscito");
		
	}

	@SuppressWarnings("deprecation")
	@Test
	public void sottrazioneTest(){
		Assert.assertEquals(3, c.sottrazione(5, 2));
		System.out.println("test SOTTRAZIONE riuscito");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void moltiplicazioneTest(){
		Assert.assertEquals(100, c.moltiplicazione(10, 10));
		System.out.println("test MOLTIPLICAZIONE riuscito");
	}
	
	@SuppressWarnings("deprecation")
	@Test(expected = ArithmeticException.class)
	public void divisioneTest(){
		Assert.assertEquals(5, c.divisione(11, 0));
		System.out.println("test DIVISIONE riuscito");
	}
	
	@Test
	public void divisioneFloatTest(){
		Assert.assertEquals(3.5, c.divisioneFloat(7.0, 2.0));
		System.out.println("test DIVISIONE DOUBLE riuscita");
	}
	
	@AfterClass
	public static void cancellaCalcolatrice(){
		c = null;
		System.out.println("c: " + c + " c cancellata");
	}
}
