package student_code.hash_table;

import java.util.ArrayList;
import java.util.LinkedList;

public class CustomHashTable {
    private static int countOfBucket = 16;
    private ArrayList <LinkedList<Movie>> table = new ArrayList<>();

    public CustomHashTable() {

    }



    public boolean add (Movie movie){
        if (contains(movie)){return false;}

        int indexOfBucket = movie.hashCode()%countOfBucket;
        LinkedList<Movie> listFromBucket = table.get(indexOfBucket);
        if (listFromBucket == null){
            listFromBucket = new LinkedList<Movie>();
        }
        listFromBucket.add(movie);

        return true;
    }

   /* public ArrayList<Movie> toArray(){
        ArrayList<Movie> movie = new ArrayList<>();
        LinkedList<Movie> movies
    }*/








   public boolean contains (Movie movie) {

    int movieHash = movie.hashCode();
    int indexOfBucket = movieHash % countOfBucket;
    LinkedList<Movie> listFromBucket = table.get(indexOfBucket);
       if (listFromBucket == null || listFromBucket.isEmpty()) {
           return false;
       }

       for (int i = 0; i < listFromBucket.size(); i++) {
           if (listFromBucket.get(i).hashCode() == movieHash) {
              if(movie.equals(listFromBucket.get(i))){
                   return true;
               }
           }
       }


    return false;

   }






}
