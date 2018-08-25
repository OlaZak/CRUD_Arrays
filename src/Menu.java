import java.util.Scanner;

public class Menu {

    Redactor redactor = new Redactor();
    boolean theEndProgram = false;

    public String [] action (String [] arr){
        String actions = readConsoleValue();

        if (actions.equalsIgnoreCase("c"))
           arr=  createElement(arr);
        else if (actions.equalsIgnoreCase("r"))
            readElement(arr);
        else if (actions.equalsIgnoreCase("u"))
            arr = updateElement(arr);
        else if (actions.equalsIgnoreCase("d"))
            arr=deleteElement(arr);
        else if (actions.equalsIgnoreCase("exit"))
              theEndProgram =checkEndProgram();
        else {System.out.println("Incorrect answer. Please try again");}


    return arr;
    }

    public void mainMenu(){
        System.out.println("---------- Menu ----------\n" + "Please choose the actions : \n" +
                            "c - create\n" + "r - read\n" + "u - update\n"
                            + "d - delete\n" + "exit - exit from program");
    }

    public String [] createElement(String [] arr){
        System.out.println("Please enter the value for create element: ");
        String value = readConsoleValue();
        arr =redactor.create(arr,value);
        return arr;
    }

    public void readElement(String [] arr){
        redactor.read(arr);
    }

    public String [] updateElement(String [] arr){
        System.out.println("Please enter the new value for update element: ");
        String value = readConsoleValue();
        System.out.println("Please enter the index(only numbers): ");
        int index = Integer.parseInt(readConsoleValue());

        arr = redactor.update(arr,index,value);
        return arr;
    }

    public String [] deleteElement(String[] arr){
        System.out.println("Please enter the index for delete element (only numbers): ");
        int index = Integer.parseInt(readConsoleValue());
        arr = redactor.delete(arr,index);
        return arr;
    }

    public String readConsoleValue(){
        String value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        return value;
    }

    public boolean checkEndProgram() {
        System.out.println("Do you want to exit: y - yes, n - no .Please enter your answer: ");
        String answer = readConsoleValue();
        switch (answer){
            case "y" : System.out.println("You exit from program: ");
                        return true;
            case "n" : return  false;
            default: return  false;



    }}
    }

