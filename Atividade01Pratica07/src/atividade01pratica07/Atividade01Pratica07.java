/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01pratica07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno10
 */
public class Atividade01Pratica07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
      
        
        ArrayList<Produto> Produto = new ArrayList();
       
        
        System.out.println("========Cadastro de PRODUTO========");
        
        for(int i = 0; i < 3; i++){
        System.out.print("Registre um novo produto ");
        String nome = sc.nextLine();
        System.out.print("Insira o codigo do produto ");
        String codigo = sc.nextLine();
        System.out.print("Quantidade recebida ");
        int estoque = sc.nextInt();
        sc.nextLine();
        System.out.print("Qual o valor da preço ");
        float preco = sc.nextInt();
        sc.nextLine();
        System.out.println("");
        System.out.println("");
        
        Produto P = new Produto();
        P.setNome(nome);
        P.setCodigo(codigo);
        P.setEstoque(estoque);
        P.setPreco(preco);
        
        
        Produto.add(P);
          
    }
        System.out.println("========DADOS dO PRODUTO========");
      for(int i = 0; i <Produto.size(); i++){
          Produto uTemp = Produto.get(i);
          System.out.println("Produto " + uTemp.getNome());
          System.out.println("O codigo do produto é " + uTemp.getCodigo());
          System.out.println("A quantidade de estoque é " + uTemp.getEstoque());
          System.out.println("O preço do produto é " + uTemp.getPreco());
           System.out.println("");
          
      }
        
    }
    
}
