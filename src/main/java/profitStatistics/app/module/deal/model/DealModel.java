package profitStatistics.app.module.deal.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

import profitStatistics.dataFromDB.AbstractDAO;
import profitStatistics.dataFromDB.WrapperConnector;
import profitStatistics.deal.Deal;

public class DealModel  extends AbstractDAO<Deal>
{
	private Deal  deal;
	private Deque<Deal> dealDeque ;
	WrapperConnector wrapperConnector;
	public DealModel()
	{
		dealDeque = new ConcurrentLinkedDeque<>();
		deal = new Deal();
		wrapperConnector = new WrapperConnector();
	}

	public Deal getDeal() {
		return deal;
	}
	public void setDeal(Deal deal) {
		this.deal = deal;
	}
	public Deque<Deal> getDealDeque() {
		return dealDeque;
	}
	public void clear()
	{
		dealDeque.clear();
	}
	public void setDealDeque(Deque<Deal> dealDeque) {
		this.dealDeque = dealDeque;
	}
	@Override
	public Deque<Deal> findAll() {
		clear();
		PreparedStatement preparedStatement =wrapperConnector.getPreparedStatement("Select * from testdb");
		try {
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Deque<Deal> findbyInstrument(String instrument) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Deque<Deal> findbyProfit(double profit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Deque<Deal> findbyIsInProcess(boolean isTrue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Deal entity) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
