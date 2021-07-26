package com.example.currencyconvertor;

public class CurrencyModel {
    private final long id;
	private final String toCurrency;
	private final String fromCurrency;
	private final long amount;
	private final boolean auth;

	public CurrencyModel(long id, String toCurrency, String fromCurrency, long amount, boolean auth) {
		this.id = id;
		this.toCurrency = toCurrency;
		this.fromCurrency = fromCurrency;
		this.amount = amount;
		this.auth = auth;
	}

	public long getId() {
		return id;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public long getAmount() {
		return amount;
	}

	public boolean getAuth() {
		return auth;
	}
}
