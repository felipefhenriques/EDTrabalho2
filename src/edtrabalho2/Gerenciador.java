/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edtrabalho2;

/**
 *
 * @author Felipe
 */
public class Gerenciador {

    public static void main(String[] args) {
        ABB tree = new ABB();
        tree.insere("8");
        tree.insere("2");
        tree.insere("5");
        tree.insere("7");
        tree.insere("9");
        tree.insere("3");
        tree.insereR("11");
        tree.insereR("10");
        tree.insereR("6");
        System.out.println(tree);
        System.out.println("Pré-ordem");
        tree.preOrdem();
        System.out.println("\nIn-ordem");
        tree.inOrdem();
        System.out.println("\nPos-ordem");
        tree.posOrdem();
        System.out.println("");
        String num = "7";
        if(tree.buscaR(num) != null){
            System.out.println("Achou " + tree.buscaIt(num).getElemento() );
        } else {
            System.out.println("Não achou");
        }
        num = "4";
        if(tree.buscaR(num) != null){
            System.out.println("Achou " + tree.buscaIt(num).getElemento() );
        } else {
            System.out.println("Não achou");
        }
        
        System.out.println("A árvore possui " + tree.contaNos() + " nós");
        System.out.println("A árvore possui altura " + tree.altura());
        tree.inOrdemFolha();
        System.out.println("");
        System.out.println("O menor nó é " + tree.menorIt().getElemento());
        System.out.println("O maior nó é " + tree.maiorR().getElemento());
        
        System.out.println("Removendo o nó 6 " + tree.remove("6")); // Nó folha
        tree.inOrdem();
        System.out.println("");
        
        System.out.println("Removendo o nó 9 " + tree.remove("9")); // Nó com 1 filho
        tree.inOrdem();
        System.out.println("");
        
        System.out.println("Removendo o nó 8 " + tree.remove("8")); // Nó com 2 filhos
        tree.inOrdem();
        System.out.println("");
        
        System.out.println("Removendo o nó 4 " + tree.remove("4")); // Nó que não existe
        tree.inOrdem();
        System.out.println("");
        
    }
    
}
