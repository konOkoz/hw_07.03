public class Main {
    public static void main(String[] args) {

        Voter m = new Voter("Jack","jdsasd",15);
        System.out.println(m.getName());
        m.setAge(20);
        System.out.println();
        System.out.println(m.getName());
        System.out.println(m.getAdresse());
        System.out.println(m.getAge());
        System.out.println();
        Voter n = new Voter("Mike","sad21/3",19);
        System.out.println(n.getName());
        System.out.println(n.getAdresse());
        System.out.println(n.getAge());

    }
}