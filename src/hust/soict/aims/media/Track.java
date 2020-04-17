package hust.soict.aims.media;

public class Track {
    private String title;
    private int lenght;

    public Track(String title, int lenght) {
        this.title = title;
        this.lenght = lenght;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
