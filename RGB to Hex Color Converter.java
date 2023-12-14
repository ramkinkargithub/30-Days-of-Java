import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        // Test cases
        System.out.println(generateHexCode(0, 0, 0));    // Black
        System.out.println(generateHexCode(255, 255, 255)); // White
        System.out.println(generateHexCode(255, 255, 0));   // Yellow
        System.out.println(generateHexCode(189,183,107 ));   // dark khakhi
    }

    public static String generateHexCode(int red, int green, int blue) {
        List <Character> list = new ArrayList<>();
        int i=1;
        if(blue==0){
            list.add('0');
            list.add('0');
        }
        for(;i<7 && blue!=0;i++){
            if(blue%16<10){
                list.add((char)(blue%16+48));
            }
            else
                list.add((char)(blue%16+65-10));
            blue/=16;
        }
        if(green==0){
            list.add('0');
            list.add('0');
        }
        for(;i<7 && green!=0;i++){
            if(green%16<10)
                list.add((char)(green%16+48));
            else
                list.add((char)(green%16+65-10));
            green/=16;
        }
        if(red==0){
            list.add('0');
            list.add('0');
        }
        for(;i<7 && red!=0;i++){
            if(red%16<10)
                list.add((char)(red%16+48));
            else
                list.add((char)(red%16+65-10));
            red/=16;
        }
        list.add('#');
        
        Collections.reverse(list);
        // return list.toString();
        return String.join("",list.get(0).toString(),list.get(1).toString(),list.get(2).toString(),list.get(3).toString(),list.get(4).toString(),list.get(5).toString(),list.get(6).toString());
    }
}
