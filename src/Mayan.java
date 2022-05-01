// Q6 extends, constructor as its child class so super is used
class Mayan extends Language {

    // constructor
    Mayan(String langName, int numSpeakers) {
        super(langName, numSpeakers, "Central America", "verb-object-subject");
    }

    // Q7 including the last print statement
    @Override
    public void getInfo() {
        System.out.println(name+" is spoken by "+numSpeakers+" people mainly in "+regionsSpoken+".");
        System.out.println("The language follows the word order: "+wordOrder+".");

        System.out.println("Fun fact: "+name+ " is an ergative language.");
    }
}