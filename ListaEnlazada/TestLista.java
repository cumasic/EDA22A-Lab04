package ListaEnlazada;

public class TestLista {
    public static void main(String[]args) {
    }
    public static ListaEnlazada<Integer> generarPeorCaso(int num) {
		ListaEnlazada<Integer> peorCaso = new ListaEnlazada<Integer>();
		for(int i = 0 ;i < num; i++)
			peorCaso.insert(num-i);
		return peorCaso;
	}
    public static void insertionSort(ListaEnlazada<Integer> a) {
    }
}
