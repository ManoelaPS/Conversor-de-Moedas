package br.com.controle;

import br.com.modelo.Moeda;
import br.com.modelo.Calculo;

public class Moedacontrole {
    private Moeda m = new Moeda();
    private Calculo c = new Calculo();

    public void calculoConvesao(double valor1, String op) {
        m.setValor1(valor1);
        m.setOp(op);
        c.calcularMoeda(m);
    }

    public double getResultado() {
        return m.getResultado();
    }
}