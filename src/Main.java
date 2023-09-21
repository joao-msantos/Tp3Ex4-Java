import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Bem-vindo ao exercício 4 do TP3 de Java. \n Digite qualquer tecla para continuar ...");
        scanner.next();

        System.out.println("4-) Considerando que os indivíduos da população são codificados através de strings, o  operador de recombinação recebe duas strings S1 e S2, sorteia aleatoriamente um ponto  de corte em S1 e S2. Em seguida, realizada a troca de informações genéticas de S1 e S2, de  forma a gerar dois novos indivíduos filhos. A figura abaixo ilustra o processo de  recombinação.\n");
        System.out.println(" Construa um programa em Java que implemente e utilize os métodos recombinacao e  mutacao:");

        System.out.println("\n   1 - o metodo recombinação recebe duas Strings e retorna um Array com 2 Strings sendo s0 e s1 os filhos recombinados. \n");
        CadeiaDeDna gerador = new CadeiaDeDna();

        System.out.println("Digite o tamanho das cadeias de DNA a serem geradas:");
        int tamanho = Integer.parseInt(scanner.next());

        String cadeia1 = gerador.gerarCadeiaDeDna(tamanho);
        String cadeia2 = gerador.gerarCadeiaDeDna(tamanho);

        System.out.println("Cadeia 1: " + cadeia1 + " / Cadeia 2: " + cadeia2);
    }
    static class CadeiaDeDna {
        private static final String PROTEINAS = "ACGT";
        private Random random = new Random();

        public String gerarCadeiaDeDna(int tamanho) {
            StringBuilder cadeia = new StringBuilder();
            for (int i = 0; i < tamanho; i++) {
                int index = random.nextInt(PROTEINAS.length());
                char proteina = PROTEINAS.charAt(index);
                cadeia.append(proteina);
            }
            return cadeia.toString();
        }
    }

}