public class Main {
    public static void main (String args[]){
        System.out.println("sono in questo main");
        Player p = new Player ("attaccante", 2, "dario", "laganà");
        System.out.println( p instanceof Player);
        System.out.println(p instanceof Person);
    }
}
