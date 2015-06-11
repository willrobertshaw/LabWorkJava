
public class Favourites {
	private static int N = 5;
	private int count = 0;
	MusicTrack[] tracks = new MusicTrack[N];
	
	public void addTrack(String artist, String title){
		MusicTrack mt = new MusicTrack(artist, title);
		if(count < N){
			tracks[count] = mt;
			count++;
		}
		else{
			System.out.println("Sorry can't add: " + mt);
		}
	}
	public void showFavourites(){
		for(int i=0; i<N; i++){
			if(tracks[i] != null){
				System.out.println(tracks[i].toString());
			}
		}
	}
	public static void main(String[] args){
		Favourites fav = new Favourites();
		
		fav.addTrack("Fun", "Some Nights");
		fav.addTrack("Oliver Tank", "Help You Breathe");
		fav.addTrack("Horse Feathers", "Fit Against the Country");
		fav.addTrack("Emile Sande", "Country House");
		fav.addTrack("Fun", "Walking the Dog");
		fav.addTrack("Porcelain Raft", "Put Me To Sleep");
		fav.showFavourites();
	}
}
