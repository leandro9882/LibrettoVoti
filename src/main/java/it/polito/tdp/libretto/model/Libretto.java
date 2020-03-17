package it.polito.tdp.libretto.model;

import java.util.*;

public class Libretto {
	List<Voto> voti;

	public Libretto() {

		this.voti = new LinkedList<Voto>();
	}

	public void add(Voto voto) {
		if (!this.CheckConflitto(voto) && !this.CheckVoto(voto))
			voti.add(voto);
	}

	public String getCorsi() {
		String risultato = "";
		for (Voto v : voti) {
			if (v != null) {
				if (v.getVoto() >= 25) {
					risultato += v.toString() + "\n";
				}
			}
		}
		return risultato.trim();
	}

	public int getVotoEsame(String nomeCorso) {
		for (Voto v : voti) {
			if (v != null) {
				if (v.getNomeCorso().compareTo(nomeCorso) == 0)
					return v.getVoto();
			}
		}

		return -1;
	}

	public boolean CheckVoto(Voto vTemp) {
		for (Voto v : voti) {
			if (v != null) {
				if (v.getNomeCorso().compareTo(vTemp.getNomeCorso()) == 0 && v.getVoto() == vTemp.getVoto())
					return true;
			}
		}

		return false;
	}

	public boolean CheckConflitto(Voto vTemp) {
		for (Voto v : voti) {
			if (v != null) {
				if (v.getNomeCorso().compareTo(vTemp.getNomeCorso()) == 0 && v.getVoto() != vTemp.getVoto())
					return true;
			}
		}
		return false;
	}

	public Libretto upgrade() {
		// List<Voto> votiUp=new LinkedList<Voto>();
		Libretto votiUp = new Libretto();
		Voto vTemp = null;
		for (Voto v : voti) {
			if (v != null) {
				if ((v.getVoto() >= 18 && v.getVoto() < 24) || v.getVoto() == 29) {
					vTemp = new Voto(v.getNomeCorso(), v.getVoto() + 1, v.getDataEsame());
					votiUp.add(vTemp);
				}

				else if (v.getVoto() >= 24 && v.getVoto() < 29) {
					vTemp = new Voto(v.getNomeCorso(), v.getVoto() + 2, v.getDataEsame());
					votiUp.add(vTemp);
				} else if (v.getVoto() == 30) {
					vTemp = new Voto(v.getNomeCorso(), v.getVoto(), v.getDataEsame());
					votiUp.add(vTemp);
				}
			}
		}
		return votiUp;
	}

	public String votiOrdinatiNome() {
		String risultato = "";
		Collections.sort(voti, new ComparatoreVoti());
		for (Voto v : voti) {
			if (v != null) {
				risultato += v.toString() + "\n";
			}
		}
		return risultato.trim();
	}

	public String votiOrdinatiVoto() {
		String risultato = "";
		Collections.sort(voti, new ComparatoreVotiVoto());
		for (Voto v : voti) {
			if (v != null) {
				risultato += v.toString() + "\n";
			}
		}
		return risultato.trim();
	}

	public void canc() {
		List<Voto> votiPlus = new LinkedList<Voto>();
		for (Voto v : voti) {
			if (v != null) {
				if (v.getVoto() >= 25) {
					votiPlus.add(v);
				}
			}
		}

		voti.retainAll(votiPlus);

	}

	public String toString() {
		String risultato = "";
		for (Voto v : voti) {
			if (v != null) {
				risultato += v.toString() + "\n";
			}
		}
		return risultato.trim();

	}
}
