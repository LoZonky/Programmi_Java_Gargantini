import prog.io.FileInputManager;
import prog.utili.Data;
import prog.utili.SequenzaOrdinata;
import listaBollette.bolletta;
import mesi.mesi;

public class gestoreBollette {

	private SequenzaOrdinata<bolletta> bollette;
	mesi a;
	public gestoreBollette() {
		bollette=new SequenzaOrdinata<bolletta>();
	}

	
	
	private Data setMeseInizio(String s) {
		mesi a=  mesi.(s);
	}
/*	
	private Data getInizio(String s, boolean b) {
		return getdata(s,true);
	}
	private Data getFine(String s, boolean b) {
		return getdata(s,false);
	}
	private Data getdata(String s,boolean b) {
		String dati[]=s.split(" ");
		String out= b? "1." : 
		switch(dati[0]) {
		case "Gennaio"
		}
	}
*/	
	public void caricaDaFile(String path) {
		String righe, campi[];
		FileInputManager in = new FileInputManager(path);
		do {
			righe=in.readLine();
			if(righe!=null) {
				campi=righe.split(";");
				char tipoBolletta = campi[0].charAt(0);
				String ID= campi[0];
				String desc= campi[1];
				if(campi.length==5) {
					String dInizio=campi[3];
					String dFine=campi[4];
					 
						
					
				}else {
					
				}
				if(tipoBolletta=='C'){
					
				}
			}
		}while(righe!=null);
	}
}
