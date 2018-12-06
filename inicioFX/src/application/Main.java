package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private AnchorPane pane;

	// modifica el método start de la clase principal
	@Override
	public void start(Stage stage) throws IOException {

		// primero cargamos la vista fxml en el FXMLLoader
		FXMLLoader loader = new FXMLLoader(getClass().getResource(
				"../view/inicio.fxml"));

		// y opcionalmente un controlador para inicializar algún componente
		loader.setController(new botonFX());

		// ahora sobre el panel mypane cargamos la vista que dejamos en el
		// FXMLLoader
		pane = (AnchorPane) loader.load();
		
		// añade la escena al stage y la titula
		stage.setTitle("Titulo"); 
		stage.setScene(new Scene(pane));
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
