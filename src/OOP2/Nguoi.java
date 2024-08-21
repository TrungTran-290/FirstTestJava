package OOP2;

public interface Nguoi {
    void EarnScore();
    default int LoseScore(int tuoi){
        return tuoi;
    }
}