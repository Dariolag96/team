import java.util.Date;

public abstract class Person {
    String name;
    private String surname;
    private  Date age;

    private Person(String name,String surname, Date age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    public void String Person(String name){
        this.name=name;
}
public void String Person(String surname){
        this.surname=surname;
    }
    public void Date getage (Date age){
        this.age=age;
    }
}
