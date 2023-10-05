package org.example;

    import java.util.Objects;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            int obj1= new Scanner(System.in).nextInt();
            if (obj1>7) System.out.println("Привет");
            /*_____________________________________________________
            _____________________________________________________*/
            Scanner scan = new Scanner(System.in);
            String obj2=scan.nextLine();
            if(Objects.equals(obj2, "Вячеслав"))
            {
                System.out.println("Привет, Вячеслав");
            }
            else
            {
                System.out.println("Нет такого имени");
            }
            /*_____________________________________________________
            _____________________________________________________*/
            int[] obj3 = new int[9];
            for(int i=0;i<9;i++)
            {
                obj3[i]=new Scanner(System.in).nextInt();
            }
            for(int i=0;i<9;i++)
            {
                if(obj3[i]%3==0)System.out.println(obj3[i]);
            }
        }
}