package hrproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

public class AdminSection {
	
	public static void adminChoice() {
	//Admin Section
		Text adminSec=new Text("ADMIN SECTION");
		Button addAccountant=new Button("Add Accountant");
		Button viewAccountant=new Button("View Accountant");
		Button adminLogout=new Button("Logout");
	
		FlowPane root=new FlowPane();
		VBox btn=new VBox();
		btn.getChildren().addAll(adminSec, addAccountant, viewAccountant, adminLogout);
		
		btn.setAlignment(Pos.CENTER);
		btn.setSpacing(19);
		
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(btn);
		
		Scene sc=new Scene(root, 640, 480);
		Stage stage=new Stage();
		stage.setScene(sc);
		stage.setTitle("Admin Section");
		stage.show();
		
		// Style
		addAccountant.setPrefSize(130, 15);
		viewAccountant.setPrefSize(130, 15);
		adminLogout.setPrefSize(130, 15);
		
		adminSec.setFont(Font.font ("Lato",FontWeight.BOLD, 25));
		
		addAccountant.setStyle("-fx-base: #5C4244; -fx-hover-base: #A99597;");
		addAccountant.setFont(Font.font ("Roboto",FontWeight.BOLD, 14));
		viewAccountant.setStyle("-fx-base: #5C4244; -fx-hover-base: #A99597;");
		viewAccountant.setFont(Font.font ("Roboto",FontWeight.BOLD, 14));
		adminLogout.setStyle("-fx-base: #5C4244; -fx-hover-base: #A99597;");
		adminLogout.setFont(Font.font ("Roboto",FontWeight.BOLD, 14));
		
		btn.setPrefSize(250, 250);
		sc.setFill(Color.web("#FEDBD0"));
	    root.setStyle("-fx-Background-color: transparent;");
	 	btn.setBorder(new Border(new BorderStroke(Color.web("#442C2E"),BorderStrokeStyle.SOLID,
                null,new BorderWidths(4)))); 
		
	 	//Action
	 	
	 	addAccountant.setOnAction(e-> {
	 		try {
				AddAccountant.showForm();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	 		stage.close();
	 	});
	 	
	 	viewAccountant.setOnAction(e->{
	 		ViewAccountant.accounts();
	 	});
	 	
	 	adminLogout.setOnAction(e->{
	 		stage.close();
	 	});
	 	
	}
}
