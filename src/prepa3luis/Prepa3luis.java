/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prepa3luis;

/**
 *
 * @author massimo
 */
public class Prepa3luis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lista mylist = new Lista();
        
        mylist.InsertarFinal(4);
        mylist.InsertarFinal(5);
        mylist.InsertarFinal(6);
        
//        mylist.reverse();
//        mylist.Imprimir();
        
        System.out.println((mylist.getNodo(0)).getDato());
        
        Nodo hola = mylist.getpFirst().getPnext();
        System.out.println(mylist.getIndex(hola));
        System.out.println(mylist.getSize());
        
        
        
    }
    
}
