import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String [] arr = new String[15];
        Menu menu = new Menu();

        while (!menu.theEndProgram){
            menu.mainMenu();
           arr =  menu.action(arr);
        }
    }
}
