package model;
//Geen UI code
//Logica!
public class Model {
    public boolean blnQuiz = false;
    public String strMode;
    public String strContinent;

    //SETTERS
    public void setBlnQuiz(boolean blnQuiz) {
        this.blnQuiz = blnQuiz;
    }

    public void setStrMode(String strMode) {
        this.strMode = strMode;
    }

    public void setStrContinent(String strContinent) {
        this.strContinent = strContinent;
    }

    //GETTERS
    public boolean isBlnQuiz() {
        return blnQuiz;
    }

    public String getStrMode() {
        return strMode;
    }

    public String getStrContinent() {
        return strContinent;
    }
}
