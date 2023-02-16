package arrayslist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		fila.add("Ronny");
		fila.add("Lucas");
		fila.add("Isaac");
		fila.add("Fernando");
		fila.add("Laise");
		fila.add("Elizangela");

		Iterator<String> iFila = fila.iterator();

		while (iFila.hasNext()) {
			System.out.println(iFila.next());
		}

		System.out.println("\nRetirar um elemento da fila: ");

		System.out.println(fila.poll());

		System.out.println("\nFila atualizada: ");

		for (var elemento : fila) {
			System.out.println(elemento);
		}
		System.out.println("\n" + fila);

		System.out.println("\n" + fila.peek());

		System.out.println("\n" + fila.size());
	}

}
