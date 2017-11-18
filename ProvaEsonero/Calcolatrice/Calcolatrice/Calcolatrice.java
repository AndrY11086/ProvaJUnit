package Calcolatrice;

import java.util.ArrayList;

public class Calcolatrice {
	
	private static ArrayList <Integer> positivi = new ArrayList();
	private static ArrayList <Integer> negativi = new ArrayList();
	
	public static void aggiungi(int a, int b){
		
		if((a+b)>0)
			positivi.add(a+b);
		else
			negativi.add(a+b);
		
	}
	
	public int somma(int a, int b)
	{
		return a+b;
	}
	
	public int sottrazione(int a, int b){
		return a-b;
	}
	
	public int moltiplicazione(int a, int b){
		return a*b;
	}
	
	public int divisione(int a, int b){
		return a/b;
	}
	
	public double divisioneFloat(double d, double e){
		return d/e;
	}
	
	@Override
	public String toString() {
		return "*creata*";
	}
}
