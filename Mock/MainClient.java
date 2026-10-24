package Mock;

import java.util.List;

public class MainClient {
    public static void main(String[] args){
        BracesGenerator obj1=new BracesGenerator();
        List<String> results = obj1.generateBraces(4);
        for (String s : results) {
            System.out.println(s);
        }
    }
}
