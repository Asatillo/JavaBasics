class Kangaroo {
    String name;
    int age;

    public Kangaroo(String init_name, int init_age){
        name = init_name;
        age = init_age;
    }

    void display(String country){
        System.out.println("Kangaroo;" + name + " country: " + country);
        age++;
        System.out.println("Now " + name + " is " + age + " years old");
    }
}
