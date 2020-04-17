package hust.soict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
//    private String title;
//    private String category;
//    private float cost;
     private List<String> authors= new ArrayList<String>();

    public Book(String title, String category, float cost, List<String> authors) {
        super(title, category, cost);
        this.authors = authors;
    }

    //
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public float getCost() {
//        return cost;
//    }
//
//    public void setCost(float cost) {
//        this.cost = cost;
//    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

//    public Book(String title, String category, float cost, List<String> authors) {
//        this.title = title;
//        this.category = category;
//        this.cost = cost;
//        this.authors = authors;
//    }
    public void addAuthor(String authorName){
        if(!(authors.contains(authorName))){
            authors.add(authorName);
        }
    }
    public void removeAuthor(String authorName){
        if((authors.contains(authorName))){
            authors.remove(authorName);
        }
    }
}
