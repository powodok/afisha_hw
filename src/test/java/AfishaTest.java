
import org.example.Afisha;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {

    String movie1 = new String("Movie 1");
    String movie2 = new String("Movie 2");
    String movie3 = new String("Movie 3");
    String movie4 = new String("Movie 4");
    String movie5 = new String("Movie 5");
    String movie6 = new String("Movie 6");
    String movie7 = new String("Movie 7");
    String movie8 = new String("Movie 8");
    String movie9 = new String("Movie 9");
    String movie10 = new String("Movie 10");
    String movie11 = new String("Movie 11");
    String movie12 = new String("Movie 12");
    String movie13 = new String("Movie 13");
    String movie14 = new String("Movie 14");
    String movie15 = new String("Movie 15");

    Afisha afisha = new Afisha();

    @Test // Добавление фильмов и вывод всех фильмов в порядке их добавления
    public void testAddMovies() {

        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");

        String[] expected = {"Movie1", "Movie2", "Movie3"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (нижняя граница) (лимит по умолчанию)
    public void outputMovieLimitOnMin() {

        String[] expected = {};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (нижняя граница + 1) (лимит по умолчанию)
    public void outputMovieLimitOnMin1() {

        afisha.add("Movie1");

        String[] expected = {"Movie1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (лимит по умолчанию)
    public void outputMovieLimitOn() {

        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");
        afisha.add("Movie4");
        afisha.add("Movie5");
        afisha.add("Movie6");

        String[] expected = {"Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test //  вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (верхняя граница лимита - 1) (лимит по умолчанию)
    public void outputMovieLimitOnMax0() {

        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");
        afisha.add("Movie4");
        afisha.add("Movie5");
        afisha.add("Movie6");
        afisha.add("Movie7");
        afisha.add("Movie8");
        afisha.add("Movie9");




        String[] expected = {"Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов равно лимиту (верхняя граница лимита) (лимит по умолчанию)
    public void outputMovieLimitOnMax1() {

        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");
        afisha.add("Movie4");
        afisha.add("Movie5");
        afisha.add("Movie6");
        afisha.add("Movie7");
        afisha.add("Movie8");
        afisha.add("Movie9");
        afisha.add("Movie10");


        String[] expected = {"Movie10", "Movie9", "Movie8", "Movie7" ,"Movie6" ,"Movie5" ,"Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов больше лимита (верхняя граница лимита +1) (лимит по умолчанию)
    public void outputMovieLimitOnMax2() {

        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");
        afisha.add("Movie4");
        afisha.add("Movie5");
        afisha.add("Movie6");
        afisha.add("Movie7");
        afisha.add("Movie8");
        afisha.add("Movie9");
        afisha.add("Movie10");
        afisha.add("Movie11");

        String[] expected = {"Movie11", "Movie10", "Movie9", "Movie8" ,"Movie7" ,"Movie6" ,"Movie5", "Movie4", "Movie3", "Movie2"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов больше лимита (лимит по умолчанию)
    public void outputMovieLimitOnMaxMax() {

        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");
        afisha.add("Movie4");
        afisha.add("Movie5");
        afisha.add("Movie6");
        afisha.add("Movie7");
        afisha.add("Movie8");
        afisha.add("Movie9");
        afisha.add("Movie10");
        afisha.add("Movie11");
        afisha.add("Movie12");
        afisha.add("Movie13");
        afisha.add("Movie14");
        afisha.add("Movie15");

        String[] expected = {"Movie15", "Movie14", "Movie13", "Movie12" ,"Movie11" ,"Movie10" ,"Movie9", "Movie8", "Movie7", "Movie6"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (нижняя граница) (лимит установлен)
    public void outputMovieLimitOffMin() {
        Afisha afisha = new Afisha(5);

        String[] expected = {};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (нижняя граница + 1) (лимит установлен)
    public void outputMovieLimitOffMin1() {
        Afisha afisha = new Afisha(5);

        afisha.add("Movie1");

        String[] expected = {"Movie1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (лимит установлен)
    public void outputMovieLimitOff() {
        Afisha afisha = new Afisha(15);

        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");
        afisha.add("Movie4");
        afisha.add("Movie5");
        afisha.add("Movie6");

        String[] expected = {"Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test //  вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (верхняя граница лимита - 1) (лимит установлен)
    public void outputMovieLimitOffMax0() {
        Afisha afisha = new Afisha(5);

        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");
        afisha.add("Movie4");

        String[] expected = {"Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов равно лимиту (верхняя граница лимита) (лимит установлен)
    public void outputMovieLimitOffMax1() {
        Afisha afisha = new Afisha(8);

        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");
        afisha.add("Movie4");
        afisha.add("Movie5");
        afisha.add("Movie6");
        afisha.add("Movie7");
        afisha.add("Movie8");



        String[] expected = {"Movie8", "Movie7" ,"Movie6" ,"Movie5" ,"Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов больше лимита (верхняя граница лимита +1) (лимит установлен)
    public void outputMovieLimitOffMax2() {
        Afisha afisha = new Afisha(4);

        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");
        afisha.add("Movie4");
        afisha.add("Movie5");


        String[] expected = {"Movie5", "Movie4", "Movie3", "Movie2"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов больше лимита (лимит установлен)
    public void outputMovieLimitOffMaxMax() {
        Afisha afisha = new Afisha(6);

        afisha.add("Movie1");
        afisha.add("Movie2");
        afisha.add("Movie3");
        afisha.add("Movie4");
        afisha.add("Movie5");
        afisha.add("Movie6");
        afisha.add("Movie7");
        afisha.add("Movie8");
        afisha.add("Movie9");
        afisha.add("Movie10");
        afisha.add("Movie11");
        afisha.add("Movie12");
        afisha.add("Movie13");
        afisha.add("Movie14");
        afisha.add("Movie15");

        String[] expected = {"Movie15", "Movie14", "Movie13", "Movie12" ,"Movie11" ,"Movie10"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
