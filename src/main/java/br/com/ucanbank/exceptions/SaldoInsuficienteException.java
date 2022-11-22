package br.com.ucanbank.exceptions;

public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException() {
    }
    public SaldoInsuficienteException(String mensagem) {

        super(mensagem);
    }

}
