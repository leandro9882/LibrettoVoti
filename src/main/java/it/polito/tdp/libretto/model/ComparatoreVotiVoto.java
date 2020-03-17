package it.polito.tdp.libretto.model;

import java.util.Comparator;

public class ComparatoreVotiVoto implements Comparator<Voto> {

	@Override
	public int compare(Voto o1, Voto o2) {
		if(o1.getVoto()<o2.getVoto()) {
			return 1;
		}
		if(o1.getVoto()==o2.getVoto()) {
			return 0;
		}
		return -1;
	}

}
