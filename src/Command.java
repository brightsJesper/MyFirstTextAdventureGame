package src;

import java.util.ArrayList;
import java.util.List;

public class Command {
    String input;
    List<String> altList = new ArrayList<>();
    static List<Command> commands = new ArrayList<>();
    public Command(String input){
       this.input = input;
   }
   void Init(){
       Command inv=new Command("inventory");
       commands.add(inv);
       Command invest=new Command("investigate");
       commands.add(invest);
   }

   }
