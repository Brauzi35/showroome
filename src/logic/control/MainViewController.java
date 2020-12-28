package logic.control;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class MainViewController {
	
	@FXML
    private AnchorPane scrollablePane;
	
	@FXML
    private AnchorPane profilePane;
	
	@FXML
    private AnchorPane contactPane;
	
	@FXML
    private AnchorPane homePane;
	
	@FXML
    private Button loginButton;
	
	@FXML
    private Button homeButton;
	
	@FXML
    private Button profileButton;

    @FXML
    private Button mapButton;

    @FXML
    private Button eventsButton;

    @FXML
    private Button contactButton;
    
    @FXML
    private Polygon eventSelector;

    @FXML
    private Polygon homeSelector;

    @FXML
    private Polygon mapSelector;

    @FXML
    private Polygon contactSelector;

    @FXML
    private Polygon profileSelector;

    @FXML
    void contactClick(ActionEvent event) {
    	//show selector arrow under contact button
    	homeSelector.setVisible(false);
    	eventSelector.setVisible(false);
    	profileSelector.setVisible(false);
    	contactSelector.setVisible(true);
    	mapSelector.setVisible(false);
    	//show the selected pane
    	homePane.setVisible(false);
    	contactPane.setVisible(true);
    	profilePane.setVisible(false);
    	//scrollablePane resize
    	scrollablePane.setPrefSize(1095, 750);
    	
    }
    
    @FXML
    void profileClick(ActionEvent event) {
    	//show selector arrow under profile button
    	homeSelector.setVisible(false);
    	eventSelector.setVisible(false);
    	profileSelector.setVisible(true);
    	contactSelector.setVisible(false);
    	mapSelector.setVisible(false);
    	//show the selected pane
    	homePane.setVisible(false);
    	contactPane.setVisible(false);
    	profilePane.setVisible(true);
    	//scrollablePane resize
    	scrollablePane.setPrefSize(1095, 750);
    }

    @FXML
    void eventsClick(ActionEvent event) {
    	//show selector arrow under events button
    	homeSelector.setVisible(false);
    	eventSelector.setVisible(true);
    	profileSelector.setVisible(false);
    	contactSelector.setVisible(false);
    	mapSelector.setVisible(false);
    	//show the selected pane
    }

    @FXML
    void homeClick(ActionEvent event) {
    	//show selector arrow under home button
    	homeSelector.setVisible(true);
    	eventSelector.setVisible(false);
    	profileSelector.setVisible(false);
    	contactSelector.setVisible(false);
    	mapSelector.setVisible(false);
    	//show the selected pane
    	homePane.setVisible(true);
    	contactPane.setVisible(false);
    	profilePane.setVisible(false);
    	//scrollablePane resize
    	scrollablePane.setPrefSize(1095, 1500);
    }

    @FXML
    void mapClick(ActionEvent event) {
    	//show selector arrow under map button
    	homeSelector.setVisible(false);
    	eventSelector.setVisible(false);
    	profileSelector.setVisible(false);
    	contactSelector.setVisible(false);
    	mapSelector.setVisible(true);
    	//show the selected pane
    }
    
    @FXML
    void loginClick(ActionEvent event) throws Exception {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/logic/boundary/LoginView.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
    }

    
    
    
    public void initialize() {
    	//when initialized the system shows the home section
    	homeSelector.setVisible(true);
    	eventSelector.setVisible(false);
    	profileSelector.setVisible(false);
    	contactSelector.setVisible(false);
    	mapSelector.setVisible(false);
    	//hide panes except for homePane
    	homePane.setVisible(true);
    	contactPane.setVisible(false);
    	profilePane.setVisible(false);
    	//scrollablePane resize
    	scrollablePane.setPrefSize(1095, 1500);
    }

}
