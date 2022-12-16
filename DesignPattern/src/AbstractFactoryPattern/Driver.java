package AbstractFactoryPattern;

//Driver.java
public class Driver {
  public static void main(String[] args) {
      ShapeFactory shapeFactory = new ShapeFactory();
      //get Triangle object and call draw()
      Shape triangle = shapeFactory.getShapeInstance("Triangle");
      triangle.draw();
      //get Rectangle object and call draw()
      Shape rectangle = shapeFactory.getShapeInstance("RECTANGLE");
      rectangle.draw();
      //get Square object and call draw()
      Shape square = shapeFactory.getShapeInstance("SQUARE");
      square.draw();
  }
}
