
import java.util.Scanner;
public class Espetaculo {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Custo de Produção: ");
        float custoProducao = entrada.nextFloat();
        System.out.print("Valor do Ingresso: ");
        float valorIngresso = entrada.nextFloat();
        //processamento dos dados
        int qtdeConvites = (int) Math.ceil(custoProducao / valorIngresso);
        int qtdeConvites23 = (int) Math.ceil(custoProducao * 1.23 / valorIngresso);
    }
}
