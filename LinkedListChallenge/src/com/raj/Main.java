package com.raj;

import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Song currentSong;


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


        ListIterator<Song> listIterator = playList.getList().listIterator();

        printInstructions();


        int option;
        boolean quit = false;



        while(!quit) {
            option = scanner.nextInt();
            scanner.nextLine();
            switch(option) {
                case 1:
                    printInstructions();
                    break;
                case 2:
                    skipForward(playList, listIterator);
                    break;
                case 3:
                    skipBackward(playList, listIterator);
                    break;
                case 4:
                    replayCurrent(playList, listIterator);
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
            Song theSong = iterator.next();
            System.out.println("Album: " + theSong.getAlbum().getName() +
                    " Song: " +theSong.getTitle());
        }

    }

    private static void replayCurrent(PlayList playList, ListIterator<Song> listIterator) {
        if(currentSong!=null)
            System.out.println("Re-Playing song - " + currentSong.getTitle() +
                    " from Album - " + currentSong.getAlbum().getName());
        else
            System.out.println("Not playing anything right now");
    }

    private static void skipBackward(PlayList playList, ListIterator<Song> listIterator) {
        if(listIterator.hasPrevious()) {
            Song previousSong = listIterator.previous();
            if(previousSong.equals(currentSong)) {
                if(listIterator.hasPrevious()) {
                    Song thePrevious = listIterator.previous();
                    System.out.println("Now playing... ");
                    System.out.println("Name : " + thePrevious.getTitle());
                    System.out.println("Album : " + thePrevious.getAlbum().getName());
                    currentSong = thePrevious;
                }
                else {
                    currentSong = null;
                    System.out.println("There is NO previous song!");
                }
            }
            else {
                System.out.println("Now playing... ");
                System.out.println("Name : " + previousSong.getTitle());
                System.out.println("Album : " + previousSong.getAlbum().getName());
                currentSong = previousSong;
            }
        }
        else {
            currentSong = null;
            System.out.println("There is No previous song!");

        }
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
    private static void skipForward(PlayList playList, ListIterator<Song> listIterator) {
        if(listIterator.hasNext()) {
            Song nextSong = listIterator.next();
            if(nextSong.equals(currentSong)) {
                if(listIterator.hasNext()) {
                    Song theVeryNext = listIterator.next();
                    System.out.println("Now playing... ");
                    System.out.println("Name : " + theVeryNext.getTitle());
                    System.out.println("Album : " + theVeryNext.getAlbum().getName());
                    currentSong = theVeryNext;
                }
                else{
                    currentSong = null;
                    System.out.println("There is NO next song!");
                }
            }
            else {
                System.out.println("Now playing... ");
                System.out.println("Name : " + nextSong.getTitle());
                System.out.println("Album : " + nextSong.getAlbum().getName());
                currentSong = nextSong;
            }
        }
        else {
            currentSong = null;
            System.out.println("There is NO next song!");
        }
    }

}
