import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner is = new Scanner(System.in);
        System.out.println("please enter the number");
        int x= is.nextInt();
        if(x<0){
            System.out.println("负数不是回文数");
        }
        int a=0,b=0;
        int c=x;
        while (c!=0){
            a=c%10;
            b=b*10+a;
            c=c/10;
        }
        if(b==x) {
            System.out.println("是回文数");
        }
        else{
            System.out.println("bushi()");
        }
    }
    }