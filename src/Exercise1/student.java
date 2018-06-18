package Exercise1;

public abstract class student {
    private String name;
    private int credits;

    public student(String name){
        this.name = name;
        credits =0;
    }
    public String getName(){
        return name;
    }
    boolean isFullTime(){
        return false;
    }
    int getCredits(){
        return credits;
    }
    void addCredits(int credits){
        this.credits += credits;
    }String $name;
}
