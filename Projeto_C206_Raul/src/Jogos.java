import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Jogos {
    ArrayList<Integer> sortiados = new ArrayList<>();

    private Map<String,ArrayList<Integer>> apostas = new HashMap<>();

    public void apostar(String nome,ArrayList<Integer> apostas1){
        apostas.put(nome,apostas1);
    }

    public abstract void premio(int acertos, Conta c,Cliente cliente);

    public Map<String, ArrayList<Integer>> getApostas() {
        return apostas;
    }
}
