package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	ArrayList<Integer> listNumbers = new ArrayList<Integer>();
	
	/**
	 * Devuelve una lista de nros
	 * @return lista de nros llamada listNumbers
	 */
	private ArrayList<Integer> getList() {
		return listNumbers;
	}
	
	/**
	 * Agrega un nro a la lista de nros
	 * @param nro el número que va ser agregado 
	 */
	public void addNumber(Integer nro) {
		this.getList().add(nro);
	}
	
	/**
	 * Suma todos los nros que estan en la lista 
	 * @return el resultado de la suma de la lista listNumbers
	 */
	public int sumaNrosDeList() {
		int resultado = 0;
		for(Integer nro : listNumbers) {
			resultado += nro;
		}
		return resultado;
	}
	
	/**
	 * Resta todos los nros que estan en la lista 
	 * @return el resultado de la resta de la lista listNumbers
	 */
	public int restaNrosDeList() {
		int resultado = this.getList().get(1);
		for(Integer nro : listNumbers) {
			resultado = resultado - nro;
		}
		return resultado;
	}
	
	/**
	 * Multiplica todos los nros que estan en la lista 
	 * @return el resultado de la multiplicación de la lista listNumbers
	 */
	public int multiplicacionNrosDeList() {
		int resultado = 1;
		for(Integer nro : listNumbers) {
			resultado *= nro;
		}
		return resultado;
	}
}
