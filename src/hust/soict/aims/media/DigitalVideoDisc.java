package hust.soict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	public DigitalVideoDisc(String title, String category, float cost, int lenght, String director) {
		super(title, category, cost, lenght, director);
	}

	@Override
	public void play() {
		System.out.println("Playing DVD:"+getTitle());
		System.out.println("DVD lenght:"+getLenght());
	}
}