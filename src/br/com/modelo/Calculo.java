package br.com.modelo;

public class Calculo {

    public void calcularMoeda(Moeda m) {
        switch (m.getOp()) {
            case "Dólar para Reais":
                m.setResultado(m.getValor1() * 5.16);
                break;
            case "Reais para Dólar":
                m.setResultado(m.getValor1() / 5.16);
                break;
            case "Euro para Reais":
                m.setResultado(m.getValor1() * 5.97);
                break;
            case "Reais para Euro":
                m.setResultado(m.getValor1() / 5.97);
                break;
            case "Iene para Reais":
                m.setResultado(m.getValor1() / 0.032);
                break;
            case "Reais para Iene":
                m.setResultado(m.getValor1() * 0.032);
                break;
            case "Peso Mexicano para Reais":
                m.setResultado(m.getValor1() / 0.30);
                break;
            case "Reais para Peso Mexicano":
                m.setResultado(m.getValor1() * 0.30);
                break;
            default:
                break;
        }
    }
}
