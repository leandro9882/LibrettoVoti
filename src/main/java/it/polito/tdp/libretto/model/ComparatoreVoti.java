package it.polito.tdp.libretto.model;

import java.util.Comparator;

public class ComparatoreVoti implements Comparator<Voto> {

	@Override
	public int compare(Voto o1, Voto o2) {
		if(o1.getNomeCorso().compareTo(o2.getNomeCorso())>0) {
			return 1;
		}
		if(o1.getNomeCorso().compareTo(o2.getNomeCorso())==0) {
			return 0;
		}
		return -1;
	}

}
