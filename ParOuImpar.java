/* Fonte:
 * https://courses.edx.org/courses/course-v1:Microsoft+DEV276x+1T2020/courseware/05e0e3f42c3644aaa52c2736f6452a9c/28269a95d2ba403eb057e3df9dbe54b1/?child=first
 */

/**************************************************
 * Construa um jogo de Par ou Ímpar,
 * com os fragmentos de código que se seguem,
 * seguindo o exemplo de jogo abaixo.
 *
 * Obs: o projeto já inclui a importação da classe
 * Random(), além da classe Scanner
 *
 *
 *
 * ----------------------------------------------------
 * Vamos jogar "Par ou Ímpar"!
 * Qual é o seu nome? Elaine
 * Oi, Elaine, qual você escolhe? (P)ar ou (I)mpar? I
 * Elaine escolheu Ímpar! O computador será Par.
 * ----------------------------------------------------
 * Quantos dedos você mostra? 1
 * O computador mostra 0 "dedos".
 * ----------------------------------------------------
 * 1 + 0 = 1
 * 1 é ... ímpar!
 * Então você venceu, Elaine! :)
 * ----------------------------------------------------
 * Vamos jogar de novo? (s)im ou (n)ão? n
 *
 */

package projetos.ParOuImpar;

import java.util.Scanner;
import java.util.Random;
// import java.util.*; // Importa tudo do pacote

public class ParOuImpar {

    public static void main(String[] args){

        // intro
        // obter o nome do usuário, e se ele(a) prefere par ou ímpar

        // randomizer
        // quantos "dedos" o computador vai utilizar

        // Essa é a estrutura básica de como utilizar a classe Random
        Random rand = new Random();
        int computador = rand.nextInt(6); // até seis "dedos"!!!

        // Essa é a estrutura básica de como utilizar a classe Scanner
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // soma
        // fazer a soma e exibir a(o) usuário(a)


        // o vencedor
        // determina quem vence o jogo e conta para o(a) jogador(a)
        /*

        se o(a) jogador(a) escolheu ímpar E o resultado da soma for ímpar,
        OU
        se o(a) jogador(a) escolheu par E o resultado da soma for par,
        o jogador ganha

        se o(a) jogador(a) escolheu ímpar E o resultado da soma for par,
        OU
        se o(a) jogador(a) escolheu par E o resultado da soma for ímpar,
        o jogador perde

        EM OUTRAS PALAVRAS...
        Se o resultado da soma for igual à escolha do jogador, ele ganha.
        Se o resultado da soma for diferente da escolha do jogador, ele perde.

         */


    }

}
