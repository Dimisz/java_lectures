import java.util.*;

public class Main {
    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Let's go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        List<Song> playList = new ArrayList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);
        albums.get(0).addToPlayList(9, playList);

        albums.get(1).addToPlayList(8, playList);
        albums.get(0).addToPlayList(3, playList);
        albums.get(0).addToPlayList(2, playList);
        albums.get(0).addToPlayList(24, playList);

        play(playList);


    }

    private static void play(List<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }
        else{
            System.out.println("Now playing: " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }
                    else{
                        System.out.println("We've reached the end of the playlist");
                        forward = false;
                        printMenu();
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }
                    else{
                        System.out.println("We've reached the beginning of the playlist");
                        forward = true;
                        printMenu();
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        }
                        else{
                            System.out.println("We are at the start of the list");
                        }
                    }
                    else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }
                        else{
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }
                        else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:");
        System.out.println("0\t-\tto quit");
        System.out.println("1\t-\tto play next song");
        System.out.println("2\t-\tto play previous song");
        System.out.println("3\t-\tto replay the current song");
        System.out.println("4\t-\tlist songs in the playlist");
        System.out.println("5\t-\tprint available actions");
        System.out.println("6\t-\tdelete current song from playlist");
    }

    private static void printList(List<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==========================");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("===========================");
    }
}
