public class Exemplo3 {
    public static void main(String[] args) {

        for (int i = 0; i <= 20; i++) {
            if (i == 21) {
                break;
            }
            System.out.println("\n" + i);
        }
        System.out.println("\nFIM DO PROGRAMA!");

        // NESTE CASO EU VOU COLOCAR PARA ME RETORNAR O NOME QUE EU QUERO;
        String nomes[] = { "JOAO", "NANDA", "MILTON", "LEILA" };

        for (int x = 0; x < nomes.length; x++) {
            if (x == 2) {
                break;
            }
            System.out.println(nomes[x]);
        }

    }
}
