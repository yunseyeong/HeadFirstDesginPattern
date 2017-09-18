package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Pattern p = Pattern.compile("(^[0-9]*&)");

        int onlyNum;
        String inputVal;
        Scanner isStream = new Scanner(System.in);

        inputVal = isStream.nextLine();
        Matcher m = p.matcher(inputVal);

        if(m.find()){
            onlyNum = Integer.parseInt(inputVal);
            System.out.println(onlyNum);
        }else{
            System.out.println("it's not a number");
        }
    }
}
