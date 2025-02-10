class EMP {
    String name;
    String id;
    EMP(){
       this.name = "Aritra";
       this.id = "5CSE2X74";
    }
    EMP(String name, String id){
       this.name = name;
       this.id = id;
    }
    public String toString() {
        return "This is EMP\nName: " + name + " id: " + id + "\n";
    }
}

class Scientist extends EMP {
    int no_of_publication;
    int experience;
    Scientist() {
        super(); // Calls the default constructor of EMP
    }
    Scientist(int no_of_publication, int experience, String name, String id) {
        super(name, id); // Calls the parameterized constructor of EMP
        this.no_of_publication = no_of_publication;
        this.experience = experience;
    }

    public String toString() {
        return "This is Scientist\nPublication: " + no_of_publication + " exp: " + experience + " Name: " + name + " id: " + id + "\n";
    }
}

class Dentist extends Scientist {
    int award;

    Dentist(int award, int no_of_publication, int experience, String name, String id) {
        super(no_of_publication, experience, name, id); // Calls the parameterized constructor of Scientist
        this.award = award;
    }

    public String toString() {
        return "This is Dentist\naward: " + award + " Publication: " + no_of_publication + " exp: " + experience + " Name: " + name + " id: " + id + "\n";
    }
}

class TestMain {
    public static void main(String[] args) {
        EMP e = new EMP();
        System.out.print(e);
        Scientist s = new Scientist(4, 23, "Nandy", "5CSE2X76");
        System.out.print(s);
        Dentist d = new Dentist(3, 1, 10, "Sarkar", "5CSE2X77");
        System.out.print(d);
    }
}

