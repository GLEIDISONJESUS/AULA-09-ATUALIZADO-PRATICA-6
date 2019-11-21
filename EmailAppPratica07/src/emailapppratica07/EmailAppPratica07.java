/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapppratica07;

import java.util.Scanner;

/**
 *
 * @author Aluno10
 */
public class EmailAppPratica07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o destinatario ");
        String destinatario = sc.nextLine();
        System.out.print("Assunto: ");
        String assunto = sc.nextLine();
        System.out.print("Digite sua mensagem ");
        String mensagem = sc.nextLine();
        
        Email e = new Email();
        e.setAssunto(assunto);
        e.setDestinatario(destinatario);
        e.setRemetente(mensagem);
       
        
        System.out.println("");
        System.out.println("Assunto: " + e.getAssunto());
        System.out.println("Qual o destinatario " + e.getDestinatario());        
        System.out.println("Email de origem " + e.getRemetente());
        
        
    }
    
}
