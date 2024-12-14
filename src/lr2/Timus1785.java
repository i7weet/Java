package lr2;

import java.util.Scanner;

public class Timus1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if(input >= 1 && input <= 4)
            System.out.println("few");
        if(input >= 5 && input <= 9)
            System.out.println("several");
        if(input >= 10 && input <= 19)
            System.out.println("pack");
        if(input >= 20 && input <= 49)
            System.out.println("lots");
        if(input >= 50 && input <= 99)
            System.out.println("horde");
        if(input >= 100 && input <= 249)
            System.out.println("throng");
        if(input >= 250 && input <= 499)
            System.out.println("swarm");
        if(input >= 500 && input <= 999)
            System.out.println("zounds");
        if(input >= 1000)
            System.out.println("legion");
    }
}