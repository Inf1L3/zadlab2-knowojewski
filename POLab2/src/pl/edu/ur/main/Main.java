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

    Scanner odczyt = new Scanner(System.in);
    int a=odczyt.nextInt();
    int b=odczyt.nextInt();
    int c=odczyt.nextInt();
    int d=b*b-4*a*c;
    System.out.println("Delta = "+d);
    System.out.println("Delta = "+d);
        
        ZADANIE DOMOWE:
            
    Zadanie 3: 
    Scanner input = new Scanner(System.in);
    double[] tab = new double[10];
    int i;
    System.out.println("Wpisz liczby do tablicy.");
    for (i=0;i<10;i++){
      tab[i]=input.nextDouble();
    }
    int wybor;
    do{ 
        System.out.println("Wciśnij 1 aby wyświetlić kolejno liczby. ");
        System.out.println("Wciśnij 2 aby wyświetlić liczby w odwrotnej kolejności. ");
        System.out.println("Wciśnij 3 aby wyświetlić liczby o nieparzystych indeksach. ");
        System.out.println("Wciśnij 4 aby wyświetlić liczby o parzystych indeksach. ");
        System.out.println("Wciśnij 5 aby zakończyć.");
        
        wybor = input.nextInt();
        
        if (wybor == 1){
            for (i=0;i<10;i++){
                System.out.println("Element "+i+" tablicy to: "+tab[i]);
            }
        }
        if (wybor == 2) {
            for (i=9;i>=0;i--) {
                System.out.println("Element "+i+" tablicy to: "+tab[i]);
            }
        }
        if (wybor == 3) {
            for (i=1;i<10;i+=2) {
                System.out.println("Element "+i+" tablicy to: "+tab[i]);
            }
        }
        if (wybor == 4) {
            for (i=0;i<10;i+=2) {
                System.out.println("Element "+i+" tablicy to: "+tab[i]);
            }
        }
    } while (wybor!=5);

    Zadanie 4:
    
    Scanner input = new Scanner(System.in);
    float[] tab = new float[10];
    int i;
    int wybor;
    float suma = 0;
    float iloczyn = 1;
    float srednia = 0;
    float max = 0;
    float min = 0;
    for (i=0;i<10;i++){
        tab[i] = input.nextFloat();
        
    }
    do {
        System.out.println("Aby wyświetlić sumę elementów tablicy wciśnij 1.");
        System.out.println("Aby wyświetlić iloczyn elementów tablicy wciśnij 2.");
        System.out.println("Aby wyświetlić średnią elementów tablicy wciśnij 3.");
        System.out.println("Aby wyświetlić minimum spośród elementów tablicy wciśnij 4.");
        System.out.println("Aby wyświetlić maksimum spośród elementów tablicy wciśnij 5.");
        System.out.println("Wciśnij 6 aby zakończyć.");
        wybor = input.nextInt();
        
        if (wybor == 1){
            for (i=0;i<10;i++){
                
                suma = suma + tab[i];
                
               
            }
            System.out.println("Suma elementów tablicy wynosi: "+suma);
        }
        if (wybor == 2){
            for (i=0;i<10;i++){
                
                iloczyn = iloczyn  * tab[i];
                
               
            }
            System.out.println("Iloczyn elementów tablicy wynosi: "+iloczyn);
        }
        if (wybor == 3){
            for (i=0;i<10;i++){
                suma = suma + tab[i];
                
            }
            srednia = suma/10;
            System.out.println("Srednia elementów tablicy wynosi: "+srednia);
        }
        if (wybor == 4){
            for (i=0;i<10;i++){
                if (tab[i]<min){
                min = tab[i];}
            }
            System.out.println("Minimum z elementów tablicy wynosi: "+min);
        }
        if (wybor == 5){
            for (i=0;i<10;i++){
                if (tab[i]>max){
                max = tab[i];}
            }
            System.out.println("Maksimum z elementów tablicy wynosi: "+max);
        }
        
    }while (wybor!=6);

    Zadania 6: */
    Scanner input = new Scanner(System.in);
    int i;
    while(true){
        i = input.nextInt();
        if (i<0){
        break;}
        
    }
    
            }
    
}
