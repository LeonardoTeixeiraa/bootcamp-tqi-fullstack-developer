package org.leonardoteixeira.model;

import org.leonardoteixeira.dto.ConversorDTO;

public class TaxaCambio {
    private final String baseCode;
    private final String targetCode;
    private final double conversionRate;


    public TaxaCambio(ConversorDTO conversorDTO) {
        this.baseCode = conversorDTO.base_code();
        this.targetCode = conversorDTO.target_code();
        this.conversionRate = conversorDTO.conversion_rate();
    }

    public double converter(double valor){
        return valor * conversionRate;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public double getConversionRate() {
        return conversionRate;
    }
}
