package org.hsd.inflab.se1c4;

import java.util.Arrays;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class LotteryGame extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		try {
			LotteryPane lottery = new LotteryPane();

			
			lottery.btn.setOnAction(e -> {

				int[] rndI = rndIArray();

				lottery.tF1.setText(String.valueOf(rndI[0]));
				lottery.tF2.setText(String.valueOf(rndI[1]));
				lottery.tF3.setText(String.valueOf(rndI[2]));
				lottery.tF4.setText(String.valueOf(rndI[3]));
				lottery.tF5.setText(String.valueOf(rndI[4]));
				lottery.tF6.setText(String.valueOf(rndI[5]));
			});	
			
			Scene scene = new Scene(lottery.root, 310, 100);
			primaryStage.setTitle("Lottery drawing");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public int[] rndIArray(){
	
		int size = 6;
		int[] rndI = new int[size];	
		
		for(int i = 0; i < size; i++){

			rndI[i] = (int) (Math.random() * 49) + 1; 

			for (int j = 0; j < i; j++){
				if(rndI[i] == rndI[j]) {

					i--;
					break;
				}
			}
		}

		Arrays.sort(rndI);

		return rndI;
	}

}