// Q9 extends
class SinoTibetan extends Language {

    // Q10, Q11 check if the name contains chinese
    SinoTibetan(String langName, int numSpeakers) {
        super(langName, numSpeakers, "Asia", "subject-object-verb");
        if (langName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }
}