public class Main {
    //В классе Main создать массив из 3х разных героев

    public static void main(String[] args) {
        Medic medic = new Medic();
        Magic magic = new Magic();
        Warrior warrior = new Warrior();
        //затем через цикл применить суперспособность каждого героя.

        Hero[] heroes = {warrior, magic, medic};
        for (Hero a : heroes) {
            a.applySuperAbility("CRITICAL DAMAGE");
        }
    }
}