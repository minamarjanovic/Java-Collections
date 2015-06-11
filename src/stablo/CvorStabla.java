package stablo;

public class CvorStabla {

	int kljuc;
	String vrednost;
	CvorStabla levo;
	CvorStabla desno;
	
	public CvorStabla(int klj, String vr, CvorStabla l,
			CvorStabla d) {
		kljuc = klj;
		vrednost = vr;
		levo = l;
		desno = d;
	}
	
	
}
