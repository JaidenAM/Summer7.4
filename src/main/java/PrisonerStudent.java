//Section 7, Lesson 4 Starter for Exercise 2 - Slide 14

public class PrisonerStudent {
    //Fields
    public String name;
    public double height;
    public int sentence;

    //Constructor
    public PrisonerStudent(String name, double height, int sentence){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }
    public  PrisonerStudent(String name, double height, int sentence, boolean c){
        if(c == true){
            think();
        }
    }
    //Methods

    public void think(){
        System.out.println("I'll have my revenge.");
    }



}
