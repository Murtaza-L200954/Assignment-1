 
 // explaination: This is a diamond problem because all the classes directly/indirectly inherit from the same class, i.e; the cricketer class
 
 
 interface Player {
    void print();
    int getRanking();
}

class Cricketer implements Player {
    String name;
    int age;
    String nationality;

    Cricketer(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
    }

    public int getRanking() {
        return 0; // Default ranking for a generic cricketer
    }
}

class Batsman extends Cricketer {
    int score;
    int batsmanRanking;

    Batsman(String name, int age, String nationality, int score, int batsmanRanking) {
        super(name, age, nationality);
        this.score = score;
        this.batsmanRanking = batsmanRanking;
    }

    public void print() {
        super.print();
        System.out.println("Score: " + score);
        System.out.println("Batsman Ranking: " + batsmanRanking);
    }

    public int getRanking() {
        return batsmanRanking;
    }
}

class Bowler extends Cricketer {
    int wickets;
    int bowlerRanking;

    Bowler(String name, int age, String nationality, int wickets, int bowlerRanking) {
        super(name, age, nationality);
        this.wickets = wickets;
        this.bowlerRanking = bowlerRanking;
    }

    public void print() {
        super.print();
        System.out.println("Wickets: " + wickets);
        System.out.println("Bowler Ranking: " + bowlerRanking);
    }

    public int getRanking() {
        return bowlerRanking;
    }
}

class AllRounder extends Cricketer {
    int ranking;

    AllRounder(String name, int age, String nationality, int ranking) {
        super(name, age, nationality);
        this.ranking = ranking;
    }

    public void print() {
        super.print();
        System.out.println("All-Rounder Ranking: " + ranking);
    }

    public int getRanking() {
        return ranking;
    }
}


public class CricketTest {
    public static void main(String[] args) {
        // Create instances of different cricket players
        Cricketer cricketer = new Cricketer("John", 25, "USA");
        Batsman batsman = new Batsman("Alice", 28, "England", 1000, 5);
        Bowler bowler = new Bowler("Bob", 30, "Australia", 200, 8);
        AllRounder allRounder = new AllRounder("David", 26, "India", 3);

        // Test the print and getRanking methods
        System.out.println("Cricketer Information:");
        cricketer.print();
        System.out.println("Cricketer Ranking: " + cricketer.getRanking());

        System.out.println("\nBatsman Information:");
        batsman.print();
        System.out.println("Batsman Ranking: " + batsman.getRanking());

        System.out.println("\nBowler Information:");
        bowler.print();
        System.out.println("Bowler Ranking: " + bowler.getRanking());

        System.out.println("\nAll-Rounder Information:");
        allRounder.print();
        System.out.println("All-Rounder Ranking: " + allRounder.getRanking());
    }
}

