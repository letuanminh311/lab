package ViewModel;

import java.util.Scanner;

public class InputData {
    private Scanner sc = new Scanner(System.in);

    public int inputInteger(String mess, String regex){
        System.out.println(mess);
        while(true){
            String number = sc.nextLine();
            if(number.matches(regex)){
                return Integer.parseInt(number);
            }
            else {
                System.out.println("Please input an integer with format:" + regex);
            }
        }
    }

    public String inputString(String mess, String regex){
        System.out.println(mess);
        while(true){
            String str = sc.nextLine().trim();
            if(str.isEmpty()) {
                return str;
            }
            if(str.matches(regex)) {
                return str;
            } else {
                System.out.println("Please input a valid string with format: " + regex);
            }
        }
    }
}
