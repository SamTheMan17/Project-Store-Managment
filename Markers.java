public class Markers extends SchoolSupply {
 String size;

  public Markers() {
    super();
    this.size = "default";
  }

  public Markers(String name, double price, String size) {
    super(name, price);
    this.size = size;
  }

  public String getSize() {
    return size;
  }

public void setSize(String sizeUpdate) {
    size = sizeUpdate;
  }

  public String toString() {
    String text = "Product: Marker\n";
    text = text + super.getName() + " Price: $" + this.getPrice();
    text += ", Size: " + size;
    return text;
  }
  
}