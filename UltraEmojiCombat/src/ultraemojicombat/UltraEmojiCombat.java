/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ultraemojicombat;

import ultraemojicombat.Lutador;

/**
 *
 * @author vxvit
 */
public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CRIANDO UM VETOR DE LUTADORES
        Lutador[] l = new Lutador[6];

        //INICIALIZANDO LUTADORES
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

        // Testando a apresentação dos lutadores
        /*for (Lutador l : lutadores) {
            l.apresentar(); // Supondo que o método apresentar() mostre os detalhes do lutador
            System.out.println("===================");
        }
        System.out.println("===================");
        */
        
        l[0].status();// <- pra apresentar um só lutador 
       
        
    }

}
