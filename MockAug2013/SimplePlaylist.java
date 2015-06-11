import java.util.ArrayList;


public class SimplePlaylist extends Video {
	private ArrayList<Video> videos;
	
	public SimplePlaylist(String title, int length, int ageRating){
		super(title, length, ageRating);
		videos = new ArrayList<Video>();
	}
	
	public ArrayList<Video> getVideos(){
		return videos;
	}
	
	public void setVideos(ArrayList<Video> videos){
		this.videos = videos;
	}
	
	@Override
	public String toString(){
		String result = super.toString() + "\nShowing:\n";
		for(Video v : videos){
			result += v.toString() + "\n";
		}
		return result;
	}
}
