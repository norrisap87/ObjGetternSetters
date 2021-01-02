package tts.com;

public class Pets1 {

    private String Name;
    private int Age;
    private String Location;
    private String Type;

    public static void main (String[] args){

        Pets1 cat = new Pets1();

        cat.setAge(34);
        cat.setName("Mr.Winky");
        cat.setType("Ginger, American Short Hair");
        cat.setLocation("Napping");

        Pets1 cat2 = new Pets1();

        cat2.setAge(12);
        cat2.setName("Elliott");
        cat2.setType("Black, American Short Hair");
        cat2.setLocation("my pillow");

        System.out.println(cat2.getLocation());
    }
        public void setName(String name){
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;




    }
}

