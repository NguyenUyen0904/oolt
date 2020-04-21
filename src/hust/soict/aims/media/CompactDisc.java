package hust.soict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    public CompactDisc(String title, String category, float cost, int lenght, String director) {
        super(title, category, cost, lenght, director);
    }
    private String artist;
    private int lenght;
    private ArrayList<Track> tracks= new ArrayList<Track>();

    public CompactDisc(String title, String category, float cost, int lenght, String director, String artist, ArrayList<Track> tracks) {
        super(title, category, cost, lenght, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }
    public void addTrack(Track trackName){
        if(!(tracks.contains(trackName))){
            tracks.add(trackName);
        }
    }
    public void removeTrack(Track trackName){
        if((tracks.contains(trackName))){
            tracks.remove(trackName);
        }
    }

    @Override
    public int getLenght() {
        int total=0;
        Track trackItem;
        java.util.Iterator iter=tracks.iterator();
        while (iter.hasNext()) {
            trackItem = (Track) (iter.next());
            total += trackItem.getLenght();
        }
        return total ;
    }

    @Override
    public void play() {

    }
}
