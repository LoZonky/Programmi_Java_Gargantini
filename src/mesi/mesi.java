package mesi;

public enum mesi {
	GENNAIO("Gennaio",31),FEBBRAIO("Febbraio",28),MARZO("Marzo",31),APRILE("Aprile",30),MAGGIO("Maggio",31),GIUGNO("Giugno",30),LUGLIO("Luglio",31),AGOSTO("Agosto",31),SETTEMBRE("Settembre",30),OTTOBRE("Ottobre",31),NOVEMBRE("Novembre",30),DICEMBRE("Dicembre",31);

	String nome;
	int fine;
	
	mesi(String n,int f){
		nome=n;
		fine=f;
	}
	
	public int getFine() {
		switch(this){
		case GENNAIO: return fine;
		case FEBBRAIO: return fine;
		case MARZO: return fine;
		case APRILE: return fine;
		case MAGGIO: return fine;
		case GIUGNO: return fine;
		case LUGLIO: return fine;
		case AGOSTO: return fine;
		case SETTEMBRE: return fine;
		case OTTOBRE: return fine;
		case NOVEMBRE: return fine;
		case DICEMBRE: return fine;
		
		default: return 0;
		}
	}
	
	@Override
	public String toString() {
		switch(this){
		case GENNAIO: return nome;
		case FEBBRAIO: return nome;
		case MARZO: return nome;
		case APRILE: return nome;
		case MAGGIO: return nome;
		case GIUGNO: return nome;
		case LUGLIO: return nome;
		case AGOSTO: return nome;
		case SETTEMBRE: return nome;
		case OTTOBRE: return nome;
		case NOVEMBRE: return nome;
		case DICEMBRE: return nome;
		
		default: return "";
		}	
	}
	
	public int getQualcosa(String s) {
		switch(s) {
		case "Gennaio": return GENNAIO.fine;
		default: return 0;
		}
	}
	
	
}


class testMEsi{
	public static void main(String[] args) {
		mesi a=mesi.AGOSTO;
		int x=a.getQualcosa("Gennaio");
		System.out.println(x);
	}
}