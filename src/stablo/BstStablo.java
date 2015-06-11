package stablo;

public class BstStablo {

	public String pronadjiPoKljucu(CvorStabla koren,int kljuc) {
		
		if(koren == null) {
			return null;
		}
		
		if(koren.kljuc == kljuc) {
			return koren.vrednost;
		}
		
		if(koren.kljuc < kljuc) {
			return pronadjiPoKljucu(koren.desno, kljuc);
		} else 
			return pronadjiPoKljucu(koren.levo, kljuc);
		
	}
	
}


