package lab_3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * Цей клас є основним класом, що реалізує вікно JavaFX.
 *
 * <p>
 * 	У цьому класі створюються фігури, які модифікуються за допомогою декораторів,
 * 	та малюються на панелі.
 * </p>
 */
public class Runable extends Application{
	/**
	 * Точка входу до JavaFX вікна.
	 *
	 * @param stage Основна віконна стадія додатка.
	 */
	@Override
	public void start(Stage stage) {
		Pane pane = new Pane();

		Shape circle = new ConcreteShapeCircle();
		Shape coloredShapeCircle = new ColorDecorator(circle, Color.RED, "червоного");
		Shape borderedShapeCircle = new BorderDecorator(coloredShapeCircle, 2, "black");
		Shape shadowShapeCircle = new ShadowDecorator(borderedShapeCircle);

		shadowShapeCircle.draw(pane, 100, 100);
		System.out.println(shadowShapeCircle.getDescription());
		System.out.println("\n");


		Shape square = new ConcreteShapeSquare();
		Shape coloredShapeSquare = new ColorDecorator(square, Color.YELLOW, "жовтого");
		Shape borderedShapeSquare = new BorderDecorator(coloredShapeSquare, 5, "red");
		Shape shadowShapeSquare = new ShadowDecorator(borderedShapeSquare);

		shadowShapeSquare.draw(pane, 250, 250);
		System.out.println(shadowShapeSquare.getDescription());
		
		Scene scene = new Scene(pane, 500, 500);
		stage.setScene(scene);
		stage.setTitle("Лабораторна робота 3");
		stage.show();
	}
	
	/**
	 * Основний метод для запуску програми.
	 *
	 * @param args Аргументи командного рядка.
	 */
	public static void main(String[] args) {
		launch();
	}

}
