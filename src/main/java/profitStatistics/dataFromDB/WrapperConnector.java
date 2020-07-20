package profitStatistics.dataFromDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class WrapperConnector 
{
	private Connection connection;
	public WrapperConnector()
	{
		try
		{
			ResourceBundle resourceBundle  = ResourceBundle.getBundle("/properties/DB/database");
			String url = resourceBundle.getString("db.url");
			String user = resourceBundle.getString("db.user");
			String password = resourceBundle.getString("db.password");
			this.connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS statistics (id MEDIUMINT not null auto_increment, dealDate date not null, instrument VARCHAR(20), generalDirection VARCHAR(20),\r\n" + 
					"dealDirection VARCHAR(20),inProcess BOOLEAN, profit double,primary key(id))");
		}catch (MissingResourceException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	public PreparedStatement getPreparedStatement(String sqlCommand)
	{
		PreparedStatement preparedStatement = null;
		try
		{
			preparedStatement = connection.prepareStatement(sqlCommand);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return preparedStatement;
	}
	public CallableStatement getCallableStatement(String sqlFucntion)
	{
		CallableStatement callableStatement = null;
		try
		{
			callableStatement = connection.prepareCall(sqlFucntion);	
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return callableStatement;
	}
	
}
