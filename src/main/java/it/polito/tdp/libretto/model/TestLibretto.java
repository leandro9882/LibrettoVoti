package it.polito.tdp.libretto.model;

import java.util.Collections;

public class TestLibretto {

	public static void main(String[] args) {
		Libretto libretto = new Libretto();
		Voto vTemp;
		vTemp=new Voto("Analisi 1",21,"10/01/2020");
		libretto.add(vTemp);
		vTemp=new Voto("Analisi 2",26,"11/01/2020");
		libretto.add(vTemp);
		vTemp=new Voto("Fisica 1",25,"12/01/2020");
		libretto.add(vTemp);
		vTemp=new Voto("Fisica 2",28,"13/01/2020");
		libretto.add(vTemp);
		vTemp=new Voto("Programmazione a oggetti",29,"14/01/2020");
		libretto.add(vTemp);
		vTemp=new Voto("Basi di dati",23,"15/01/2020");
		libretto.add(vTemp);
		vTemp=new Voto("Statistica",22,"16/01/2020");
		libretto.add(vTemp);
		vTemp=new Voto("Inglese",27,"17/01/2020");
		libretto.add(vTemp);
		vTemp=new Voto("Ricerca operativa",27,"18/01/2020");
		libretto.add(vTemp);
		vTemp=new Voto("VIQ",30,"19/01/2020");
		libretto.add(vTemp);
		
		
		System.out.println("Stampare tutti i corsi in cui il voto è pari a 25");
		System.out.println(libretto.getCorsi());
		
		System.out.println("Ricercare nel Libretto il voto di un esame, dato il nome del corso");
		System.out.println(libretto.getVotoEsame("Basi di dati"));
		
		System.out.println("CheckVoto");
		vTemp=new Voto("Basi di dati",23,"19/01/2020");
		boolean v=libretto.CheckVoto(vTemp);
		if(v==true)
			System.out.println("Voto già esistente");
		else System.out.println("Voto non duplicato");
		
		System.out.println("CheckConflitto");
		vTemp=new Voto("Basi di dati",22,"19/01/2020");
		boolean f=libretto.CheckConflitto(vTemp);
		if(f==true)
			System.out.println("Esame già dato");
		else System.out.println("Esame non ancora presente nel libretto");
		
		Libretto lUp=libretto.upgrade();
		
		System.out.println("stampare il libretto in ordine alfabetico di esame");
		System.out.println(libretto.votiOrdinatiNome());
		
		System.out.println("Stampare in ordine numerico decrescente di voto");
		System.out.println(libretto.votiOrdinatiVoto());
		
		System.out.println("Cancellare tutti i voti inferiori a 24");
		libretto.canc();
		System.out.println(libretto.toString());
			
		
		
		
		
		
		
	}
}
