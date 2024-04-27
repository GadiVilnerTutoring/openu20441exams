package year2020.moedJune.q1;

public class RestaurantListMain {
    public static void main(String[] args) {
        RestaurantListTwo list = new RestaurantListTwo();
        list.addFood("Pizza");
        list.addFood("Falafel");
        list.addFood("Steak");
        list.addFood("Salad");
        list.addFood("Falafel");
        list.addFood("Schnitzel");
        list.addFood("Shwarma");
        list.addFood("Pasta");
        list.addFood("Hamburger");
        System.out.println(list.findMinDiff("Falafel", "Hamburger"));
    }
}
