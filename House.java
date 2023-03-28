/* This is a stub for the House class */
import java.util.ArrayList;
import java.util.Arrays;
/**
 * creates a house
 */
public class House extends Building{
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  /**
   * initializes a house
   * @param residents array list of residents
   * @param hasDiningRoom says if it has a dining room
   * @param name the name of the house
   * @param address the address of the house
   * @param nFloors the number of floors
   */
  public House(ArrayList<String> residents, boolean hasDiningRoom, String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.residents = residents;
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  public House(boolean hasDiningRoom, String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
  }
  /**
   * accessor for hasDiningRoom
   * @return bool for hasDiningRoom
   */
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }

  /**
   * accessor-like for number of residents
   * @return the number of residents
   */
  public int nResidents(){
    return residents.size();
  }

  /**
   * adds someone to residents list
   * @param name who is moving in
   */
  public void moveIn(String name){
    if(!this.residents.contains(name)){
      residents.add(name);}
    else{
      throw new RuntimeException("This resident has already moved in :0");}
  }

  /**
   * removes someone from residents list
   * @param name who is moving out
   * @return their name
   */
  public String moveOut(String name){
    if(this.residents.contains(name)){
    residents.remove(name);
    return name;}
    else{
      throw new RuntimeException("This resident does not live here :0");
    }
  }

  /**
   * checks to see if a person is a resident
   * @param person name of the person
   * @return bool of if a person is in residents array list
   */
  public boolean isResidents(String person){
    return residents.contains(person);
  }

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("Emma", "Ashby", "Rachel", "Ashley"));
    House Chase = new House(list, true, "Chase", "Elm Street", 3);
    System.out.println(Chase);
    System.out.println(Chase.hasDiningRoom());
    System.out.println(Chase.nResidents());
    Chase.moveIn("Chloe");
    System.out.println(Chase.nResidents());
    Chase.moveOut("Chloe");
    try{Chase.moveOut("Chloe");}
    catch(RuntimeException e){
      System.out.println(e.getMessage());}
    System.out.println(Chase.nResidents());
    System.out.println(Chase.isResidents("Ashby"));
    System.out.println(Chase.isResidents("Chloe"));
  }

}