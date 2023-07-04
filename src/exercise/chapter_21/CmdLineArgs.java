package exercise.chapter_21;

import java.util.Arrays;
import java.util.Random;

public class CmdLineArgs {

    public static void main(String[] args){
        // args
        System.out.println(args.length); // 2

        System.out.printf("첫 번째 인자는:%s\n", args[0]);
        System.out.printf("두 번째 인자는:%s\n", args[1]);
        Random rand = new Random();

        int[] arrays = {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)};
        System.out.println(Arrays.toString(arrays));
    }
}
