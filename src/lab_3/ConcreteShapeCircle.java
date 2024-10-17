package lab_3;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

/**
 * Це конкретний клас, який реалізує інтерфейс {@link Shape} компонента
 * у вигляді кола і представляє основну функціональність.
 * 
 * <p>
 *	Цей клас відповідає за малювання кола у вказаній панелі.
 * </p>
 */

public class ConcreteShapeCircle implements Shape{
	
	/**
	 * Малює коло у вказаній панелі.
	 *
	 * <p>
	 * Створюється коло радіусом 50 пікселів та розташовується у
	 * точці з координатами (x, y).
	 * </p>
	 *
	 * @param pane Панель для малювання кола.
	 * @param x Координата X для центра кола.
	 * @param y Координата Y для центра кола.
	 */
    @Override
    public void draw(Pane pane, double x, double y) {
        Circle circle = new Circle(x, y, 50);
        pane.getChildren().add(circle);
    }
	/**
	 * Повертає опис фігури.
	 *
	 * @return Опис фігури, яка представляє коло.
	 */
    @Override
    public String getDescription() {
        return "Коло ";
    }
}
