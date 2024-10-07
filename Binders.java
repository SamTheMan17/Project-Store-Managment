public class Binders extends SchoolSupply {
 String color;

  public Binders() {
    super();
    this.color = "default";
  }

  public Binders(String name, double price, String color) {
    super(name, price);
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String colorUpdate) {
    color = colorUpdate;
  }

  public String toString() {
    String text = "Product: Binder\n";
    text = text + super.toString();
    text += ", Color: " + color;
    return text;
  }
  
}
