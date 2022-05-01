// https://www.codecademy.com/courses/learn-java/projects/java-language-families
// Q1 start the class build instance and main()
class Language {
    // instances
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    // constructor //Q2
    Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    // methods
    // Q3
    public void getInfo() {
        System.out.println(name+" is spoken by "+numSpeakers+" people mainly in "+regionsSpoken+".");
        System.out.println("The language follows the word order: "+wordOrder+".");
    }

    public static void main(String[] args) {
        // Q4
        Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
        spanish.getInfo();


        // Q8 testing Mayan Class
        System.out.println();
        Language chontal = new Mayan("Chontal", 36810);

        chontal.getInfo();

        // Q12 test 1 with Chinese and 1 without
        System.out.println();
        Language mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        mandarin.getInfo();

        System.out.println();
        Language burmese = new SinoTibetan("Burmese", 43000000);
        burmese.getInfo();


    }
}