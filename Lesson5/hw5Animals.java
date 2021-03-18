package Lesson5;

abstract class hw5Animals {

    protected String species;
    protected int stamina;
    protected int strenght;
    protected int weight;
    protected int agility;
    protected boolean swim = true;

    public hw5Animals(String spicies, int stamina, int strenght, int weight, int agility, boolean swim) {
        this.species = spicies;
        this.stamina = stamina;
        this.strenght = strenght;
        this.weight = weight;
        this.agility = agility;
        this.swim = swim;
    }


    void Run(int stamina, int strength, int distance) {
        if ((stamina + strength) >= distance){
            System.out.println(species + " ran " + distance + " metres.");
        }else {
            System.out.println("No way! It's too far!");
        }
    }

    void Jump(int agility, int weight, float height) {
        if (((agility + strenght) - weight) >= height) {
            System.out.println(species + " jump " + height + " meter.");
        }else {
            System.out.println("I can't, is too high!");
        }
    }

    void Swim(int stamina, int strenght, int swimDist) {
        if (swim == false) {
            System.out.println("Nope! I can't!");
        }else if (((stamina + strenght) / weight) >= swimDist){
            System.out.println(species + " swim " + swimDist + " meter.");
        }else {
            System.out.println("Nope! Too far!");
        }
    }



    abstract void Swim();
}
