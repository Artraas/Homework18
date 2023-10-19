package exercise2;

enum Animals {
    DOG("Jack", 2),
    CAT("Snow", 3);
    String name;
    int age;

    Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name() + " " +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
