package Miniproject;



public class Music {
	
		private String songName;
		private String singer;
		private String mood;
		private String genre;
		int songnum= 0;
		public Music() {
			
		}
		
		public Music(String songName, String singer, String genre, String mood) {
			this.songName = songName;
			this.singer = singer;
			this.genre = genre;
			this.mood = mood;
		}
		
		public void setSongName(String songName) {
			this.songName = songName;	
		}
		public String getSongName() {
			return songName;
		}
		
		public void setSinger(String singer) {
			this.singer = singer;	
		}
		public String getSinger() {
			return singer;
		}
		
		public void setGenre(String genre) {
			this.genre = genre;	
		}
		public String getGenre() {
			return genre;
		}
		
		public void setMood(String mood) {
			this.mood = mood;	
		}
		public String getMood() {
			return mood;
		}
		
		public String toString() {
			return this.songName +"\t\t" + this.singer+"\t\t" + this.genre+ "\t\t" + this.mood;		
		}
		
		

}


