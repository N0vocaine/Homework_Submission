package Inlamningsuppgift_del3;
//Vidareutveckla ditt program i del 2 så att programmet även gör följande:

//Skriver ut antal ord (separerade med blanksteg)
//Skriver ut det längsta ordet

//Kontrollen om användaren har skrivit ordet stop eller inte måste ligga i den andra ”logik-klassen”
// Programmet skall fortfarande bestå av två klasser:
//En klass som läser in text och skriver ut resultatet till användaren
//En annan klass som:
//Räknar raderna, antal tecken och antal ord
//Har koll på det längsta ordet
//Har koll på om användaren har skrivit ordet stop eller inte Programmet skall fortfarande ha minst 3 testfall

public class MainMethod {
    public static void main(String[] args) {
        TextCounter counter = new TextCounter();
        TextReader reader = new TextReader(counter);
        reader.startReading();

    }
}

