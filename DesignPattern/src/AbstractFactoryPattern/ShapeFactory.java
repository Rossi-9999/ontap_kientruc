package AbstractFactoryPattern;

//ShapeFactory.java
public class ShapeFactory {
  //the method will be used to get object of required shape
  public Shape getShapeInstance(String type){
      if(type == null){
          return null;
      } 
      if(type.equalsIgnoreCase("TRIANGLE")){
          return new Triangle();
      } else if(type.equalsIgnoreCase("SQUARE")){
          return new Square();
      } else if(type.equalsIgnoreCase("RECTANGLE")){
          return new Rectangle();
      }
      return null;
  }
}