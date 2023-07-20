import java.util.concurrent.ThreadLocalRandom;

public class Exemplo4 {
    public static void main(String[] args) {
        // VAMOS FAZER QUE O PROGRAME CHEGUE ATE O MEU 50 ELE DIGA QUE CHEGOU AO SEU
        // LIMITE

        double mesada = 50.0;

        while (mesada > 0) {
            double valordoce = valorAleatorio();
            if (valordoce > mesada)
                ;
            valordoce = mesada;
            System.out.println("VALOR TOTAL DO CARRINHO  :" + valordoce);
            break;
        }
        System.out.println("MESADA : " + mesada);
        System.out.println("JOÃOZINHO GASTOU TODA A SUA MESADA EM DOCES !");
    }

    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);

    }
}
