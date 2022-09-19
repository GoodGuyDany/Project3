// Project #3
import java.util.Scanner;
public class Project3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Part 1/2 (decided to merge them)
        System.out.println("Hello User, what's your name?");
        String name = sc.nextLine();
        System.out.println("Nice to meet you, " + name + "!" + " Can I ask you some questions to find out what activities you might participate in? (Yes/No)");
        String go = sc.nextLine();
        if (go.equalsIgnoreCase("Yes")) {
            System.out.println("Cool, let's go then!");
            try {
                Thread.sleep(1200);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        else
            if(go.equalsIgnoreCase("NO")){
                System.out.println("Next time then, have a nice day!");
                System.exit(0);
        }
        System.out.println("How old are you, " + name + "?");
        int age = sc.nextInt();
        if (age < 6){
            System.out.println("Seems like your only activities are playing at home, going for walks and to kindergarten.");
        }
        else
            if(age >= 7 && age <= 17){
                System.out.println("Your daily activities certainly include going to and from school.");
            }
            if(age >= 18 && age <= 22){
                System.out.println("You must be going to the university already, huh?");
            }
            if(age >= 23 && age <= 59){
                System.out.println("I think your main activity in this age is going to and from work.");
            }
            if (age >= 60){
                System.out.println("You must be retired then!");
            }
            System.out.println("Was I correct?(1-Yes/0-No)");
            int answer = sc.nextInt();
            sc.nextLine();
            switch (answer){
                case 1:
                    System.out.println("Very glad to hear that! Thanks for the feedback!");
                    break;
                case 0:
                    System.out.println("Really? I'll try to improve, thanks for your feedback!");
                    break;
                default:
                    System.out.println("");
            }
// Part 3
        String newline = System.lineSeparator();
        System.out.println("Hello, User, what's your name?");
        String username = sc.nextLine();
        System.out.println("Nice to meet you, " + username + ". What's your favorite movie genre?");
        System.out.println("Here are some of the most popular genres: " + newline  + "Horror" + newline + "Fantasy" + newline + "Sci-Fi" + newline + "Thriller" + newline + "Comedy");
        String genre = sc.nextLine();
        genre = genre.toUpperCase();
        System.out.println("And one more question: how old are you?");
        int userage = sc.nextInt();
        if (userage <= 15) {
            switch (genre) {
                case "HORROR":
                    System.out.println("I wouldn't recommend you watching any horrors until 16.");
                    break;
                case "FANTASY":
                    System.out.println("Charlie and the Chocolate Factory is a cool fantasy movie!");
                    break;
                case "SCI-FI":
                    System.out.println("Buzz Lightyear is a cool sci-fi movie to watch!");
                    break;
                case "THRILLER":
                    System.out.println("Nightmare before Christmas is a cool thriller movie to watch!");
                    break;
                case "COMEDY":
                    System.out.println("Bad Guys is a cool comedy movie to watch!");
                    break;
                default:
                    System.out.println("");
            }
        }
        else if(userage >= 16){
            switch (genre){
                case "HORROR":
                    System.out.println("Time is a cool horror movie to watch!");
                    break;
                case "FANTASY":
                    System.out.println("Doctor Strange is a cool fantasy movie!");
                    break;
                case "SCI-FI":
                    System.out.println("Samaritan is a cool sci-fi movie to watch!");
                    break;
                case "THRILLER":
                    System.out.println("Deep Waters is a cool thriller movie to watch!");
                    break;
                case "COMEDY":
                    System.out.println("Man from Toronto is a cool comedy movie to watch!");
                    break;
                default:
                    System.out.println("");
            }
        }


    }
}

