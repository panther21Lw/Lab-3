package lab_3;

import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


/**
 * Цей клас реалізує декоратор для фігур, 
 * який додає ефект тіні до декорованої фігури.
 *
 * <p>
 *	Цей клас успадковується від {@link ShapeDecorator}
 *	та додає ефект тіні при малюванні фігури.
 * </p>
 */
public class ShadowDecorator extends ShapeDecorator{
	/**
	 * Конструктор для створення ShadowDecorator.
	 *
	 * @param decoratedShape Фігура, для якої потрібно додати тінь.
	 */
	public ShadowDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	
	/**
	 * Малює фігуру з ефектом тіні на вказаній панелі.
	 *
	 * @param pane Панель, на якій буде намальована фігура.
	 * @param x Координата X для розташування фігури.
	 * @param y Координата Y для розташування фігури.
	 */
	@Override
	public void draw(Pane pane, double x, double y) {
		super.draw(pane, x, y);

		 DropShadow dropShadow = new DropShadow();
		 dropShadow.setRadius(5.0);
		 dropShadow.setOffsetX(3.0);
		 dropShadow.setOffsetY(3.0);
		 dropShadow.setColor(Color.GRAY);

		 pane.getChildren().get(pane.getChildren().size()-1).setEffect(dropShadow);
	}
	
	/**
	 * Повертає опис декорованої фігури з інформацією про тінь.
	 *
	 * @return Опис фігури з доданою інформацією про ефект тіні.
	 */
	@Override
	public String getDescription() {
		return decoratedShape.getDescription() + "з тінню ";
	}

}
