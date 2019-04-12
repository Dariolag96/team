public class Player extends Person {


    public abstract String role;
    public abstract int numberOfUniform;

    public Player (String role, String numberOfUniform, String name, String surname){
        super (name,surname);
        this.role=role;
        this.numberOfUniform=numberOfUniform;
    }
}
