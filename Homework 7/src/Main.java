// Awais Razaque
// Homework 7
// 4/3/24

import java.util.Random;
public class Main {
    public static void main(String[] args){
        System.out.println();

        // Q1
        student MelC = new student("Melissa","Senior",3.4,1343);
        student AwR = new student("Awais", "Sophmore", 4.0, 4864);
        student EvTi = new student("Evan", "Sophmore", 3.0, 1890);
        student Andr = new student("Andrew", "Sophmore", 3.8, 2760);
        student Maru = new student("Maruiam", "Senior", 3.6, 3854);
        student Anth = new student("Anthony", "Sophmore", 3.0, 7209);
        student Fresh = new student("Jackson", "Freshman", 2.5, 5403);

        // Q2
        System.out.println("To be an honor roll student, you must have a gpa greater than 3.6: ");
        MelC.isHonorRoll();
        AwR.isHonorRoll();
        EvTi.isHonorRoll();
        Andr.isHonorRoll();
        Maru.isHonorRoll();
        Anth.isHonorRoll();
        Fresh.isHonorRoll();

        System.out.println();

        // Q3
        Random rand = new Random();
        String one = String.valueOf(rand.nextInt(9));
        String two = String.valueOf(rand.nextInt(9));
        String three = String.valueOf(rand.nextInt(9));
        String four = String.valueOf(rand.nextInt(9));
        int id = Integer.valueOf(one + two + three + four);

        System.out.println("To get free lunch, your ID must match the randomly generated id: ");
        MelC.freeLunch(id);
        AwR.freeLunch(id);
        EvTi.freeLunch(id);
        Andr.freeLunch(id);
        Anth.freeLunch(id);
        Fresh.freeLunch(id);
        System.out.println("The random ID for today was: " + id);
    }
}