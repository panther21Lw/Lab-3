package lab_3;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

/**
 * Цей клас реалізує інтерфейс {@link Shape}
 * та представляє конкретну реалізацію фігури у вигляді квадрата.
 *
 * <p>
 * 	Цей клас відповідає за малювання квадрата у вказаній панелі.
 * </p>
 */
public class ConcreteShapeSquare implements Shape{
	
	/**
	 * Малює квадрат на вказаній панелі.
	 *
	 * <p>
	 *	Квадрат має довжину сторони 100 пікселів та 
	 * 	розташовується у точці з координатами (x, y).
	 * </p>
	 * 
	 * @param pane Панель, на якій буде намалбований квадрат.	 
	 * @param x Координата X лівого верхнього кута квадрата.
	 * @param y Координата Y лівого верхнього кута квадрата.
	 */
	@Override
	public void draw(Pane pane, double x, double y) {
		Rectangle square = new Rectangle(x, y, 100, 100);
		pane.getChildren().add(square);
	}
	
	/**
	 * Повертає опис фігури.
	 *
	 * @return Опис фігури, що представляє квадрат.
	 */
	@Override
	public String getDescription() {
		return "Квадрат ";
	}

}
