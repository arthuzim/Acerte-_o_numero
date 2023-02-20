import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bem vindo ao adivinhe  o numero");

        System.out.println("Quer jogar ?  s/n");
        var play = sc.next();
        
        System.out.println("Digite um numero entre 0 e 100");
        var num = sc.nextInt();

        int wins = 0;
        int loses = 0;

        while(Objects.equals(play, "s")){

//
            var numRandom = random.nextInt(100);
            if (numRandom == num){
                wins++;
                System.out.println("Você acertou :) o placar esta  wins =" + wins + " loses =" + loses);

            }else {
                loses++;
                System.out.println("Você errou :( o numero é " + numRandom + " o placar esta  wins =" + wins + " loses =" + loses);
            }
            System.out.println("Quer jogar novamente? s/n");
            play = sc.next();

            System.out.println("Digite um numero entre 0 e 100");
            num = sc.nextInt();


        }

        sc.close();
    }
}