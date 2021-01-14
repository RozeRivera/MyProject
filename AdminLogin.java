package hrproject;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
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
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AdminLogin {
	
	public static void adminLoginForm()
	{
		Label lblAdmin=new Label("ADMIN LOGIN");
		Text adminName=new Text("Name");
		Text adminPass=new Text("Password");
		TextField adminNameEntry=new TextField();
		PasswordField adminPassEntry=new PasswordField();
		Button loginAdmin=new Button("Login");
		Button backToMain=new Button("Back");
		Text alert=new Text("Name or Password is invalid,\n Please check again.");
		
		alert.setVisible(false);
		// TODO Auto-generated method stub
		VBox join = new VBox();
		join.setPrefHeight(300);
		join.setPrefWidth(300);
		HBox button = new HBox();
		button.setStyle("-fx-translate-y: -20");
		FlowPane root = new FlowPane();
		button.setSpacing(12);
		button.getChildren().addAll(loginAdmin, backToMain);
		GridPane field=new GridPane();
		field.setPadding(new Insets(20,11,30,11));
		field.setHgap(10);
		field.setVgap(10);
		
		field.add(adminName,0,0);
		field.add(adminNameEntry,1,0);
		field.add(adminPass,0,2);
		field.add(adminPassEntry,1,2);
		field.add(alert, 1, 3);
		
		join.getChildren().addAll(lblAdmin, field, button);
		root.getChildren().addAll(join);
		Scene scene=new Scene(root,640,480);
		
		
		
		// Alignment
		join.setAlignment(Pos.CENTER);
		button.setAlignment(Pos.CENTER);
		field.setAlignment(Pos.CENTER);
		
		
		lblAdmin.setFont(Font.font ("Lato",FontWeight.BOLD, 30));
		lblAdmin.setTextFill(Color.web("#442C2E"));
		join.setStyle("-fx-background-color: transparent");
	 	scene.setFill(Color.web("#FEDBD0"));
	    
	 	// Bordering
	 	root.setAlignment(Pos.CENTER);
	    root.setStyle("-fx-Background-color: transparent;");
	 	join.setBorder(new Border(new BorderStroke(Color.web("#442C2E"),BorderStrokeStyle.SOLID,
                null,new BorderWidths(4)))); 
	 	// Button Style Sheet
	 	loginAdmin.setStyle("-fx-base: #5C4244; -fx-hover-base: #A99597;");
	    loginAdmin.setPrefHeight(10);
	    loginAdmin.setPrefWidth(100);
	    loginAdmin.setFont(Font.font ("Roboto",FontWeight.BOLD, 15));
	    
	    backToMain.setStyle("-fx-base: #5C4244; -fx-hover-base: #A99597;");
	    backToMain.setFont(Font.font ("Roboto",FontWeight.BOLD, 15));
	    backToMain.setPrefHeight(10);
	    backToMain.setPrefWidth(80);
	   
		
	    // Additional Style sheet
	    adminNameEntry.setStyle("-fx-text-inner-color: #A99597;");
	    adminPassEntry.setStyle("-fx-text-inner-color: #A99597;");
	    Stage stage=new Stage();
	    
	    
	    //Set on Action
	    backToMain.setOnAction(e->stage.close());
	    loginAdmin.setOnAction(e->{
	    	
	    	String name=adminNameEntry.getText();
			String psw=adminPassEntry.getText();
	    	if(name.equals("Hlaing") && psw.equals("123"))
			{
				AdminSection.adminChoice();
				stage.close();
				
			}
	    	
	    	else
	    	{
	    		alert.setFill(Color.RED);
	    		alert.setVisible(true);
	    	}
	    		
	    });
	    
	    
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setTitle("Admin Login");
		stage.setScene(scene);
		stage.showAndWait();
	}
	
	
}

