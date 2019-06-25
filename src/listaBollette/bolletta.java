package listaBollette;

import prog.utili.Data;

public abstract class bolletta implements Comparable<bolletta>{
	
	// CAMPI
	private String ID, desc;
	private double prezzo;
	private Data periodo[]=new Data[2];
	private final int cont=0;
	
	// COSTRUTTORI
	public bolletta(String s,Data inizio, Data fine) throws Exception {
		
		switch(s) {
		case "Consumo": this.ID+='C'+cont;
		case "Tempo": this.ID+='T'+cont;
		case "QuotaFissa": this.ID+='F'+cont;
		default: if((s.charAt(0)=='C' || s.charAt(0)=='T' || s.charAt(0)=='F') && s.charAt(1))
		}
	}
	
	
	public bolletta(String s, String meseInizio, String meseFine) throws Exception {
		String i[]=meseInizio.split(" ");
		//String f[]=meseInizio.split(" ");
		this.periodo[0]=getDataInizio(i);
		this.periodo[1]=getDataFine(i=meseFine.split(" "));
	}
	
	public bolletta(String s, String unicoMese) throws Exception {
			// Gennaio 2019
		String d[]=unicoMese.split(" ");
		this.periodo[0]=getDataInizio(d);
		this.periodo[1]=getDataFine(d);
	
	}
	
	// METODI
	
	private Data getDataInizio(String s[]) throws Exception {
		return getData(s,true);
	}

	private Data getDataFine(String s[]) throws Exception {
		return getData(s,false);
	}
	private Data getData(String s[], boolean b) throws Exception {
		
		int g, m;
		switch(s[0]) {
		case "Gennaio": g=b?1:31; m=1; break;
		case "Febbraio":g=b?1:28; m=2;break;
		case "Marzo": g=b?1:31; m=3;break;
		case "Aprile": g=b?1:30; m=4;break;
		case "Maggio": g=b?1:31; m=5;break;
		case "Giugno": g=b?1:30; m=6;break;
		case "Luglio": g=b?1:31; m=7;break;
		case "Agosto": g=b?1:31; m=8;break;
		case "Settembre":g=b?1:30; m=9;break;
		case "Ottobre": g=b?1:31;m=10;break;
		case "Novembre": g=b?1:30;m=11;break;
		case "Dicembre": g=b?1:31;m=12;break;
		default: throw new Exception(); // dovrei creare una nuova eccezione
		
		}
		return new Data(g, m, Integer.parseInt(s[1]));
		
	}


	// @param path = sorgente del file 
	public void caricaDaFile(String path) {
		
	}


	@Override
	public int compareTo(bolletta o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}//end class bollette
