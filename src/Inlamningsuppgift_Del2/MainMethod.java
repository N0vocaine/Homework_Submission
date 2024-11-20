package Inlamningsuppgift_Del2;
//Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.
//När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit,
// exklusive raden med ordet stop

//Programmet skall bestå av två klasser:
//En klass som läser in text och skriver ut resultatet till användaren
//En annan klass som räknar raderna och har koll på antalet tecken
//Kontrollen för att ha koll på om användaren har skrivit ordet stop eller inte får utföras i vilken av klasserna man vill

//Till programmet skall minst tre Junit-testfall skrivas
//Testfallen skall skilja sig märkvärt åt och testa olika delar av programmet

public class MainMethod {
    public static void main(String[] args) {
        TextCounter counter = new TextCounter();
        TextReader reader = new TextReader(counter);
        reader.startReading();
    }
}
