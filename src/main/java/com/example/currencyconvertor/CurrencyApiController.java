package com.example.currencyconvertor;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.currencyconvertor.Services.AuthenticationService;
import com.example.currencyconvertor.Services.RatePickerService;

@RestController
public class CurrencyApiController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/currency-convertor/{requestCurrency}/{resultCurrency}/{amount}")
	public CurrencyModel convertCurrency (
		@PathVariable String requestCurrency, 
		@PathVariable String resultCurrency,
		@PathVariable long amount) {
			boolean auth = AuthenticationService.checkAuthenticationToken();
			RatePickerService.callinExchangeApi();
			return new CurrencyModel(counter.incrementAndGet(), requestCurrency, resultCurrency, amount, auth);
	}
}