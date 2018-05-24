package factory;

import factory.color.Color;
import factory.shape.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape) ;
}
