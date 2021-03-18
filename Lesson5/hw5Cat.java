package Lesson5;

class hw5Cat extends hw5Animals {

    public hw5Cat(String spicies, int stamina, int strenght, int weight, int agility, boolean swim) {
        super(spicies, stamina, strenght, weight, agility, swim);
    }

    @Override
    void Swim() {
        System.out.println("I can't swim");
    }
}
