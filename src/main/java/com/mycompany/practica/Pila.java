import java.util.Stack;

public class Pila {
    private final Stack<Integer> pila = new Stack<>();

    public void push(int valor) {
        pila.push(valor);
    }

    public int pop() {
        return pila.pop();
    }

    public String recorrer() {
        StringBuilder sb = new StringBuilder();
        for (int i = pila.size() - 1; i >= 0; i--) {
            sb.append(pila.get(i)).append("\n");
        }
        return sb.toString();
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }
}
