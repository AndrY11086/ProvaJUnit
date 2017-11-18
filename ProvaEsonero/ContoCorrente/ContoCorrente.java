
public class ContoCorrente {

	private static int saldo;
	
	
	private void saldoDiPartenza(){
		this.saldo = 0;
	}
	
	public void deposita(int soldi){
		if(soldi<0)
			throw new IllegalArgumentException();
		
		this.saldo += soldi;
	}
	
	public void preleva(int soldi){
		if((saldo-soldi)<0)
			throw new IllegalArgumentException();
		
		this.saldo -= soldi;
	}
	
	public int getSaldo(){
		return saldo;
	}
}
