package com.raj;


class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No Plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "Plot of Jaws Movie: Sharks eat a lot of people!";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Plot of Independence Day Movie: Aliens attempt to take over!";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Plot of Maze Runner Movie: Kids try to escape a Maze!";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Plot of Star Wars Movie: Imperial Forces to try to take over Universe!";
    }
}

class ForgettableMovie extends Movie {
    public ForgettableMovie() {
        super("Forgettable");
    }

    @Override
    public String plot() {
        return super.plot();
    }
}

public class Main {

    public static void main(String[] args) {

        for(int i = 1; i < 11; i ++) {
            Movie movie = randomMovie();
            System.out.println(movie.getName() + " \n" + movie.plot());
        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();
        }
        return null;
    }
}
