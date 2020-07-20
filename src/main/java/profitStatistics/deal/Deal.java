package profitStatistics.deal;

import java.sql.Connection;
import java.text.SimpleDateFormat;

import profitStatistics.dataFromDB.WrapperConnector;

public class Deal 
{
	private String dealTime;
	private String instrumentName;
	private String GeneralDirection;
	private String dealDirection;
	private boolean inProgess;
	private double profit;

	public Deal()
	{
		super();
		setDefaultState();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((GeneralDirection == null) ? 0 : GeneralDirection.hashCode());
		result = prime * result + ((dealDirection == null) ? 0 : dealDirection.hashCode());
		result = prime * result + ((dealTime == null) ? 0 : dealTime.hashCode());
		result = prime * result + (inProgess ? 1231 : 1237);
		result = prime * result + ((instrumentName == null) ? 0 : instrumentName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(profit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deal other = (Deal) obj;
		if (GeneralDirection == null) {
			if (other.GeneralDirection != null)
				return false;
		} else if (!GeneralDirection.equals(other.GeneralDirection))
			return false;
		if (dealDirection == null) {
			if (other.dealDirection != null)
				return false;
		} else if (!dealDirection.equals(other.dealDirection))
			return false;
		if (dealTime == null) {
			if (other.dealTime != null)
				return false;
		} else if (!dealTime.equals(other.dealTime))
			return false;
		if (inProgess != other.inProgess)
			return false;
		if (instrumentName == null) {
			if (other.instrumentName != null)
				return false;
		} else if (!instrumentName.equals(other.instrumentName))
			return false;
		if (Double.doubleToLongBits(profit) != Double.doubleToLongBits(other.profit))
			return false;
		return true;
	}

	public void setDefaultState()
	{
		java.util.Date dealdate = new java.util.Date();
	    SimpleDateFormat  formatForDealDate = new SimpleDateFormat("yyyy.MM.dd");
	    dealTime =  formatForDealDate.format(dealdate);
	    instrumentName = "DJ";
	    GeneralDirection = null;
	    dealDirection = null;
	    inProgess = false;
	    profit = 0.0;
	}
	public String getDealTime() {
		return dealTime;
	}
	public void setDealTime(String dealTime) {
		this.dealTime = dealTime;
	}
	public String getInstrumentName() {
		return instrumentName;
	}
	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}
	public String getGeneralDirection() {
		return GeneralDirection;
	}
	public void setGeneralDirection(String generalDirection) {
		GeneralDirection = generalDirection;
	}
	public String getDealDirection() {
		return dealDirection;
	}
	public void setDealDirection(String dealDirection) {
		this.dealDirection = dealDirection;
	}
	public boolean isInProgess() {
		return inProgess;
	}
	public void setInProgess(boolean inProgess) {
		this.inProgess = inProgess;
	}
	public double getProfit() {
		return profit;
	}
	public void setProfit(double profit) {
		this.profit = profit;
	}
}
