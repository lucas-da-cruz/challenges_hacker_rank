package warm_up_challenges;

import java.io.*;
import java.util.*;
/**
 * John trabalha em uma loja de roupas. Ele tem uma grande pilha de meias que ele deve emparelhar por cores para venda.
 * Dada uma matriz de números inteiros representando a cor de cada meia, determine quantos pares de meias com as cores correspondentes.
 *
 * Por exemplo, existem  meias com cores . Há um par de cores e um de cor . Restam três meias estranhas, uma de cada cor. O número de pares é.
 *
 * Descrição da função
 * Complete a função sockMerchant no editor abaixo. Ele deve retornar um número inteiro representando o número de pares de meias correspondentes disponíveis.
 *
 * sockMerchant tem o (s) seguinte (s) parâmetro (s):
 * n : o número de meias na pilha
 * ar : as cores de cada meia
 *
 * Formato de entrada
 * A primeira linha contém um número inteiro , o número de meias representadas em .
 * A segunda linha contém inteiros separados por espaço que descrevem as cores  das meias na pilha.
 *
 * Retorne o número total de pares de meias que John pode vender.
 */
public class Challenge_01 {
    public static int sockMerchant(int n, int[] ar) {
        int cont = 0;
        ArrayList valores = new ArrayList();

        for(int i = 0; i < n; i++){
            for(int a = 0; a < n; a++) {
                if(ar[i] == ar[a] && a != i){
                    if(!valores.contains(i) && !valores.contains(a)){
                        cont++;
                        valores.add(i);
                        valores.add(a);
                    }
                }
            }
        }
        return cont;
    }

    public static void main(String[] args) throws IOException {
    int[] arrayy = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        sockMerchant(9, arrayy);
    }
}