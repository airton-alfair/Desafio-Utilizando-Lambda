import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {
        /*
         * 1. A partir do Produto calcular o preco real (com desconto)
         * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
         * 3. Frete >= 3000 (100)/ < 3000 (50)
         * 4. Arrendondar: Deixar duas casas decimais
         * 5. Formatar: R$ 1234,56
         * */


        Function<Produto, Double> precoFinal =
                produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arrendonar =
                preco -> Double.parseDouble(String.format(Locale.US, "%.2f", preco)); // So consegui assim
        Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(".", ",");

        Produto p = new Produto("Ipad", 3235.89,0.50);
        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arrendonar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O preco final é: " + preco);


    }
}
