package com.raj;

import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        PlayList playList;


        Album mudhalvan = new Album("Mudhalvan Movie");

        Song song1 = new Song("Uppu Karuvadu", mudhalvan,181);
        Song song2 = new Song("Kurukku Chiruthavale", mudhalvan,182);
        Song song3 = new Song("Mudhalvanae",mudhalvan, 183);
        Song song4 = new Song("Ulundhu Vithakkaiyilae", mudhalvan,184);
        Song song5 = new Song("Shakalaka Baby", mudhalvan,185);
        Song song6 = new Song("Azhagana Ratchashiyae",mudhalvan, 186);


        playList = new PlayList("MyFavs");

        playList.addSong(song1);
        playList.addSong(song2);
        playList.addSong(song3);
        playList.addSong(song4);
        playList.addSong(song5);
        playList.addSong(song6);

        printInstructions();


        int option;
        boolean quit = false;



        while(!false) {
            option = scanner.nextInt();
            scanner.nextLine();
            switch(option) {
                case 1:
                    printInstructions();
                    break;
                case 2:
                    skipForward(playList);
                    break;
                case 3:
                    skipBackward(playList);
                    break;
                case 4:
                    replayCurrent(playList);
                    break;
                case 5:
                    listAllSongs(playList);
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    private static void listAllSongs(PlayList playList) {
        System.out.println("List of all the songs in the playlist " );
        ListIterator<Song> iterator = playList.getList().listIterator();
        while(iterator.hasNext()) {
            System.out.println("Album: " + iterator.next().getAlbum() + " Song: " +iterator.next().getTitle());
        }

    }
    private static void replayCurrent(PlayList playList) {
        System.out.println("Playing song - " + playList.nextSong().getTitle() +
                " from Album - " + playList.replayCurrentSong().getAlbum().getName());
    }
    private static void skipBackward(PlayList playList) {
        System.out.println("Playing song - " + playList.nextSong().getTitle() +
                " from Album - " + playList.nextSong().getAlbum().getName());
    }
    private static void printInstructions() {
        System.out.println("Choose your option:");
        System.out.println("Press 1 to - Instructions");
        System.out.println("Press 2 to - Play next song in the playlist");
        System.out.println("Press 3 to - Play previous song in the playlist");
        System.out.println("Press 4 to - Replay the current song in the playlist");
        System.out.println("Press 5 to - List all the songs in playlist");
        System.out.println("Press 6 to - Quit the application");
    }
    private static void skipForward(PlayList playList) {

        Song nextSong = playList.nextSong();
        System.out.println("Playing song - " + nextSong.toString());
        System.out.println(" from Album - " + playList.nextSong().getAlbum().getName());
    }


}
