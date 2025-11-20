package org.leonardoteixeira.service;

import org.leonardoteixeira.client.ExchangeRateAPI;
import org.leonardoteixeira.dto.ConversorDTO;
import org.leonardoteixeira.model.TaxaCambio;

import java.io.IOException;

public class ConversorService {

    String baseCode = "";
    String targetCode = "";
    private TaxaCambio taxaCambio;

    public void obterTaxaDeCambio(int opcao)
            throws IOException, InterruptedException {

        switch (opcao) {
            case 1 -> {
                baseCode = "BRL";
                targetCode = "USD";
            }
            case 2 -> {
                baseCode = "USD";
                targetCode = "BRL";
            }
            case 3 -> {
                baseCode = "EUR";
                targetCode = "BRL";
            }
            case 4 -> {
                baseCode = "BRL";
                targetCode = "EUR";
            }
            case 5 -> {
                baseCode = "EUR";
                targetCode = "USD";
            }
            case 6 -> {
                baseCode = "USD";
                targetCode = "EUR";
            }
        }
        ExchangeRateAPI rateAPI = new ExchangeRateAPI();
        ConversorDTO dto = rateAPI.buscaValorMoedas(baseCode, targetCode);

        this.taxaCambio = new TaxaCambio(dto);
    }

    public double realizarCambio(double valor) {
        if (taxaCambio == null) {
            throw new IllegalStateException("A taxa de câmbio ainda não foi obtida.");
        }
        return taxaCambio.converter(valor);
    }
}
