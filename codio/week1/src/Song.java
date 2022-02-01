public class Song {
    private String artist;
    private String title;
    private String album;
    private int playCount;
    private final double payRate;
    private double moneyEarned;

    public Song(String artist, String title, String album, double payRate){
        this.artist = artist;
        this.title = title;
        this.album = album;
        this.payRate = payRate;
        playCount = 0;
        moneyEarned = 0;
    }

    public String getArtist(){
        return artist;
    }

    public String getTitle(){
        return title;
    }

    public String getAlbum(){
        return album;
    }

    public int getPlayCount(){
        return playCount;
    }

    public double getPayRate(){
        return payRate;
    }

    public double getMoneyEarned(){
        return moneyEarned;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public void setPlayCount(int playCount){
        this.playCount = playCount;
    }

    public void play(){
        playCount++;
        moneyEarned = playCount * payRate;
    }


    public static void main(String[] args) {
        Song mySong = new Song("led zeppelin", "ten years gone", "physical graffiti", 0.001);
        mySong.play();
        System.out.println(mySong.getMoneyEarned());
        for (int i = 0; i < 10000; i++) {
            mySong.play();
        }
        System.out.println(mySong.getMoneyEarned());

    }
}
