/* This is a stub for the Library class */
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Library {
  private Hashtable<String, Boolean> collection; //changed bool to Bool

    public Library() {
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title){
      collection.put(title, true);
    }
  
    public String removeTitle(String title){
      collection.remove(title);
      return title;
    }

    public void checkOut(String title){
      collection.replace(title, false);
    }

    public void returnBook(String title){
      collection.replace(title, true);
    }

    public boolean containsTitle(String title){
      return collection.containsKey(title);
    }

    public boolean isAvailable(String title){
      return collection.get(title);
    }

    public void printCollection(){ //I know theres prob an easier way to do this
      String bigString = collection.toString();
      bigString = bigString.replace("{", "").replace("}", "");
      ArrayList<String> listString = new ArrayList<>(Arrays.asList(bigString.split(", ")));
      for(int i=0; i<listString.size(); i++){
        System.out.println("Title: " + listString.get(i).replace("=", "      Available: "));
      };
       
    }

    public static void main(String[] args) {
      Library nielson = new Library();
      nielson.addTitle("Of Mice and Men");
      nielson.addTitle("Parable of the Sower");
      nielson.printCollection();
    }
  
  }
