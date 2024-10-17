package lab_3;

import javafx.scene.layout.Pane;

/**
 * Це абстрактний клас, який також реалізує інтерфейс компонента {@link Shape}.
 * ShapeDecorator має посилання на об'єкт типу {@link Shape} і
 * може додавати або змінювати функціональність об'єкта, який він декорує.
 */
public abstract class ShapeDecorator implements Shape{
	/**
	 * Це поле містить посилання на об'єкт типу {@link Shape}.
	 */
	protected Shape decoratedShape;
	
	/**
	 * Конструктор для створення ShapeDecorator.
	 *
	 * @param decoratedShape Фігура, яку потрібно декорувати.
	 */
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	
	/**
	 * Малює декоровану фігуру на вказаній панелі.
	 *
	 * <p>
	 *	Цей метод викликає метод малювання базової фігури.
	 * </p>
	 *
	 * @param pane Панель, на якій буде нарисована фігура.
	 * @param x Координата X для розташування фігури.
	 * @param y Координата Y для розташування фігури.
	 *
	 */
	@Override
	public void draw(Pane pane, double x, double y) {
		decoratedShape.draw(pane, x, y);
	}
	
	/**
	 * Повертає опис декорованої фігури.
	 *
	 * @return Опис декорованої фігури.
	 */
	@Override
	public String getDescription(){
		return decoratedShape.getDescription();
	}
}
