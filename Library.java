/* This is a stub for the Library class */
import java.util.Hashtable;
/**
 * creates a library that extends the building class
 */
public class Library extends Building{
  private Hashtable<String, Boolean> collection;
    /**
     * constructor for library
     * @param name name of library
     * @param address address of library
     * @param nFloors number of floors
     */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    /**
     * adds a book to the library
     * @param title title of the book
     */
    public void addTitle(String title){
      if(!this.containsTitle(title)){
      collection.put(title, true);}
      else{
        throw new RuntimeException("This book is already present");
      }
    }
  
    /**
     * removes a book from the library
     * @param title title of book
     * @return title of book
     */
    public String removeTitle(String title){
      if(this.containsTitle(title)){
        collection.remove(title);
        return title;}
      else{
        throw new RuntimeException("This book is not in the library :0");
      }
    }

    /**
     * checks out a book from the library
     * @param title name of book
     */
    public void checkOut(String title){
      if(this.containsTitle(title) && this.isAvailable(title)){
      collection.replace(title, false);}
      else{
        throw new RuntimeException("This book is not in the library or is not available :0");
      }
    }

    /**
     * returns a book to the library
     * @param title title of the book
     */
    public void returnBook(String title){
      if(this.containsTitle(title) && !this.isAvailable(title)){
      collection.replace(title, true);}
      else{
        throw new RuntimeException("This book has already been returned :0");
      }
    }

    /**
     * checks to see if the book exists in the library
     * @param title title of the book
     * @return bool of if it exists
     */
    public boolean containsTitle(String title){
      return collection.containsKey(title);
    }

    /**
     * checks to see if the book has been checked out
     * @param title title of book
     * @return bool for if it is available
     */
    public boolean isAvailable(String title){
      return collection.get(title);
    }

    /**
     * prints each book and their availability status
     */
    public void printCollection(){
      if(!this.collection.isEmpty()){
      collection.forEach((title, avail)->System.out.println("Available: " + avail + "     Title: " + title));
      }
      else{
        throw new RuntimeException("This library is book-less :0");
      }}

      //String bigString = collection.toString();
      //bigString = bigString.replace("{", "").replace("}", "");
      //ArrayList<String> listString = new ArrayList<>(Arrays.asList(bigString.split(", ")));
      //for(int i=0; i<listString.size(); i++){
      //  System.out.println("Title: " + listString.get(i).replace("=", "      Available: "));

    public static void main(String[] args) {
      Library nielson = new Library("Nielson", "Smith", 4);
      nielson.addTitle("Of Mice and Men");
      nielson.addTitle("Parable of the Sower");
      nielson.checkOut("Of Mice and Men");
      try{nielson.checkOut("Of Mice and Men");}
      catch(Exception e){System.out.println(e.getMessage());}
      try{nielson.checkOut("Parable of the talents");}
      catch(Exception e){System.out.println(e.getMessage());}
      nielson.removeTitle("Of Mice and Men");
      nielson.removeTitle("Parable of the Sower");
      try{nielson.printCollection();}catch(Exception e){System.out.println(e.getMessage());
        }
    }
  
  }
