public class Voter {

   /* Создать класс Voter (Избиратель) , содержащий поля имя, адрес, возраст а также конструктор, геттеры и сеттеры
    При создании должно быть учтено, что минимальный возраст в Германии для участия в выборах - 16 лет.
    */
    private String name;
    private String adresse;
    private int age;
    public Voter (String name, String adresse, int age) {
        this.name = name;
        this.adresse = adresse;
        if (age >= 16) {
            this.age = age;
        }
        else {
                System.out.println("This person is not able to vote");
            }
    }

    public String getName(){
        return name;
    }
    public String getAdresse(){
        return adresse;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        if (age >= 16) {
            this.age = age;
        } else {
            System.out.println("This person is not able to vote");
        }
    }
}
