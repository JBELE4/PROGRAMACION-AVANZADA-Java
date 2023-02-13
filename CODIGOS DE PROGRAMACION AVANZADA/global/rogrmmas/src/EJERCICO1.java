import java.util.Scanner;
public class EJERCICO1 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("n");
        int x =input.nextInt();
        if((x%2)==0){
            for (int i =0;i<x;i++){
                System.out.println(x);
            }
        }
        else{
            for (int i =0;i<10;i++){
                System.out.println("hoaja "+(i+1) +"nuero"+x);
            }
        }
        input.close();
    }

}
