package zad1;

public class StockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.setPreviousClosingPrice(34.5);
		stock.setCurrentPrice(34.35);
		System.out.println(stock.getChangePercent());

	}

}
