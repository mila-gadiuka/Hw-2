public class Main {
    public static void main(String[] args) {

        //Задача 1 Создаем переменные со значениями и выаодим их.
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //Задача 2 Увеличиваем каждое значение переменных на 4.
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //Задача 3 Уменьшиваем каждое значение переменной в зависимости от условия задачи.
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //Задача 4 Создать переменную и провести с ней предложенные операции.
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача 5 Создать переменную и провести с ней предложенные операции.
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6.
        var weightBox1 = 78.2;
        var weightBox2 = 82.7;
        var commonWeight = weightBox1 + weightBox2;
        System.out.println("Общий вес боксеров составляет " + commonWeight + " кг");
        var weightDifference = weightBox2 - weightBox1;
        System.out.println("Разница в весе составляет " + weightDifference + " кг");

        //Задача 7 приложением к Задаче 6. Вычислить разницу весов спортсменов, используя 2 способа ( Вычитание из большего веса меньшего; С помощь функции остаток от деления)
        var weightDifference1 = weightBox2 - weightBox1;
        System.out.println("Разница в весе составляет " + weightDifference1 + " кг");
        var weightDifference2 = weightBox2 % weightBox1;
        System.out.println("Разница в весе составляет " + weightDifference2 + " кг");

        //Задача 8.1
        var totalWorkingHours = 640;
        var workingHourPerEmployee = 8;
        var totalEmployees = totalWorkingHours / workingHourPerEmployee;
        System.out.println("В компании всего " + totalEmployees + " сотрудников");

        //Задача 8.2
        var totalEmployees1 = totalEmployees + 94;
        var workingHourPerEmployee1 = totalWorkingHours / totalEmployees1;
        System.out.println("Если в компании " + totalEmployees1 + " сотрудников, то по " + workingHourPerEmployee1 + " рабочих часов должно быть поделено между ними");

    }
}