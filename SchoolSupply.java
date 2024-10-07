public class SchoolSupply {
 private String name;
 private double price;
  
  public SchoolSupply() {
    this.name = "";
    this.price = 0.0;
  }
    public SchoolSupply(String newName, double newPrice) {
    this.name = newName;
    this.price = newPrice;
  }

 public String getName() {
   return name;
 }

 public double getPrice() {
   return price;
 }

 public void setName(String name) {
   this.name = name;
 }

 public void setPrice(double price) {
   this.price = price;
 }  

  public String toString() {
    String text = "Name: " + name + ", Price $" + price;
    return text;
  }
  
}