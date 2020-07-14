package warm_up_challenges;

import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

/**
 * Gary é um ávido caminhante. Ele rastreia suas caminhadas meticulosamente, prestando muita atenção a pequenos detalhes, como topografia. Durante sua última caminhada, ele tomou exatamentepassos. Para cada passo que dava, ele notava se era uma subida ,ou uma descida ,degrau. As caminhadas de Gary começam e terminam no nível do mar e cada degrau para cima ou para baixo representa ummudança de unidade na altitude. Definimos os seguintes termos:
 *
 * Uma montanha é uma sequência de etapas consecutivas acima do nível do mar, começando com uma etapa acima do nível do mar e terminando com uma etapa abaixo do nível do mar.
 * Um vale é uma sequência de etapas consecutivas abaixo do nível do mar, começando com uma etapa abaixo do nível do mar e terminando com uma etapa acima do nível do mar.
 * Dada a sequência de degraus para cima e para baixo de Gary durante sua última caminhada, encontre e imprima o número de vales pelos quais ele atravessou.
 *
 * Por exemplo, se o caminho de Gary for , ele primeiro entra em um vale unidades de profundidade. Então ele sobe uma montanhaunidades altas. Finalmente, ele volta ao nível do mar e termina sua caminhada.
 *
 * Descrição da função
 *
 * Complete a função countingValleys no editor abaixo. Ele deve retornar um número inteiro que denota o número de vales que Gary atravessou.
 *
 * countingValleys possui o (s) seguinte (s) parâmetro (s):
 *
 * n : o número de etapas que Gary executa
 * s : uma string descrevendo seu caminho
 * Formato de entrada
 *
 * A primeira linha contém um número inteiro , o número de etapas na caminhada de Gary.
 * A segunda linha contém uma única sequência, do  personagens que descrevem seu caminho.
 */
public class CountingValleysChallenge_02 {
    // Complete the countingValleys function below.

    /**
     * D = desce
     * U = sobe
     */
    public static int countingValleys(int n, String s) {
        int nivel = 0;
        int cont = 0;
        ArrayList valores = new ArrayList();

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'D'){
                nivel = nivel - 1;
            } else {
                if(s.charAt(i) == 'U'){
                    nivel = nivel + 1;
                }
            }
            valores.add(nivel);
            if(valores.size() >= 2) {
                if ((parseInt(valores.get(valores.size() - 1).toString())) == 0 && (parseInt(valores.get(valores.size() - 2).toString())) < 0) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static void main(String[] args) throws IOException {
        countingValleys(12, "DDUUDDUDUUUD");
    }
}