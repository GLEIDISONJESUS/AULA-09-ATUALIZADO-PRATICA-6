/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placarbasquetepratica07;

/**
 *
 * @author Aluno10
 */
public class PlacarBasquetePratica07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Placar Pl = new Placar();
        
        Pl.setPontuacaoMandante(20);
        Pl.setPontuacaoVisitante(8);
        
        
        
        System.out.println("Placar do jogo X e Y " + Pl.getPontuacaoMandante());
        System.out.println("Placar do jogo visitante X e Y " + Pl.getPontuacaoVisitante());
        
    }
    
}
