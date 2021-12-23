package StockReport;
import java.util.Scanner;

public class StockManagament {
	
	public static void main(String[] args) {
		
		PortFolio portfolio = new PortFolio();
		Stocks stock = new Stocks();
		Scanner sc = new Scanner(System.in);
		
		String add = "y";
		
		while(add.equalsIgnoreCase("Y")) {
			
			System.out.println("Enter a stock name");
			stock.setStock(sc.next());	
			
			System.out.println("enter a stock price");
			stock.setSharePrice(sc.nextLong());
			
			System.out.println("enter a no.of qty");
			stock.setNoOfShares(sc.nextLong());
			
			portfolio.addStocks(stock);
			System.out.println("--------------------------");
			
			System.out.println("do you want to add new stock :y/n");
			add = sc.next();
			System.out.println("--------------------------");
		}
		
		System.out.println(portfolio.viewAllStocks());
		
		System.out.println("Total value of portfolio :"+stock.valueOfPortfolio()); 
		sc.close();
	}
}
 