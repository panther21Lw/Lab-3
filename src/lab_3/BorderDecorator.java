package lab_3;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

/**
 * Клас-декоратор BorderDecorator, який реалізує декоратор {@link ShapeDecorator}
 * і додає рамку на зображенні та в описі об'єкта компонента {@link Shape}.
 * <p>
 * Даний клас успадковується від {@link ShapeDecorator} та 
 * використовує параметри ширини та кольору рамки.
 * </p>
*/
public class BorderDecorator extends ShapeDecorator{
	/**
	 * Це поле представляє ширину рамки
	 */
	private double width;
	/**
	 * Це поле представляє колір рамки
	 */
	private String borderColor;
	
	/**
	 * Конструктор для створення BorderDecorator.
	 * 
	 * @param decoratedShape Фігура, яку потрібно буде декорувати.
	 * @param width Ширина рамки в пікселях. 
	 * @param borderColor Колір рамки, який буде приведено до нижнього регістру.
	 */
	public BorderDecorator(Shape decoratedShape, double width, String borderColor) {
		super(decoratedShape);
		this.width = width;
		this.borderColor = borderColor.toLowerCase();
	}
	
	/**
	 * Малює фігуру на переданій панелі, до якої додано рамку вказаного кольору та ширини.
	 *
	 * @param pane Панель, на якій буде зображена модифікована фігура.
	 * @param x Координата X для розташування фігури.
	 * @param y Координата Y для розташування фігури.
	 */
	@Override
	public void draw(Pane pane, double x, double y) {
		super.draw(pane, x, y);
		Node node1 =  pane.getChildren().get(pane.getChildren().size() -1);

		String oldStyles = node1.getStyle();
		node1.setStyle(oldStyles + "-fx-stroke-width: " + width + "; -fx-stroke: " + borderColor +";");
	}
	
	
	/**
	 * Повертає опис декорованої фігури з інформацією про рамку.
	 *
	 * @return Опис початкової фігури з доданою завдяки конкатенації інформацією про рамку.
	 */
	@Override
	public String getDescription() {
		return decoratedShape.getDescription() + "з рамкою товщиною " + width + " пікселі(в) ";
	}

}
