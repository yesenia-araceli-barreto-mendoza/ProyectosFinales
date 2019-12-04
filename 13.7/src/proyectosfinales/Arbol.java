/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosfinales;

import java.util.LinkedList;

/**
 *
 * @author Cruzp
 */
public class Arbol {
    private Nodo raiz;
	private int altura;
	
	public Arbol(int valor) {
		raiz = new Nodo(valor);
		altura = 0;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void insertarValor(int valor) {
		int alturaAlcanzada = raiz.recibeValor(valor, 0);
		if (alturaAlcanzada > altura)
			altura = alturaAlcanzada;
	}
	
	public int contarNodos() {
		return 1 + raiz.cuentaNodos();
	}
	
	public int contarHojas() {
		return raiz.cuentaHojas(0);
	}
	
	public LinkedList<Integer> getListadoHojas() {
		LinkedList<Integer> listadoHojas = new LinkedList<Integer>();
		raiz.listarHojas(listadoHojas);
		return listadoHojas;
	}
}


