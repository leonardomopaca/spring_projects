package com.practicing.springpracticing.controller;

import com.practicing.springpracticing.configuration.CurrencyServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceConfigurationController {
    @Autowired
    CurrencyServiceConfiguration currencyServiceConfiguration;

    @RequestMapping("/currency-service")
    public CurrencyServiceConfiguration returnCurrencyService(){
        return currencyServiceConfiguration;
    }
}
