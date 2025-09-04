package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	//El tipo counter va tener como colaborador interno la lista de nros
	ArrayList<Integer> listNumbers = new ArrayList<Integer>();
	
	/**
	 * Cuenta la cantidad de números pares que tiene la lista 
	 * @return Cantidad de números pares hallados en la lista 
	 */
	public int counterIntPar() {
		int count = 0;
		for(Integer intActual : listNumbers) {
			if( intActual % 2 == 0) {
				count ++; 
			}
		}
		return count;
	}
	
	
	/**
	 * Cuenta la cantidad de números impares que tiene la lista
	 * @return Cantidad de números impares hallados en la lista 
	 */
	public int counterIntImpar() {
		int count = 0;
		for(Integer intActual : listNumbers) {
			if( intActual % 2 == 1) {
				count ++; 
			}
		}
		return count;
	}
	
	/**
	 * Cuenta la cantidad de números que son múltiplos del número dado por parámetro 
	 * @param buscarInt Int a buscar en la lista 
	 * @return Cantidad de números que son múltiplo de buscarInt 
	 */
	public int counterIntMultiplos(Integer buscarInt) {
		int count = 0;
		for(Integer intActual : listNumbers) {
			if( intActual % buscarInt == 0) {
				count ++; 
			}
		}
		return count;
	}


	/**
	 * Agrega el nro dado a la lista
	 * @param nro Int que se agrega
	 */
	public void addNumber(Integer nro) {
		listNumbers.add(nro);
	}
	
	
	/**
	 * Devuelve el nro con mas digitos pares hallada en una lista 
	 * @return Nro con mas digitos pares
	 */
	public int desarmandoNros() {
		int nroFinal = listNumbers.get(1);
		int nroADescomponer;
		int count = 0; //cuenta cuantos digitos pares hay
		int max = 0;   //el maximo nro de digitos pares en un nro
		
		//Recorrido en toda la busqueda
		for(Integer intActual : listNumbers) {
			nroADescomponer = intActual;
			
			//recorrido por los digitos del nro
			while(nroADescomponer > 0) {
				
				if( ( (nroADescomponer % 10) //Obtengo el último digito del nro 
					    % 2) == 0 ) {        //Reviso si ese nro es par
					count ++; 
				}
				
				nroADescomponer = nroADescomponer / 10; //Quito el último digito
			}
			
			if(count > max ) {
				nroFinal = intActual;
				max = count;
			}
			
			count = 0; //Una vez que termino de descomponer el nro, comienzo el contador en 0 para revisar el prox nro
			
		}
		
		return nroFinal;
	}


	/**
	 * Dado dos nros retorna el maximo numero que divide a ambos
	 * @param x primer nro
	 * @param y segundo nro
	 * @return maximo nro que divide a x e y
	 */
	public int mcdEntre_Y_(int x, int y) {
		int resto = 0;
		while(x != 0) {
			resto = y % x;
			y = x;
			x = resto;
		} 
		return y;
	}


	public int multiploMasGrandeEntreCeroYMilDe_Y_(int x, int y) {
		int mcd = this.mcdEntre_Y_(x, y);
		int mcm = (x * y) / mcd;
		int resultado = mcm;
		
		if( mcm > 0 && mcm < 1000) {
			
			while (resultado <= 1000) {
				resultado += mcm; 
			}
			return resultado -= mcm;
			
		} else {
			return -1;
		}		
	}
	
	
}
