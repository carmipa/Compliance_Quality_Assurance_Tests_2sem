package br.com.fiap.apdex;

public class Apdex {

    public  float calc(float satisfatorias , float toleraveis, float totalAmostras) {
        return (satisfatorias + (toleraveis/2)) /totalAmostras;
    }
}
