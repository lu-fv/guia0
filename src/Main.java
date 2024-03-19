import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //region PUNTO 1
        Integer n = 1;
        Double a = 3.14;
        Character c = 'l';

        System.out.println(a);
        System.out.println(n);
        System.out.println(c);


        System.out.println(a + n);
        System.out.println(a - n);

        System.out.println(((int) c));
        //endregion

        //region PUNTO 2
        Integer x = 10;
        Integer y = 20;

        Double o = 5.5;
        Double m = 15.5;

        System.out.println(m / o);
        System.out.println(x * y);

        //endregion

        //region PUNTO 3

        int z = 20;
        System.out.println("Z aumentado en 77=" + (z + 77));
        System.out.println("Z reducido a 3=" + (z - 17));
        System.out.println("Z duplicado=" + (z * 2));
        //endregion

        //region PUNTO 4

        int b = 3; //a
        int d = 6; //b
        int e = 9; //c
        int f = 12; //d
        int aux;

        aux = d;
        d = e;
        e = b;
        b = f;

        System.out.println("D->E =" + (d)); // d = 9
        System.out.println("E->B =" + (e)); // e = 3
        System.out.println("B->F =" + (b)); // b = 12
        System.out.println("F->D =" + (aux)); // f = 6

        //endregion

        //region PUNTO 5

        int num = 10;

        if (num % 2 == 0) {
            System.out.println(num + " es par");
        } else {
            System.out.println(num + " es impar");
        }
        //endregion

        //region PUNTO 6

        int numero = -3;

        if (numero < 0) {
            System.out.println(numero + " es negativo");
        } else {
            System.out.println(numero + " es positivo");
        }

        //endregion

        //region PUNTO 7
        int number = -500;

        if (number < 0) {
            System.out.println(number + " es negativo");
        } else {
            System.out.println(number + " es positivo");
        }
        if (number % 2 == 0) {
            System.out.println(number + " es par");
        } else {
            System.out.println(number + " es impar");
        }
        if (number % 5 == 0) {
            System.out.println(number + " multiplo de 5");
        } else {
            System.out.println(number + " no multiplo de 5");
        }
        if (number % 10 == 0) {
            System.out.println(number + " multiplo de 10");
        } else {
            System.out.println(number + " no multiplo de 10");
        }
        if (number < 100) {
            System.out.println(number + " es menor a 100");
        } else {
            System.out.println(number + " no es menor a 100");
        }

        //endregion

        //region PUNTO 8

        Scanner s = new Scanner(System.in);

        System.out.println(" Write your name: ");
        String name = s.nextLine();

        System.out.println("Good morning," + name);

        //endregion

        //region PUNTO 9

        Scanner sc = new Scanner(System.in);

        System.out.println(" Write a number ");
        int value = sc.nextInt();
        int doble = value * 2;
        int triple = value * 3;

        System.out.println(value + " : doble = " + doble);
        System.out.println(value + " : triple = " + triple);

        //endregion

        //region PUNTO 10
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temp en F:");
        int F = scanner.nextInt();
        int g = (F - 32) * 5 / 9;

        System.out.println("Farenheit " + F + " Grados: " + g);

        //endregion

        //region PUNTO 11
        // area= PI x radio^2 -- longitud = 2*Pi * radio
        // radio = 20; area =
        Scanner sca = new Scanner(System.in);
        System.out.println(" Radio: ");
        double radio = sca.nextInt();
        double pi = 3.14;
        double area = pi * radio * radio;
        double longitud = 2 * pi * radio;

        System.out.println(" radio: " + " area: " + area + " long: " + longitud);


        //endregion

        //region PUNTO 12
        //1km/h = [(1000m/h)%60]%60
        Scanner scan = new Scanner (System.in);

        System.out.println( " KM :");
        int km = scan.nextInt();
        double mt =km / 3.6;

        System.out.println(" KM/h:" + km +" M/s" + mt);

        //endregion

       punto_13();
    }
    public static void punto_13 ()
    {

    }

}
