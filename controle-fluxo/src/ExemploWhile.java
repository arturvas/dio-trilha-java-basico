import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 50.0;
        int quantidadeDeDocesComprados = 0;
        while (mesada > 0){
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Valor do doce: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
            quantidadeDeDocesComprados++;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joaozinho gastou toda a sua mesada em " + quantidadeDeDocesComprados + " doces.");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
