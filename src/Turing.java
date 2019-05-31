import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Turing {

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        String instructions = scn.nextLine();
        char[] instructionsArray = instructions.toCharArray();

        int i = 0;
        ArrayList<String> tape = new ArrayList<>();
//        for (char s:instructionsArray
//        ) {
//            System.out.print(s);
//        }
        while (i < instructionsArray.length) {
            int c0 = 0;
            int c1 = (tape.size() - 1) / 2;
            int c2 = 0;
            if (tape.size() > 0 ){
                c2 = tape.size() - 1;
            }
            if (instructionsArray[i] == '0') {
                if (instructionsArray[i + 1] == '0') {
                    if (tape.size() == 0) {
                        System.out.println("#");
                        i += 2;
                    } else {
                        System.out.println(tape.get(c0));
                        i += 2;
                    }
                } else if (instructionsArray[i + 1] == '1') {
                    tape.add(c0, String.valueOf(instructionsArray[i + 2]));
                    i += 3;
                } else if (instructionsArray[i + 1] == '2') {
                    if (tape.size() != 0) {
                        tape.remove(c0);
                    }
                    i += 2;
                }
            } else if (instructionsArray[i] == '1') {
                if (instructionsArray[i + 1] == '0') {
                    if (tape.size() == 0) {
                        System.out.println("#");
                        i += 2;
                    } else {
                        System.out.println(c1);
                        System.out.println(tape.get(c1));
                        i += 2;
                    }
                } else if (instructionsArray[i + 1] == '1') {
                    tape.add(c1, String.valueOf(instructionsArray[i + 2]));
                    i += 3;
                } else if (instructionsArray[i + 1] == '2') {
                    if (tape.size() != 0) {
                        tape.remove(c1);
                    }
                    i += 2;
                }
            } else if (instructionsArray[i] == '2') {
                if (instructionsArray[i + 1] == '0') {
                    if (tape.size() == 0) {
                        System.out.println("#");
                        i += 2;
                    } else {
                        System.out.println(tape.get(c2));
                        i += 2;
                    }
                } else if (instructionsArray[i + 1] == '1') {
                    tape.add(c2, String.valueOf(instructionsArray[i + 2]));
                    i += 3;
                } else if (instructionsArray[i + 1] == '2') {
                    if (tape.size() != 0) {
                        tape.remove(c2);
                    }
                    i += 2;
                }
            }

        }
    }
}

