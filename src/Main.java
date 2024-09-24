import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("GO!!!!!!!!!!!!!!!");
        long startTime = System.currentTimeMillis();

        Scanner scan = new Scanner(System.in);
        scan.next();
        long endTime = System.currentTimeMillis();

        long reactionTime = endTime - startTime;

        System.out.println(reactionTime +" ms");



    }
}