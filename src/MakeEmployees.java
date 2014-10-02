import TerminalIO.*;

public class MakeEmployees {

    
    public static void main(String[] args) {
        KeyboardReader kr = new KeyboardReader();
        String name = kr.readLine("Enter name ->");
        System.out.println("The name is: "+ name);
        
        System.out.println("This is another line");
    }
    
}
