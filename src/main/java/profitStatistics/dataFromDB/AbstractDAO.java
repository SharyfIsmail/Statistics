package profitStatistics.dataFromDB;

import java.sql.SQLException;
import java.util.Deque;

public abstract class AbstractDAO<T>
{
	protected  WrapperConnector getConnection() throws SQLException 
	{
		WrapperConnector wrapperConnector = new WrapperConnector();
		return wrapperConnector;
	}
	public abstract Deque<T> findAll();
	public abstract Deque<T> findbyInstrument(String instrument);
	public abstract Deque<T> findbyProfit(double profit);
	public abstract Deque<T> findbyIsInProcess(boolean isTrue);
	public abstract boolean create(T entity);
}
