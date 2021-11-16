import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
    private String word;
    private String unknown;

    public Puzzle(){
        word = "kowabunga";
        unknown = "";
        for(int i = 0; i != word.length(); i++){
            unknown += "_";
        }
    }

    public boolean isUnsolved(){
        return true;
    }

    public void show(){ 
        System.out.print("Puzzle: " + unknown + "\n");
        
        
        System.out.print("Guesses: ");
        
    }

    public boolean makeGuess(String g){
        for(int i = 0; i < word.length(); i++){
            if(g.equals(word.substring(i,i+1))){
                return true;
            }
        }
        return false;
    }

    public String getWord(){
        return word;
    }
}
