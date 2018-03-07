package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
    /*    
    Scanner miesiac = new Scanner(System.in);
    int a;
    a=miesiac.nextInt();
    while(a!=0){
    switch (a) {
        case 1: System.out.println("Styczen");
        break;
        case 2: System.out.println("Luty");
        break;
        case 3: System.out.println("Marzec");
        break;
        case 4: System.out.println("Kwiecien");
        break;
        case 5: System.out.println("Maj");
        break;
        case 6: System.out.println("Czewriec");
        break;
        case 7: System.out.println("Lipiec");
        break;
        case 8: System.out.println("Sierpien");
        break;
        case 9: System.out.println("Wrzesien");
        break;
        case 10: System.out.println("Pazdziernik");
        break;
        case 11: System.out.println("Listopad");
        break;
        case 12: System.out.println("Grudzien");
        break;
}
} int a=0;
    int i=1;
    int b=1;
    
      
    do {
        a += b;
        i+=1;
        System.out.println("petla nr "+(i));
        System.out.println("a = "+ a);
    } while(a<1000);
    
    int i;
    for (i=20;i>=0;i--){
        if(i==2 || i==6 || i=9 || i=15 || i==19){
            continue;
        }
        System.out.println("liczba "+i);
    }
 */
    Scanner odczyt = new Scanner(System.in);
    int a=odczyt.nextInt();
    int b=odczyt.nextInt();
    int c=odczyt.nextInt();
    int d=b*b-4*a*c;
    System.out.println("Delta = "+d);
            }
    
}
