/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepa3luis;

/**
 *
 * @author massimo
 */
public class Lista {
//CONSTRUCTOR-----------------------------------------------------
    private Nodo pFirst;
    private Nodo pLast;
    private int Size;

    public Lista() {

        this.pFirst = null;
        this.pLast = null;
        this.Size = 0;

    }
    
    
    
//GETERS AND SETERS -----------------------------------------------
    /**
     * @return the pFirst
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Nodo getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the Size
     */
    public int getSize() {
        return Size;
    }

    /**
     * @param Size the Size to set
     */
    public void setSize(int Size) {
        this.Size = Size;
    }



//    PRIMERA PRIMITIVA QUE SE HACE, VE SI LA LISTA ES VACIA O NO Y RETORNA UN BOOLEAN-------------
    
    public boolean EsVacio() {

        return pFirst == null;

    }
//    INSERTA UN NODO AL FINAL DE LA LISTA ------------------------------------------------- 

    public void InsertarFinal(Object dato) {

        Nodo nuevo = new Nodo(dato);

        if (EsVacio()) {
            pFirst = nuevo;
            pLast = nuevo;

        } else {
            Nodo aux = pLast;
            aux.setPnext(nuevo);
            pLast = nuevo;

        }
        Size += 1;

    }
//IMPRIME LA LISTA -------------------------------------------------------------
    public void Imprimir() {

        if (!EsVacio()) {
            Nodo aux = pFirst;
            for (int i = 0; i < Size; i++) {
                System.out.print(aux.getDato() + " ");
                aux = aux.getPnext();

            }

        } else {
            System.out.println("La lista esta vacia");
        }
    }
    //    ELIMINA AL PRINCIPIO SINNNN EL RETORNO DEL NODO QUE ELIMINO --------------  

    public void EliminarAlInicio() {
        if (!EsVacio()) {
            pFirst = pFirst.getPnext();
            Size = Size - 1;

        } else {
            System.out.println("La lista esta vacia");
        }
    }
//    ELIMINA AL PRINCIPIO CONNNN EL RETORNO DEL NODO QUE ELIMINO---------------------

    public Nodo deleteAtTheStart() {
        Nodo node = pFirst;
        if (!EsVacio()) {

            pFirst = pFirst.getPnext();
            Size = Size - 1;

        } else {
            System.out.println("La lista esta vacia");
        }

        return node;
    }
//LE HACE REVERSE A LA LISA---------------------------------------------------------
    public void reverse() {
//        NO HACE FALTA EL NODO NODE = PFIRST PORQUE YA ME LO RETORNA LA FUNCION DE LISTA DELETE AT THE START
//        Nodo node = pFirst;

        Nodo node = this.deleteAtTheStart();

//        this.Imprimir();
        if (node != null) {
            this.reverse();
            this.InsertarFinal(node.getDato());

        }

    }
//OBTIENE EL NODO DEL INDEX DICHO, LUEGO SE PUEDE ACCEDER A LOS DATOS DE ESE NODO---------------------
    public Nodo getNodo(int pos) {
        if (!EsVacio()) {
            Nodo aux = pFirst;
            for (int i = 0; i < (pos); i++) {
                aux = aux.getPnext();

            }
            return aux;
        } else {
            return null;
        }
    }
//    OBTIENE EL INDEX DE UN NODO QUE SE LE PASE -----------------------------------------
    public int getIndex (Nodo node){
        if(!EsVacio()){
            Nodo aux = pFirst;
            int cont = 0;
            
            while (aux !=null){
                if (node==aux){
                    return cont;
                }
                cont++;
                aux = aux.getPnext();
            }
            return -1;
            
        }else{
            return -1;
            
        }
    }

}
