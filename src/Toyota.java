/***
 * Класс наследник, перенимает параметры от родителя и содержит свои параметры
 */
public class Toyota extends Car {
    int countSeeds = 4;
    boolean presenceTrunk = true;

    int getCountSeeds(){
        return countSeeds;
    }

    boolean getPresenceTrunk(){
        return presenceTrunk;
    }
}
