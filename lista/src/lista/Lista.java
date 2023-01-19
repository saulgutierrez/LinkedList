package lista;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    
    ArrayList <Double> lista;
    
    public static void main(String[] args) {
        Lista miLista = new Lista();
        miLista.lista = new ArrayList();
        miLista.leerOpcion();
    }
    
    public void leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Lista de numeros");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3, Modificar");
            System.out.println("4. Eliminar");
            System.out.println("5. Insertar");
            System.out.println("6. Mostrar");
            System.out.println("7. Salir");
            System.out.println("Ingrese opcion: (1-7): ");
            opcion = teclado.nextInt();
            
            switch(opcion) {
                case 1:
                    ingresarValor();
                    break;
                case 2:
                    buscarValor();
                    break;
                case 3:
                    modificarValor();
                    break;
                case 4:
                    eliminarValor();
                    break;
                case 5:
                    insertarValor();
                    break;
                case 6:
                    mostrarLista();
                    break;
            }
        } while (opcion != 7);
        
    }
    
    public void ingresarValor() {
        Scanner teclado = new Scanner(System.in);
        double valor;
        System.out.println("Ingrese valor: ");
        valor = teclado.nextDouble();
        lista.add(valor);
    }
    
    public void buscarValor(){
        Scanner teclado = new Scanner(System.in);
        double valor = 0;
        int indice = 0;
        System.out.println("Valor a buscar: ");
        valor = teclado.nextDouble();
        indice = lista.indexOf(valor);
        if (indice != -1) {
            System.out.println("Dato se encuentra en la posicion: "+indice);
        } else {
            System.out.println("Dato no se encuentra");
        }
    }
    
    public void modificarValor() {
        Scanner teclado = new Scanner(System.in);
        double valor, nuevoValor;
        int indice;
        System.out.println("Valor a modificar: ");
        valor = teclado.nextDouble();
        indice = lista.indexOf(valor);
        if (indice != -1) {
            System.out.println("Nuevo valor: ");
            nuevoValor = teclado.nextDouble();
            lista.set(indice, nuevoValor);
        } else {
            System.out.println("Dato no se encuentra");
        }
    }
    
    public void eliminarValor() {
        Scanner entrada = new Scanner(System.in);
        double valor;
        int indice;
        System.out.println("Valor a eliminar: ");
        valor = entrada.nextDouble();
        indice = lista.indexOf(valor);
        if (indice != -1) {
            lista.remove(indice);
        } else {
            System.out.println("Dato no se encuentra");
        }
    }
    
    public void insertarValor() {
        Scanner teclado = new Scanner(System.in);
        double valor;
        int indice;
        System.out.println("Valro a insertar: ");
        valor = teclado.nextDouble();
        System.out.println("Posicion donde desea insertar: ");
        indice = teclado.nextInt();
        lista.add(indice, valor);
    }
    
    public void mostrarLista() {
        if (!lista.isEmpty()) {
            System.out.println("Elementos de la lista: ");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        } else {
            System.out.println("No existen valores en la lista");
        }
    }
}
