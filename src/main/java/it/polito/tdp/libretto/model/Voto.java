package it.polito.tdp.libretto.model;

public class Voto {
	String nomeCorso;
	int voto;
	String dataEsame;
	
	public Voto(String nomeCorso, int voto, String dataEsame) {
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.dataEsame = dataEsame;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public int getVoto() {
		return voto;
	}

	public String getDataEsame() {
		return dataEsame;
	}

	@Override
	public String toString() {
		return this.nomeCorso+" "+this.voto+" "+this.dataEsame;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}
	
}
