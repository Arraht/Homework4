import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    // Задача № 1:
    Scanner scanner = new Scanner(System.in);
    System.out.print("Задача № 1\nВозраст человека: ");
    byte personAgeTaskOne = scanner.nextByte();
    if (personAgeTaskOne >= 18){
        System.out.println("Если возраст человека равен " + personAgeTaskOne + ", то он совершеннолетний");
    }else{
        System.out.println("Если возраст человека равен " + personAgeTaskOne + ", он не достиг совершеннолетия, нужно" +
                " немного подождать");}
    // Задача № 2:
    System.out.print("\nЗадача №2\nТемператруа воздуха: ");
    byte airTemperature = scanner.nextByte();
    if (airTemperature < 5){
        System.out.println("На улице холодно, нужно надеть шапку");
    } else if (airTemperature == 5) {
        System.out.println("На улице холодно, нужно надеть шапку");
    }else{
        System.out.println("Сегодня тепло, можно идти без шапки");}
    // Задача № 3:
    System.out.print("\nЗадача № 3:\nСкорость водителя: ");
    byte driverSpeed = scanner.nextByte();
    if (driverSpeed > 60){
        System.out.println("Если скорость " + driverSpeed + ", то придется заплатить штраф");
    }else{
        System.out.println("Если скорость " + driverSpeed + ", то можно ездить спокойно");}
    // Задача № 4:
    System.out.print("\nЗадача № 4\nВозраст человека: ");
    byte personAgeTaskFour = scanner.nextByte();
    if (personAgeTaskFour >= 2 && personAgeTaskFour <=6){
        System.out.println("Если возраст человека равен " + personAgeTaskFour + ", то ему нужно ходить в детский сад");
    } else if (personAgeTaskFour >= 7 && personAgeTaskFour <= 17) {
        System.out.println("Если возраст человека равен " + personAgeTaskFour + ", то ему нужно ходить в школу");
    } else if (personAgeTaskFour >= 18 && personAgeTaskFour <= 24) {
        System.out.println("Если возраст человека равен " + personAgeTaskFour + ", то его место в университете");
    } else if (personAgeTaskFour > 24) {
        System.out.println("Если возраст человека равен " + personAgeTaskFour + ", то ему пора ходить на работу");
    }else {
        System.out.println("Если возраст человека равен " + personAgeTaskFour + ", то ему ещё рано куда-либо ходить");}
    // Задача № 5:
    System.out.print("\nЗадача № 5\nВозраст ребёнка: ");
    byte childAge = scanner.nextByte();
    if (childAge < 5){
        System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на атракционе");
    } else if (childAge >= 5 && childAge <= 14) {
        System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на " +
                "аттракционе в сопровождении");
    }else{
        System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на " +
                "аттракционе без сопровождения взрослого");}
    // Задача № 6:
    byte capacity = 102;
    byte seatPlace = 60;
    int remainingPlaces;
    System.out.print("\nЗадача № 6\nКоличество человек в вагоне: ");
    byte numberOfPersons = scanner.nextByte();
    if (numberOfPersons >= seatPlace && numberOfPersons < capacity){
        remainingPlaces = (capacity - numberOfPersons);
        System.out.println("В вагоне остались только стоячие места в количестве " + remainingPlaces);
    } else if (numberOfPersons < seatPlace){
        remainingPlaces = seatPlace - numberOfPersons;
        System.out.println("В вагоне есть сидячие места в количестве " + remainingPlaces);
    }else {
        System.out.println("Вагон забит");}
    // Задача № 7:
    System.out.print("\nЗадача № 7\nВведите первое число: ");
    int one = scanner.nextInt();
    System.out.print("Введите второе число: ");
    int two = scanner.nextInt();
    System.out.print("Введите третье число: ");
    int three = scanner.nextInt();
    if (one > two && one > three){
        System.out.println("Большим числом является первое число: " + one);
    } else if (two > one && two >three) {
        System.out.println("Большим числом является второе число: " + two);
    } else if (three > one && three > two) {
        System.out.println("Большим числом является третье число: " + three);
    } else if (one == two && one > three) {
        System.out.println("Большими числами являются первое: " + one + " и второе: " + two + ", при этом " +
                "между собой они равны");
    } else if (two == three && two > one) {
        System.out.println("Большими числами являются второе: " + two + " и третье: " + three + ", при этом " +
                "между собой они равны");
    } else if (one == three && one > two) {
        System.out.println("Большими числами являются первое: " + one + " и третье: " + three + ", при " +
                "этом между собой они равны");
    }else{
        System.out.println("Числа равны");}
    }
}