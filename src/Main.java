/**
 * Created by Костя on 30.01.2016.
 */
public class Main {
    public  static void main(String [] ags) {
        int i = 1;
        int g = 2;
        long l = 0;
        float f = 1.1f;
        double d = 0;
        boolean b = true; // false
        String s = "Kostya";

        System.out.println(s);

        i = count(i); //мы передаем счетчику count в качестве аргумента значениe переменной i
                      // и присваеваем переменной i то, что вернул метод count после проведения над нeq операций
        g = count(g);
        System.out.println(i);
        System.out.println(g);


    }


    private static int count (int x) { // так создается метод. в нашем случае он добавляет единицу переменной и возвращает результат

        x = x + 1;
        return x;    // нужно обязательно вставить оператор возврата и указать, что он будет возвращать!!!

    }




}
