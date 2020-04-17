package hust.soict.aims.media;

public class Disc extends Media{
    protected  int lenght;
    protected String director;

    public Disc(String title, String category, float cost, int lenght, String director) {
        super(title, category, cost);
        this.lenght = lenght;
        this.director = director;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
