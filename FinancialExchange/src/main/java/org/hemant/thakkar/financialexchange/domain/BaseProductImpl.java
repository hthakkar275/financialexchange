package org.hemant.thakkar.financialexchange.domain;

import java.util.concurrent.atomic.AtomicLong;

public abstract class BaseProductImpl implements Product {

	private static AtomicLong idGenerator = new AtomicLong(1);

	private long id;
	private String symbol;
	private String description;

	public BaseProductImpl() {
		this.id = idGenerator.getAndIncrement();
	}
	
	@Override
	public long getId() {
		return this.id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String getSymbol() {
		return this.symbol;
	}

	@Override
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}
	

}
