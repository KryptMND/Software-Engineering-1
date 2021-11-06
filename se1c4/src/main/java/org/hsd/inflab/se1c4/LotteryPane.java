package org.hsd.inflab.se1c4;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LotteryPane {
	AnchorPane root = new AnchorPane();
    
    Button btn = new Button("Draw");

    TextField tF1 = new TextField();
    TextField tF2 = new TextField();
    TextField tF3 = new TextField();
    TextField tF4 = new TextField();
    TextField tF5 = new TextField();
    TextField tF6 = new TextField();
    
    public LotteryPane() {
    	
        btn.setLayoutX(140);
        btn.setLayoutY(65);

        tF1.setMaxWidth(40);
        tF1.setPrefWidth(40);
        tF1.setLayoutX(10);
        tF1.setLayoutY(25);

        tF2.setMaxWidth(40);
        tF2.setPrefWidth(40);
        tF2.setLayoutX(60);
        tF2.setLayoutY(25);

        tF3.setMaxWidth(40);
        tF3.setPrefWidth(40);
        tF3.setLayoutX(110);
        tF3.setLayoutY(25);

        tF4.setMaxWidth(40);
        tF4.setPrefWidth(40);
        tF4.setLayoutX(160);
        tF4.setLayoutY(25);

        tF5.setMaxWidth(40);
        tF5.setPrefWidth(40);
        tF5.setLayoutX(210);
        tF5.setLayoutY(25);

        tF6.setMaxWidth(40);
        tF6.setPrefWidth(40);
        tF6.setLayoutX(260);
        tF6.setLayoutY(25);
        
        
        root.getChildren().addAll(btn,tF1,tF2,tF3,tF4,tF5,tF6);
        
    }
}
