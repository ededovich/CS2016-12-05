package by.it.sazonov_valery.lesson02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_VideoRegistrator {

    public static void main(String[] args) {
        A_VideoRegistrator instance = new A_VideoRegistrator();
        double[] events = new double[]{1, 1.1, 1.6, 2.2, 2.4, 2.7, 3.9, 8.1, 9.1, 5.5, 3.7};
        List<Double> starts = instance.calcStartTimes(events, 1); //рассчитаем моменты старта, с длинной сеанса 1
        System.out.println(starts);                            //покажем моменты старта
    }

    //модификаторы доступа опущены для возможности тестирования
    List<Double> calcStartTimes(double[] events, double workDuration) {
        //events - события которые нужно зарегистрировать
        //timeWorkDuration время работы видеокамеры после старта
        List<Double> result;
        result = new ArrayList<>();
        int i = 0;                              //i - это индекс события events[i]
        //комментарии от проверочного решения сохранены для подсказки, но вы можете их удалить.
        //подготовка к жадному поглощению массива событий
        Arrays.sort(events);                                      //hint: сортировка Arrays.sort обеспечит скорость алгоритма
        //C*(n log n) + C1*n = O(n log n)

        while (i < events.length) {                                     //пока есть незарегистрированные события

            try {
                result.add(events[i]);                                         //получим одно событие по левому краю
                double endTime = events[i] + 1;                                        //и запомним время старта видеокамеры
                while (events[i] <= endTime) {                                       //вычислим момент окончания работы видеокамеры
                    i++;
                    //и теперь пропустим все покрываемые события
                }                                                         //за время до конца работы, увеличивая индекс
            } catch (Exception e) {
                break;
            }

        }

        return result;                        //вернем итог
    }
}
