package Futbol;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		//Creando arquero
	    Arquero A1 = new Arquero("Castro", "Laionel", 23, "99", "Real bolivia", 2, 9);
	    
	    //Creando Defensa
	     Defensor D1 = new Defensor("Quijote", "Don", 19, "3", "Bracelona", 2, 9);
	     Defensor D2 = new Defensor("Montes", "Salta", 30, "23", "Valencia ", 6, 7);	 
	    //Creando MedioCampista
	    Mediocampista M1 = new Mediocampista("Van dick", "Boomberdier", 29, "9", "Universidad de peru", 8, 2);
	    
	    //Creando Delantero 
	    Delantero DL1 = new Delantero("Alcan", "Tarilla", 25, "11", "Rober Play", 10, 10);
	    
	    List<Futbolista> jugadores = new ArrayList<>();
	    jugadores.add(A1);
	    jugadores.add(D1);
	    jugadores.add(D2);
	    jugadores.add(M1);
	    jugadores.add(DL1);	
	    
	    for (Futbolista f : jugadores) {
	    	
	    	imprimirFutbolista(f); 
        }
        int arquero = 0;
        int defensa = 0;
        int mediocampista = 0;
        int delantero = 0;
        for (Futbolista f : jugadores) {
            if (f instanceof Arquero) {
                arquero++;
            } else if (f instanceof Defensor) {
                defensa++;
            } 
            else if (f instanceof Mediocampista) {
                mediocampista++;
            }
            else if (f instanceof Delantero) {
                delantero++;
            }
        }
        System.out.println("\nTotal de arqueros: " + arquero);
        System.err.println("---------  --------\n");
        System.out.println("Total de defensores: " + defensa);
        System.err.println("-----------------\n");
        System.out.println("Total de mediocampistas: " + mediocampista);
        System.err.println("-----------------\n");
        System.out.println("Total de delanteros: " + delantero);
    }

	
	
	
	
	  

	  public static void imprimirFutbolista(Futbolista f) {
	        System.out.println("----> " + f.resumenPartido());
	    }
	
	
}
