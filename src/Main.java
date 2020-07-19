/***
 * Принцип ООП: Наследование
 */
public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();

        System.out.println("Параметры автомобиля");
        System.out.println("Количество сидений в автомобиле: " + toyota.countSeeds);
        System.out.println("Максимальная скорость автомобиля: " + toyota.maxSpeed);
        String presenceTrunk = toyota.presenceTrunk ? "Есть" : "Отсутствует";
        System.out.println("Наличие багажника в автомобиле: " + presenceTrunk);
    }
}
