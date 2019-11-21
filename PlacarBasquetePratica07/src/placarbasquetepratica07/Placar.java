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
public class Placar {
    private int pontuacaoMandante;
    private int pontuacaoVisitante;
    private int faltasMandante;
    private int faltasVisitante;

    public int getPontuacaoMandante() {
        return pontuacaoMandante;
    }

    public void setPontuacaoMandante(int pontuacaoMandante) {
        this.pontuacaoMandante = pontuacaoMandante;
    }

    public int getPontuacaoVisitante() {
        return pontuacaoVisitante;
    }

    public void setPontuacaoVisitante(int pontuacaoVisitante) {
        this.pontuacaoVisitante = pontuacaoVisitante;
    }

    public int getFaltasMandante() {
        return faltasMandante;
    }

    public void setFaltasMandante(int faltasMandante) {
        this.faltasMandante = faltasMandante;
    }

    public int getFaltasVisitante() {
        return faltasVisitante;
    }

    public void setFaltasVisitante(int faltasVisitante) {
        this.faltasVisitante = faltasVisitante;
    }
    
    
    public int cesta2PontosMandante(){
        int soma = 2;
        return soma;
    }
    public int cesta3PontosMandante(){
        int soma = 3;
        return soma;
    }
    public int cesta2PontosVisitante(){
        int soma = 2;
        return soma;
    }
    public int cesta3PontosVisitante(){
        int soma = 3;
        return soma;
    }
    public int faltaDoMandante(){
        int add = 1;
        return add; 
    }
    public int faltaDoVisitante(){
        int add = +1;
        return add;
    }
}
