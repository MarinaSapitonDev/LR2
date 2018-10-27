
import java.util.Scanner;

public class MainClass {

    public static void main(String args[]){

        int[] array = new int[10];
        int a;
        int b;

        Scanner reader = new Scanner(System.in);  // Reading from System.in

        System.out.println("set [a,b]");
        System.out.println("set a");
        a = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("set b");
        b = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("enter array's elements");
        for(int i =0; i<10;i++){
            array[i]= reader.nextInt();
        }
        reader.close();

        //find the element
        int min=array[0];
int res=0;
        for(int i =0; i<10;i++) {

            if (array[i] < min)
                min = array[i];

            if (min >= a && min <= b)
                res = min;
            else
                min = array[i];
        }

        //print final array
        for(int i =0; i<10;i++){
            System.out.println(array[i]);
        }
        System.out.println("the minimal element");
        System.out.println(res);
    }
}
