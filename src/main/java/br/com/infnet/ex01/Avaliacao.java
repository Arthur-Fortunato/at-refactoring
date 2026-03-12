package br.com.infnet.ex01;

public class Avaliacao {
    private static final int LIMITE_MEDIO = 10;
    private static final int CASO_RARO = -9999;

    public static String avaliarNumero(int numero) {
        if (numero == CASO_RARO) return "CASO RARO";
        if  (numero == LIMITE_MEDIO) return "MEDIO";
        if (numero > LIMITE_MEDIO) return "ALTO";
        return "BAIXO";
    }
}