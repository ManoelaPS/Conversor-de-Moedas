
package br.com.controle;


public class Calculo {
    private double valor;
             double soma;
             double maior;
    private int qtd;
    private int qtdabaixo;
    
        public double getValor() {
        return valor;
       }

    public void setValor(double valor) {
        this.valor = valor;
        soma+= this.valor;
        this.qtd++;
        
        if(valor < 500){
            qtdabaixo++;
        }
        
        if(maior < valor){
            maior = valor;
        }
    }
    
    public double maiorVenda(){
        return this.maior;
    }
    public double calculoMedia(){
        return soma/this.qtd;
       
    }
    public double quantidadeAbaixo(){
        return this.qtdabaixo;
    }
}
