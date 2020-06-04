/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edtrabalho2;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Gerenciador {

    static Scanner valor = new Scanner (System.in);
    
    public static void main(String[] args) {
        ABB tree = new ABB();
        System.out.println("Digite uma frase: ");
        String frase = valor.nextLine();
        
        String[] divisor = dividirEmPalavras(frase);
        for (int i = 0; i < divisor.length; i++){
            if(!divisor[i].equals(" ")){
                tree.insere(divisor[i]);
            }
            
        }
        boolean sair = false;
        
        while(sair == false){
            System.out.println("Escolha uma opção");
            System.out.println("1- Imprimir pré-ordem");
            System.out.println("2- Imprimir in-ordem");
            System.out.println("3- Imprimir pós-ordem");
            System.out.println("4- Sair do menu");
            int opcao = valor.nextInt();
            
            switch(opcao){
            case 1:
                tree.preOrdem();
                break;
            case 2:
                tree.inOrdem();
                break;
            case 3:
                tree.posOrdem();
                break;
            case 4:
                sair = true;
                break;
            default:
                System.out.println("Entrada inválida");
                
         
            }
        }
        
    }
    
    private static String[] dividirEmPalavras(String texto) {
        String separadoraDePalavras = "special" + System.currentTimeMillis() + "divider";
        String resultado = "";
        String palavraAtual = "";
        for (int i = 0; i < texto.length(); i++) {
            char caracterAtual = texto.charAt(i);
            boolean ehLetraOuNumero = Character.isLetter(caracterAtual) || Character.isDigit(caracterAtual);
            if (ehLetraOuNumero) {
                palavraAtual += caracterAtual;
            } else {
                if (palavraAtual.length() > 0) {
                    resultado += palavraAtual;
                    resultado += separadoraDePalavras;
                    palavraAtual = "";
                }

                resultado += caracterAtual;
                if (i < texto.length() - 1) {
                    resultado += separadoraDePalavras;
                }
            }
        }
        
        return resultado.split(separadoraDePalavras);
    }
    
}
