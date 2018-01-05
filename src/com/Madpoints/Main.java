package com.Madpoints;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here.";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people.";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attack Earth.";
    }
}

class Akira extends Movie {
    public Akira() {
        super("Akira");
    }

    @Override
    public String plot() {
        return "A teenager gets deadly powers in Neo-Tokyo.";
    }
}

class AlmostHeroes extends Movie {
    public AlmostHeroes() {
        super("Almost Heroes");
    }

    @Override
    public String plot() {
        return "An unlikely duo race Louis and Clark to the west coast.";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    //Not plot method
}

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie " + i +
                    ": " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new Akira();
            case 4:
                return new AlmostHeroes();
            case 5:
                return new Forgetable();
        }

        return null;
    }
}
