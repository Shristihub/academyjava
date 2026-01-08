package com.util.meth;


class ShapeFactoryImpl implements IShapeFactory{

	@Override
	public Shape getShape() {
		System.out.println("creating shape object and returning...");
		return new Shape();
	}
	
}

public class MethConstDemo {

	public static void main(String[] args) {
		IShapeFactory factory = new ShapeFactoryImpl();
		Shape shape = factory.getShape();
    	shape.area(10,20);
    	
    	// use lambda expressions - implementation
    	factory = ()->new Shape();
    	Shape shape1 = factory.getShape();
    	shape1.area(2, 2);
    	
    	
    	// use method reference - referring to a constructor
    	IShapeFactory factory1 = Shape::new;  // new shape()
    	shape1 = factory1.getShape();
    	shape1.area(21, 21);
    	
    	IGreeter greeter = username->username.toUpperCase();
    	System.out.println(greeter.printName("priya"));
    	
    	
    	
	}
}







