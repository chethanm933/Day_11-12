package StockReport;
import java.util.ArrayList;
import java.util.List;

public class PortFolio {

	private List<Stocks> PortFolio = new ArrayList<Stocks>();
	
	
	public void setportfolio(List<Stocks> portfolio) {
		PortFolio = portfolio;
	}
	
	public void addStocks (Stocks stock) {
		PortFolio.add(stock);
	}
	
	public List<Stocks> viewAllStocks() {
		System.out.println("------------------------");
		return PortFolio;
	}
}
