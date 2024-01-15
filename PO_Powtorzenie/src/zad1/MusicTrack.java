package zad1;

public record MusicTrack(String title, String artist, int czas ) {
    public MusicTrack(String title, String artist) {
        this(title, artist, 180);
    }
    public MusicTrack{
        if(czas < 0){
            czas = 60;
        }
    }
}
