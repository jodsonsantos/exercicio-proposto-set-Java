import java.util.*;

public class ExercicioSet {

    public static void main(String[] args) {
        System.out.println("Crie uma conjunto contendo as cores do arco-íris: ");
        Set<String> corArcoIris = new HashSet<>();
        corArcoIris.add("violeta");
        corArcoIris.add("anil");
        corArcoIris.add("azul");
        corArcoIris.add("verde");
        corArcoIris.add("amarelo");
        corArcoIris.add("laranja");
        corArcoIris.add("vermelho");
        System.out.println(corArcoIris);

        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor : corArcoIris) {
            System.out.println(cor);
        }

        System.out.println("A quantidade de cores que o arco-íris tem: " + corArcoIris.size());

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> corArcoIris2 = new TreeSet<>(corArcoIris);
        System.out.println(corArcoIris2);

        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> corArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(corArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(corArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: corArcoIris) {
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = corArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(corArcoIris);

        System.out.println("Limpe o conjunto: ");
        corArcoIris.clear();

        System.out.println("Confira se o conjunto está vazio: " + corArcoIris.isEmpty());
    }

}

