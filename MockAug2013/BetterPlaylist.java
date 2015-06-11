import java.util.ArrayList;


public class BetterPlaylist extends Video {
	private ArrayList<Video> videos;
	
	public BetterPlaylist(String title){
		super(title, 0, 18);
		videos = new ArrayList<Video>();
	}
	
	public ArrayList<Video> getVideos(){
		return videos;
	}
	
	public void setVideos(ArrayList<Video> videos){
		this.videos = videos;
	}
	
	public String toString(){
		String result = super.toString() + "\nShowing:\n";
		for(Video v : videos){
			result += v.toString() + "\n";
		}
		return result;
	}
	
	@Override
	public int getLength(){
		int sumVids = 0;
		for(Video v : videos){
			sumVids += v.getLength();
		}
		return sumVids;
	}
	
	@Override
	public int getAgeRating(){
		int maxAge = 12;
		for(Video v : videos){
			if(v.getAgeRating()>maxAge){
				maxAge = v.getAgeRating();
			}
		}
		return maxAge;
	}
}
