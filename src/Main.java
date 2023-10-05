class Main {
    public static void main(String[] args) {
        Cat kitty = new Cat(10, "Kotik", "Masha");
        kitty.mew();
        kitty.get_age();

        String a = "Masha";
        String b = "Masha.jr";
        System.out.println(b.equals(a+".jr"));
    }
}