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
public class Nodo {
    private int valor;
	private Nodo izq;
	private Nodo der;
	
	public Nodo(int valor) {
		this.valor = valor;
		izq = null;
		der = null;
	}
	
	public int getValor() {
		return valor;
	}
        public int recibeValor(int v, int altura) {
		if (valor > v) {
			if (izq == null)
			{
				izq = new Nodo(v);
				return ++altura;	}
			else
				return izq.recibeValor(v, ++altura);
		}
		else if (valor < v) {
			if (der == null)
			{
				der = new Nodo(v);
				return ++altura;
			}
			else
				return der.recibeValor(v, ++altura);
		}
		else
			return altura;
	}
    public int cuentaNodos() {
		if (izq == null && der == null)
			return 0;
		else if (izq != null && der != null)
			return 2 + izq.cuentaNodos() + der.cuentaNodos();
		else if (izq != null && der == null)
			return 1 + izq.cuentaNodos(); 
		else
			return 1 + der.cuentaNodos();
					
	}
	public int cuentaHojas(int hojas) {
		if (izq == null && der == null)
			return ++hojas;
		else if (izq != null && der != null)
			return izq.cuentaHojas(hojas) + der.cuentaHojas(hojas);
		else if (izq != null && der == null)
			return izq.cuentaHojas(hojas);
		else
			return der.cuentaHojas(hojas);
	}
        public void listarHojas(LinkedList<Integer> lista) {
		if (izq == null && der == null) {
			lista.add(valor);
		}
		else if (izq != null && der != null)
		{
		 izq.listarHojas(lista);
		 der.listarHojas(lista);
		}
		else if (izq != null && der == null)
			izq.listarHojas(lista);
		else
			der.listarHojas(lista);
	}
}

