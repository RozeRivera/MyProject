package hrproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddAccountant {
	static // add accountant
	Label lblAccountant=new Label("Add Accountant");
	static TextField accountantNameEntry=new TextField("Add Accountant");
	static TextField accountantPassEntry=new TextField("Password");
	static TextField accountantEmailEntry=new TextField("Email");
	static TextField accountantNoEntry=new TextField("Contact No.");
	static Button btnAddAccountant=new Button("Add Accountant");
	static Button backToAdminSec=new Button("Back");
	
	public static void showForm() throws Exception {
		
		
		
		//BorderPane root= new BorderPane();
	
		lblAccountant.setAlignment(Pos.CENTER);
		lblAccountant.setFont(Font.font ("Lato",FontWeight.BOLD, 25));
		lblAccountant.setTextFill(Color.web("#442C2E"));
		lblAccountant.setStyle("-fx-background-color: #FEDBD0;-fx-translate-y: -35;-fx-translate-x: +15; -fx-content-display: bottom;");
		
		FlowPane join=new FlowPane();
		GridPane entry=new GridPane();
		join.setStyle("-fx-background-color: #FEDBD0");
		entry.setStyle("-fx-background-color: #FEDBD0");
		entry.setAlignment(Pos.CENTER);
		entry.setPadding(new Insets(10,11,10,11));
		entry.setVgap(10);;
		entry.add(lblAccountant, 0, 0);
		
		entry.add(accountantNameEntry, 0, 1);
		entry.add(accountantPassEntry, 0, 2);
		entry.add(accountantEmailEntry, 0, 3);
		entry.add(accountantNoEntry, 0, 4);
		entry.add(btnAddAccountant, 0, 5);
		entry.add(backToAdminSec, 0, 6);
		
		btnAddAccountant.setPrefSize(200, 10);
		backToAdminSec.setPrefSize(200, 10);

		join.getChildren().addAll(entry);
		join.setAlignment(Pos.CENTER);
		entry.setPrefWidth(300);
		//entry.setPrefHeight(400);
		entry.setBorder(new Border(new BorderStroke(Color.web("#442C2E"),BorderStrokeStyle.SOLID,
                null,new BorderWidths(4))));
		accountantNameEntry.setStyle("-fx-translate-y: -30; -fx-content-display: bottom;");
		accountantNameEntry.setStyle("-fx-translate-y: -30; -fx-content-display: bottom;");
		accountantPassEntry.setStyle("-fx-translate-y: -30; -fx-content-display: bottom;");
		accountantEmailEntry.setStyle("-fx-translate-y: -30; -fx-content-display: bottom;");
		accountantNoEntry.setStyle("-fx-translate-y: -30; -fx-content-display: bottom;");
		
		btnAddAccountant.setStyle("-fx-translate-y: -12; -fx-content-display: bottom;"
				+ "-fx-base: #5C4244; -fx-hover-base: #A99597;");
		backToAdminSec.setStyle("-fx-translate-y: -12; -fx-content-display: bottom;");
		
		
		accountantNameEntry.setAlignment(Pos.CENTER);
		accountantNameEntry.setMaxWidth(200);
		
		accountantPassEntry.setAlignment(Pos.CENTER);
		accountantPassEntry.setMaxWidth(200);
		
		accountantEmailEntry.setAlignment(Pos.CENTER);
		accountantEmailEntry.setMaxWidth(200);
		
		accountantNoEntry.setAlignment(Pos.CENTER);
		accountantNoEntry.setMaxWidth(200);
		
		Scene sc=new Scene(join,640,480);
		sc.setFill(Color.web("#FEDBD0"));
		Stage stage=new Stage();
		stage.setScene(sc);
		stage.setTitle("Add Accountant");
		stage.show();
		
		//Set On Action
		
		btnAddAccountant.setOnAction(e->{
			insertData();
		});
			
			

			
		backToAdminSec.setOnAction(e1->{
			AdminSection.adminChoice();
			stage.close();
		});

	}
	
	public static void insertData() {
		String name=accountantNameEntry.getText();
		String password=accountantPassEntry.getText();
		String email=accountantEmailEntry.getText();
		String phNo=accountantNoEntry.getText();
		System.out.print(name);
		//ViewAccountant.initializeDB();
		Connection connection=null;
		try {
			// Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			
			// Establish a connection
			connection = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/HRDB", "root", "MomijiHlaing@1234!");
			// ("jdbc:oracle:thin:@liang.armstrong.edu:1521:orcl",
			// "scott", "tiger");
			System.out.println("Database connected");
		
		// Create a statement
		String sql="insert into accountantdata values(default,?,?,?,?)";
		PreparedStatement pstmt=connection.prepareStatement(sql);
		pstmt.setString(1,name);
		pstmt.setString(2,password);
		pstmt.setString(3,email);
		pstmt.setString(4,phNo);

		pstmt.executeUpdate();
		} 
		
		
		catch(Exception ex) { 
			System.out.println(ex);
			}
		try {
			connection.close();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}
}