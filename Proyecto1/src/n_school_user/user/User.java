package n_school_user.user;

public class User {
    // Atributos
    String name, email;
    int id, age;
    boolean is_teacher;

    // Constructores

    public User(){};

    public User(String name, String email, int id, int age){
        this.name = name;
        this.email = email;
        this.id = id;
        this.age = age;
    }

    public void info(){}
}


