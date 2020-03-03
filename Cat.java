import java.util.Random;
public class Cat {
  //
  String navn;
  String breed;
  int id;
  int year;
  String ownerName;
  
  // 
  public Cat(String name, String breed, String ownerName) {
    
    this.navn = name;
    this.breed = breed;
    this.ownerName = ownerName;
  }
  
  public void setYear(int year) {
    this.year = year;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getCatName() {
    return this.navn;
  }
  
  public String getOwner() {
    return this.ownerName;
    
  }
    
  
    public static void main(String[] args) {
      int counter = 0;
      Random myRandom = new Random();
      Cat cat1 = new Cat("Misser","Perser","Kurt Verner");
      Cat cat2 = new Cat("Pusser","Perser","Kurt Verner");
      Cat cat3 = new Cat("Sofus","Perser","Kurt Verner");
      
      int[] myInts = new int[] {2,5,4,3,2};
      Cat[] myCats = new Cat[] {cat1,cat2,cat3};
      
      
      

    }
}
