/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.vxvitevilcorp.testeprogramacaoestruturada;

import java.util.Scanner;

/**
 *
 * @author vxvit
 */
public class TesteProgramacaoEstruturada {

    public static void main(String[] args) {
        
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entradaTeclado.nextLine();
        System.out.println("Programa que mostra que você é um vencedor, olha o que você está fazendo seguido seus sonhos !  ");
        System.out.println("\n");
        
        int num = 0;
        for (int vencedor = 0; vencedor <= 10; vencedor++) {
            System.out.println("vencedor" + num);
            num = num + 1;
        }
        
        System.out.println("\n");
        System.out.println(nome + " as vezes você só esta no lugar errado.\nQuando esteve no lugar errado por muito tempo passa a acreditar que você é o erro !");
        System.out.println("\n");
        System.out.println("Acredite você vai vencer nessa vida com a ajuda de Deus !");
        System.out.println("\n");
        System.out.println("NÃO EXISTE IDADE PARA SONHAR LEMBRE-SE DISSO !");
    }
}
