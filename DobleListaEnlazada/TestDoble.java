package DobleListaEnlazada;

public class TestDoble {
    public static void main(String[]args){
    }
    public static DobleListaEnlazada<Integer> generarPeorCaso(int num) {
		DobleListaEnlazada<Integer> peorCaso = new DobleListaEnlazada<Integer>();
		for(int i = 0 ;i < num; i++)
			peorCaso.insert(num-i);
		return peorCaso;
	}
    public static void insertionSort(DobleListaEnlazada<Integer> a) {
    }
}
