import org.testng.annotations.Test;
import org.testng.Assert;



public class CashbackHackServiceTestTestNG {

    @Test
    public void testcorrect1 (){
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void testcorrect2 (){
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        Assert.assertEquals(actual, expected);

    }
    }

//Код, который вы привели, представляет собой простую реализацию класса CashbackHackService на языке Java. Давайте разберем его по частям:
//
//        1. Объявление класса:
//
//public class CashbackHackService {
//
//    Здесь объявляется общедоступный (public) класс CashbackHackService, который может быть использован в других частях программы.
//
//            2. Поле класса:
//
//    private final int boundary = 1000;
//
//    Это поле объявлено как private и final, что означает, что оно доступно только внутри данного класса и не может быть изменено после инициализации. Значение этого поля составляет 1000 и может представлять, например, границу для расчета кэшбека.
//
//            3. Метод remain:
//
//    public int remain(int amount) {
//        return boundary - amount % boundary;
//    }
//
//    Этот метод принимает один параметр amount (количество), и возвращает значение типа int. Внутри метода происходит следующее:
//            - amount % boundary вычисляет остаток от деления amount на boundary (1000). Это дает остаток, который показывает, сколько единиц не хватает до следующей тысячи.
//            - Затем от boundary (1000) вычитается этот остаток, чтобы получить количество денег, которое нужно добавить к amount, чтобы достичь следующего кратного 1000.
//
//            ### Пример работы метода:
//            - Если amount = 750, тогда 750 % 1000 равно 750.
//            - Следовательно, boundary - 750 будет равно 1000 - 750 = 250. Это значит, что нужно добавить еще 250, чтобы получить 1000.
//
//            - Если amount = 1000, тогда 1000 % 1000 равно 0.
//            - Здесь boundary - 0 будет равно 1000 - 0 = 1000. Значит, если мы уже находимся на границе (1000), нужно добавить еще 1000, чтобы получить следующее кратное.
//
//    Этот класс может быть полезен, например, в приложении, которое рассчитывает кэшбэк или бонусы при покупках, чтобы определить, сколько еще нужно потратить для достижения следующего уровня кэшбека.