public class Cat {
    private int age;
    private String name;
    private String owner_name;

    public Cat(int age, String name, String owner_name){
        this.age = age;
        this.name = name;
        this.owner_name = owner_name;
    }

    void mew() {
        if (this.age < 5) System.out.println("Mew!");
        else System.out.println("I CAN TALK!! MEW!");
    }
    void drink() {
        System.out.println("Delicious milk!");
    }
    void get_age(){
        System.out.println("My age is " + this.age);
    }
}
