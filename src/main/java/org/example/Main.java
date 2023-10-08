import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r1.readLine());
        if (a>7) System.out.println("Привет");
        String obj1= r1.readLine();
        if(Objects.equals(obj1, "Вячеслав"))
        {
            System.out.println("Привет, Вячеслав");
        }
        else
        {
            System.out.println("Нет такого имени");
        }
        int[] obj2 = new int[9];
        for(int i=0;i<9;i++)
        {
            obj2[i]= Integer.parseInt(r1.readLine());
        }
        for(int i=0;i<9;i++)
        {
            if(obj2[i]%3==0)System.out.println(obj2[i]);
        }
    }
}