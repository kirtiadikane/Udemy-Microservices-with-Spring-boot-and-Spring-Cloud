package com.kirti.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="currency-exchange", url="localhost:8000")
public interface CurrencyExchangeProxy {

}
