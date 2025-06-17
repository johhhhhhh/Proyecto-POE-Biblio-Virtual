import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private final Queue<Integer> cola = new LinkedList<>();

    public void encolar(int valor) {
        cola.offer(valor);
    }

    public int desencolar() {
        return cola.poll();
    }

    public String recorrer() {
        StringBuilder sb = new StringBuilder();
        for (int val : cola) {
            sb.append(val).append("\n");
        }
        return sb.toString();
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }
}
