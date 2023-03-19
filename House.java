/* This is a stub for the House class */
import java.util.ArrayList;
import java.util.Arrays;

public class House {
  private ArrayList<String> residents = new ArrayList<>();
  private boolean hasDiningRoom;

  public House(ArrayList<String> residents, boolean hasDiningRoom) {
    this.residents = residents; //Is residents the right data type?
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }

  public int nResidents(){
    return residents.size();
  }

  public void moveIn(String name){
    residents.add(name);
  }

  public String moveOut(String name){
    residents.remove(name);
    return name;
  }

  public boolean isResidents(String person){
    return residents.contains(person);
  }

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("Emma", "Ashby", "Rachel", "Ashley"));
    House Chase = new House(list, true);
    System.out.println(Chase.hasDiningRoom());
    System.out.println(Chase.nResidents());
    Chase.moveIn("Chloe");
    System.out.println(Chase.nResidents());
    Chase.moveOut("Chloe");
    System.out.println(Chase.nResidents());
    System.out.println(Chase.isResidents("Ashby"));
    System.out.println(Chase.isResidents("Chloe"));
  }

}