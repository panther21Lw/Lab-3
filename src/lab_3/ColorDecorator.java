package lab_3;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 * Клас-декоратор ColorDecorator реалізує декоратор {@link ShapeDecorator}
 * і додає колір для декорованої фігури та назву кольору в її опис.
 * 
 *<p>
 *	Цей клас успадковується від декоратора {@link ShapeDecorator}
 *	та використовує параметри кольору та назви кольору.
 *</p>
 */
public class ColorDecorator extends ShapeDecorator{
	/**
	 * Це поле представляє колір об'єкта.
	 */
	private Color color;
	
	/**
	 * Це поле представляє назву кольору.
	 */
	private String colorName;
	
	/**
	 * Конструктор для створення ColorDecorator.
	 *
	 * @param decoratedShape Фігура, яку потрібно буде декорувати.
	 * @param color Колір, у який буде пофарбовано фігуру.
	 * @param colorName Назва кольору, яка буде приведена до нижнього регістру.
	 */
	public ColorDecorator(Shape decoratedShape, Color color, String colorName) {
		super(decoratedShape);
		this.color = color;
		this.colorName = colorName.toLowerCase();
	}
	
	/**
	 * Малює фігуру із вказаним кольором на заданій панелі.
	 *
	 * @param pane Панель, на якій буде намальована фігура.
	 * @param x Координата X для розташування фігури.
	 * @param y Координата Y для розташування фігури.
	 */
	@Override
	public void draw(Pane pane, double x, double y) {
		super.draw(pane, x, y);

		Node node = pane.getChildren().get(pane.getChildren().size() - 1);
		String oldStyles = node.getStyle();
		node.setStyle(oldStyles + "-fx-fill: " + toHexString(color) + ";");
	}
	
	
	/**
	 * Повертає опис декорованої фігури, до якого додано інформацію про колір.
	 *
	 * @return Опис фігури з доданою інформацією про колір.
	 */
	@Override
	public String getDescription(){
		return decoratedShape.getDescription() + colorName + " кольору ";
	}

	/**
	 * Перетворює колір у шістнадцятковий формат.
	 *
	 * @param color Колір, який потрібно перевести у шістнадцятковий формат.
	 * @return Шістнадцятковий рядок, що представляє колір.
	 */
	private String toHexString(Color color) {
		return String.format("#%02X%02X%02X",
				(int) (color.getRed()*255),
				(int) (color.getGreen()*255),
				(int) (color.getBlue()*255));
	}
}
