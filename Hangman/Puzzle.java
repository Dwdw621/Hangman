import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
    private String word;
    private String unknown;
    private String wrong;

    public Puzzle(){
        word = "kowabunga";
        unknown = "";
        wrong = "";
        for(int i = 0; i != word.length(); i++){
            unknown += "_";
        }
    }

    public boolean isUnsolved(){
        return true;
    }

    public void show(){ 
        System.out.print("Puzzle: " + unknown + "\n");
        System.out.print("Guesses: " + wrong);

    } 

    public boolean makeGuess(String guess){
        if(word.contains(guess)){
            for(int i = 0; i < word.length(); i++){
                if(word.substring(i, i+1).equals(guess)){
                    unknown.replace
                }
            }

        } else {
            wrong += guess + ", ";
        }

        return word.contains(guess);
    }

    public String getWord(){
        return word;
    }
}
