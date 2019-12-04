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
public class ProyectosFinales {

   private static Arbol arbol;
	private final static int[] valores = {60, 75, 66, 85, 42, 14, 73, 72, 2, 54};

	public static void main(String[] args) {
		
		//Creamor arbol con el valor inicial
		arbol = new Arbol(valores[0]);
		//Insertamos siguientes valores
		for (int i = 1; i < valores.length; i++)
			arbol.insertarValor(valores[i]);
		
		System.out.println("Altura del arbol(1er nivel es 0): " + arbol.getAltura());
		System.out.println("Cantidad de nodos: " + arbol.contarNodos());
		System.out.println("Cantidad de hojas: " + arbol.contarHojas());
		System.out.print("Los valores de los nodos hoja son : ");
		LinkedList<Integer> listaHojas = arbol.getListadoHojas();
		for (Integer valor: listaHojas)
			System.out.print(valor + " ");

	}

}