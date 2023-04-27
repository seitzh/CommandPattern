package vendors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StereoSystem{
    
    public String[] EssentialCDs = {
        "Selected Ambient Works 85-92", "My Favorite Things", "Love Deluxe", "Untrue", "Whats Going On", "Flamboyant", "Sketches of Spain" 
    };

    private Scanner kb;
    private ArrayList<String> CDs;
    private final String[] CDPlayer = new String[1];

    public StereoSystem()
    {
        CDPlayer[0] = " ";
        kb = new Scanner(System.in);
        this.CDs = new ArrayList<String>(Arrays.asList(EssentialCDs));
    }

    public void addCDToLibrary(String x)
    {
        this.CDs.add(x);
    }

    public void checkLibrary()
    {
        System.out.println("Here is your collection: ");
        for(int i = 0; i < CDs.size(); i++)
        {
            System.out.println(CDs.get(i));
        }
        System.out.print("\nOh my goodness your taste is impeccable! ヽ(°〇°)ﾉ\n");
    }
    
    public void insertCD(Scanner kb)
    {
        kb = new Scanner(System.in);
        System.out.print("\n");
        if(CDPlayer[0] == " ")
        {
        System.out.println("Choice a cd to insert from your library");
        int count = 1;
        for(int i = 0; i < CDs.size(); i++)
        {
            System.out.println("Option " + count + ": " + CDs.get(i));
            count++;
        }
        int enter = kb.nextInt();
        enter -= 1;
        this.CDPlayer[0] = CDs.get(enter); 
        CDs.remove(enter);

        }
        else
        {
            System.out.println("The Player already has something in it");
        }
        System.out.print("\n");
        //kb.close();
    }

    public void listen()
    {
        if(CDPlayer[0] != " ")
        {
        System.out.print("\n");
        System.out.println("You grab a green tea and listen to " + CDPlayer[0]);
        System.out.println("It was very relaxing");
        System.out.print("\n");
        }
        else
        {
            System.out.println("You don't have anything in the CD player! SILLY");
        }
    }

    public void ejectCD()
    {
        if(CDPlayer[0] != " ")
        {
        System.out.print("\n");
        CDs.add(CDPlayer[0]);
        CDPlayer[0] = " ";
        System.out.println("Ejecting...");
        System.out.print("\n");
        }
        else
        {
            System.out.println("There is not CD in the slot lol");
        }
    }

    //Just for testing
    /* 
    public static void main(String args[])
    {
        StereoSystem x = new StereoSystem();
        x.addCDToLibrary("Kind of Blue");
        x.insertCD();
        x.listen();
        x.checkLibrary();
        x.ejectCD();
        x.checkLibrary();
    }
    */

}
