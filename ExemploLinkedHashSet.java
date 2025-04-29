import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        // Criando um LinkedHashSet de Strings
        LinkedHashSet<String> frutas = new LinkedHashSet<>();

        // Adicionando elementos
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Banana"); // Está repetida, portanto não será adicionada de novo
        frutas.add("Uva");
        frutas.add("Kiwi");
        frutas.add("Pera");
        frutas.add("Kiwi"); // Outro elemento repetido
        
        // Resultado do LinkedHashSet
        // A ordem de inserção é mantida e elementos duplicados não são adicionados
        System.out.println("Frutas: " + frutas);
    }
}
