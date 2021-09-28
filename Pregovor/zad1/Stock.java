package zad1;

public class Stock {
	
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	Stock(String symbol, String name){
		this.setSymbol(symbol);
		this.setName(name);
	}
	
	public String getChangePercent() {
		//pp-x%.pp=cp
		//pp-cp=x%.pp
		//(pp-cp)/pp*100=x
		return (previousClosingPrice - currentPrice)/previousClosingPrice*100 + "%";
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	

}
