package com.raj;

public class Main {

    public static void main(String[] args) {
        Song song1 = new Song("Uppu Karuvadu", 181);
        Song song2 = new Song("Kurukku Chiruthavale", 182);
        Song song3 = new Song("Mudhalvanae", 183);
        Song song4 = new Song("Ulundhu Vithakkaiyilae", 184);
        Song song5 = new Song("Shakalaka Baby", 185);
        Song song6 = new Song("Azhagana Ratchashiyae", 186);

        Album mudhalvan = new Album("Mudhalvan Movie");

        mudhalvan.addSong(song1);
        mudhalvan.addSong(song2);
        mudhalvan.addSong(song3);
        mudhalvan.addSong(song4);
        mudhalvan.addSong(song5);
        mudhalvan.addSong(song6);

        PlayList playList = new PlayList("MyFavs");

        playList.addSong(song1, mudhalvan);
        playList.addSong(song2, mudhalvan);
        playList.addSong(song3, mudhalvan);
        playList.addSong(song4, mudhalvan);
        playList.addSong(song5, mudhalvan);
        playList.addSong(song6, mudhalvan);



    }
}
