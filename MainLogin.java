package hrproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainLogin extends Application implements EventHandler<ActionEvent>{

	// Fee Report
	Label mainlbl=new Label("Fee Report");
	
	Button btnAdmin=new Button("Admin Login");
	Button btnAccountant=new Button("Accountant Login");

	
	// accountant Section
	Button addStud=new Button("Add Student");
	Button viewStud=new Button("View Student");
	Button EditStud=new Button("Edit Student");
	Button DueFee=new Button("Due Fee");
	Button accountantLogout=new Button("Logout");

	// add student
	Label lblAddStud = new Label();
	Text studName=new Text("Name:");
	Text studEmail=new Text("Email:");
	Text studCourse=new Text("Course:");
	Text studFee=new Text("Fee:");
	Text feePaid=new Text("Paid:");
	Text feeDue=new Text("Due:");
	Text studAddress=new Text("Address:");
	Text studCity=new Text("City:");
	Text studState=new Text("State:");
	Text studCountry=new Text("Country:");
	Text studNo=new Text("Contant No:");
	
	TextField entstudName=new TextField("Name:");
	TextField entstudEmail=new TextField("Email:");
	TextField entstudCourse=new TextField("Course:");
	TextField entstudFee=new TextField("Fee:");
	TextField entfeePaid=new TextField("Paid:");
	TextField entfeeDue=new TextField("Due:");
	TextField entstudAddress=new TextField("Address:");
	TextField entstudCity=new TextField("City:");
	TextField entstudState=new TextField("State:");
	TextField entstudCountry=new TextField("Country:");
	TextField entstudNo=new TextField("Contant No:");
	
	Button addStudent=new Button("Add Student");
	Button backToAccSec=new Button("Back");

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	static final double BORDER_RADIUS = 4;
	
	@Override
	public void start(Stage stage) throws Exception {

		FlowPane root = new FlowPane();

		VBox login= new VBox(40);
		HBox lbl=new HBox();
		lbl.getChildren().addAll(mainlbl);
		lbl.setAlignment(Pos.TOP_CENTER);
		lbl.setPadding(new Insets(5,10,20,10));
		login.getChildren().addAll(lbl, btnAdmin, btnAccountant);
		root.getChildren().addAll(login);
		

	    Scene scene=new Scene(root,1280, 720);
		stage.setScene(scene);
		stage.setTitle("Report");
		stage.show();
		
		// Login Style Sheet
		login.setPrefSize(300,300);
		login.setBorder(new Border(new BorderStroke(Color.web("#442C2E"),BorderStrokeStyle.SOLID,
                null,new BorderWidths(4)))); 
	    login.setStyle("-fx-background-color: transparent;");
		//login.setPadding(new Insets(30));
		login.setSpacing(25);
		login.setAlignment(Pos.CENTER);

		//Root Style Sheet
		root.setAlignment(Pos.CENTER);
	    root.setStyle("-fx-Background-color: transparent;");
	    
	    
	    // CSS
	 	mainlbl.setFont(Font.font ("Roboto",FontWeight.BOLD, 30));
	 	mainlbl.setTextFill(Color.web("#442C2E"));
	 	scene.setFill(Color.web("#FEDBD0"));
	    btnAdmin.setStyle("-fx-base: #5C4244; -fx-hover-base: #A99597;");
	    btnAccountant.setStyle("-fx-base: #5C4244; -fx-hover-base: #A99597;");
	    btnAdmin.setPrefHeight(10);
	    btnAdmin.setPrefWidth(120);
	    btnAccountant.setPrefHeight(10);
	    btnAccountant.setPrefWidth(120);
	    btnAdmin.setFont(Font.font ("Roboto",FontWeight.BOLD, 15));
		
	    //Set on Action
	    
	    btnAdmin.setOnAction(e-> AdminLogin.adminLoginForm());
	    
	    
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}

}
