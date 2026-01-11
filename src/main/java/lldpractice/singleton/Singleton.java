package lldpractice.singleton;

public class Singleton {
    public static void main(String[] args) {
        DatabaseConnection connection1, connection2; // X  block use of constructor
        connection1 = DatabaseConnection.getInstance();
        connection2 = DatabaseConnection.getInstance();

        if(connection2==connection1){
            System.out.println("Same object");
        }
        else{
            System.out.println("Objects are different");
        }


    }
}
