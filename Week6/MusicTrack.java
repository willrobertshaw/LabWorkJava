

public class MusicTrack {
	private String artist;
	private String title;
	
	public MusicTrack(String artist, String title){
		this.artist = artist;
		this.title = title;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String toString(){
		return title + " | " + artist;
	}
	
	public static void main(String[] args){
		MusicTrack mt = new MusicTrack("Euan", "Love it up the bum");
		
		System.out.println("The Music Track is: " + mt.toString());
		
		
	}
}
