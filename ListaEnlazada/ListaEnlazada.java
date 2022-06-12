package ListaEnlazada;

public class ListaEnlazada<E> {
    private int tamaño=0;
	private Node<E> root;
	
	public ListaEnlazada() {
		this.root = null;
	}
	public Node<E> get(int indice) {
	    Node<E> aux = root;
	    for(int i=0;i<indice;i++)
	        aux=aux.getNext();
	    return aux;
	}
	public void remove(int indice) {
	    if(indice<tamaño) {
	        if(indice==0)
	            this.root=this.root.getNext();
	        else {
	            Node<E> anterior=this.get(indice-1);
	            anterior.setNext(this.get(indice+1));
	        }
	        tamaño--;
	    }
	}
}
