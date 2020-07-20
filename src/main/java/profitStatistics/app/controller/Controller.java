package profitStatistics.app.controller;

import java.net.URL;
import java.util.Deque;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentLinkedDeque;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import profitStatistics.deal.Deal;

public class Controller implements Initializable
{
	@FXML
	TableView<Deal> infoViewerTableView;
	@FXML
	TableColumn<Deal, String> dealDateColumn;
	@FXML
	TableColumn<Deal, String> instrumentColumn;
	@FXML
	TableColumn<Deal, String> generalDirectionColumn;
	@FXML
	TableColumn<Deal, String> dealColumn;
	@FXML
	TableColumn<Deal, Boolean> inProgressColumn;
	@FXML
	TableColumn<Deal, Double> profitCoilumn;
	
	@FXML
	TextField instrumentTextField;
	@FXML
	TextField generalDirectionTextField;
	@FXML
	TextField dealTextField;
	@FXML
	TextField inProgressTextField;
	@FXML
	TextField profitTextField;
	@FXML
	Button addInfoButton;
	@FXML
	Button getDataFromDbButton;
	

	public void addInfoAction(ActionEvent event)
	{
//		 Deque<Deal> current  = new ConcurrentLinkedDeque<Deal>();
//		 current.add(new Deal());
//		 ObservableList<Deal> product = FXCollections.observableArrayList(current);
//		
//		 infoViewerTableView.setItems(product);
	}
	public void getDataFromDbAction(ActionEvent event)
	{
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		dealDateColumn.setCellValueFactory(new PropertyValueFactory<>("dealTime"));
		instrumentColumn.setCellValueFactory(new PropertyValueFactory<>("instrumentName"));
		generalDirectionColumn.setCellValueFactory(new PropertyValueFactory<>("GeneralDirection"));
		dealColumn.setCellValueFactory(new PropertyValueFactory<>("dealDirection"));
		inProgressColumn.setCellValueFactory(new PropertyValueFactory<>("inProgess"));
		profitCoilumn.setCellValueFactory(new PropertyValueFactory<>("profit"));
		
	}
}
