public class Artwork{

	private String title;
	private int year;
	private String artist;

	Artwork(String title, int year, String artist){

		this.title = title;
		this.year = year;
		this.artist = artist;

	}

	Artwork(String title, int year){
		
		this.title = title;
		this.year = year;
	}

	public String getTitle(){
		return title;
	}

	public int getYear(){
		return year;
	}

	public String getArtist(){
		return artist;
	}

	public void display(){

	System.out.println("Title: " +title);
	System.out.println("Year: " +year);
	System.out.println("Artist: " +artist);
	}

}