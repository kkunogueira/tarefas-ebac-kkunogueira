import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pessoas {
    public static void main(String[] args) {
        Map<String, List<String>> gruposPorGenero = new HashMap<>();

        gruposPorGenero.put("M", new ArrayList<>());
        gruposPorGenero.put("F", new ArrayList<>());

        String entradaNomes = "João-M,Carlos-M,Fernanda-F,Amanda-F";

        String[] palavras = entradaNomes.split(",");

        for (String palavra : palavras) {
            String[] partes = palavra.split("-");
            String nome = partes[0];
            String genero = partes[1];

            gruposPorGenero.get(genero).add(nome);
        }

        Collections.sort(gruposPorGenero.get("M"));
        Collections.sort(gruposPorGenero.get("F"));

        System.out.println("Nomes masculinos (ordenados):");
        for (String nome : gruposPorGenero.get("M")) {
            System.out.println(nome);
        }

        System.out.println(" ");

        System.out.println("Nomes femininos (ordenados):");
        for (String nome : gruposPorGenero.get("F")) {
            System.out.println(nome);
        }
    }
}
