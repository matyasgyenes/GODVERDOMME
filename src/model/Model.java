package model;

import java.util.Random;

//Geen UI code
//Logica!
public class Model {
    private boolean blnQuiz = false;
    private String strMode;
    private String strContinent;
    private String strLand;
    private String strHoofdstad;
    private boolean blTest;
    private int counter;
    private Random random = new Random();
    private boolean blVervangTest;

    /*
        EEN 2 DIMENSIONALE ARRAY PER CONTINENT MET DAARIN ALLE LANDEN EN HOOFDSTEDEN INT HET CONTINENT
     */
    //2 DIM ARRAY MET ALLE AFRIKAANSE LANDEN EN HOOFDSTEDEN
    private String[][] strLandenEnHooftstedenAf = {
            {"Algerije","Angola","Benin","Botswana","Burkina Faso","Burundi","Centraal-Afrikaanse Republiek","Comoren","Congo-Brazzaville","Congo-Kinshasa","Djibouti","Egypte","Equatoriaal-Guinea","Eritrea","Ethiopië","Gabon","Gambia","Ghana","Guinee","Guinee-Bissau","Ivoorkust","Kaapverdië","Kameroen","Kenia","Lesotho","Liberia","Libië","Madagaskar","Malawi","Mali","Marokko","Mauritanië","Mauritius","Mozambique","Namibië","Niger","Nigeria","Oeganda","Rwanda","Sao Tomé en Principe","Senegal","Seychellen","Sierra Leone","Soedan","Somalië","Swaziland","Tanzania","Togo","Tsjaad","Tunesië","Zambia","Zimbabwe","Zuid-Afrika","Zuid-Soedan"},
            {"Algiers","Luanda","Porto-Novo","Gaborone","Ouagadougou","Gitega","Bangui","Moroni","Brazzaville","Kinshasa","Djibouti","Caïro","Malabo","Asmara","Addis Abeba","Libreville","Banjul","Accra","Conakry","Bissau","Yamoussoukro","Praia","Yaoundé","Nairobi","Maseru","Monrovia","Tripoli","Antananarivo","Lilongwe","Bamako","Rabat","Nouakchott","Port Louis","Maputo","Windhoek","Niamey","Abuja","Kampala","Kigali","Sao Tomé","Dakar","Victoria","Freetown","Khartoem","Mogadishu","Lobamba","Dodoma","Lomé","Ndjamena","Tunis","Lusaka","Harare","Kaapstad","Djoeba"},
            {"/Maps Afrika/Algerije.png","/Maps Afrika/Angola.png","/Maps Afrika/Benin.png","/Maps Afrika/Botswana.png","/Maps Afrika/Burkina Faso.png","/Maps Afrika/Burundi.png","/Maps Afrika/Centraal-Afrikaanse Republiek.png","/Maps Afrika/Comoren.png","/Maps Afrika/Congo-Brazzaville.png","/Maps Afrika/Congo-Kinshasa.png","/Maps Afrika/Djibouti.png","/Maps Afrika/Egypte.png","/Maps Afrika/Equatoriaal-Guinea.png","/Maps Afrika/Eritrea.png","/Maps Afrika/Ethiopië.png","/Maps Afrika/Gabon.png","/Maps Afrika/Gambia.png","/Maps Afrika/Ghana.png","/Maps Afrika/Guinee.png","/Maps Afrika/Guinee-Bissau.png","/Maps Afrika/Ivoorkust.png","/Maps Afrika/Kaapverdië.png","/Maps Afrika/Kameroen.png","/Maps Afrika/Kenia.png","/Maps Afrika/Lesotho.png","/Maps Afrika/Liberia.png","/Maps Afrika/Libië.png","/Maps Afrika/Madagaskar.png","/Maps Afrika/Malawi.png","/Maps Afrika/Mali.png","/Maps Afrika/Marokko.png","/Maps Afrika/Mauritanië.png","/Maps Afrika/Mauritius.png","/Maps Afrika/Mozambique.png","/Maps Afrika/Namibië.png","/Maps Afrika/Niger.png","/Maps Afrika/Nigeria.png","/Maps Afrika/Oeganda.png","/Maps Afrika/Rwanda.png","/Maps Afrika/Sao Tomé en Principe.png","/Maps Afrika/Senegal.png","/Maps Afrika/Seychellen.png","/Maps Afrika/Sierra Leone.png","/Maps Afrika/Soedan.png","/Maps Afrika/Somalië.png","/Maps Afrika/Swaziland.png","/Maps Afrika/Tanzania.png","/Maps Afrika/Togo.png","/Maps Afrika/Tsjaad.png","/Maps Afrika/Tunesië.png","/Maps Afrika/Zambia.png","/Maps Afrika/Zimbabwe.png","/Maps Afrika/Zuid-Afrika.png","/Maps Afrika/Zuid-Soedan.png"},

    };
    //2 DIM ARRAY MET ALLE EUROPESE LANDEN EN HOOFDSTEDEN
    private String[][] strLandenEnHooftstedenEu = {
            {"Albanië","Andorra","Armenië","Azerbeidzjan","België","Bosnië en Herzegovina","Bulgarije","Cyprus","Denemarken","Duitsland","Estland","Finland","Frankrijk","Georgië","Griekenland","Hongarije","Ierland","Ijsland","Italië","Kazachstan","Kosovo","Kroatië","Letland","Liechtenstein","Litouwen","Luxemburg","Noord-Macedonië","Malta","Moldavië","Monaco","Montenegro","Nederland","Noorwegen","Oekraïne","Oostenrijk","Polen","Portugal","Roemenië","Rusland","San Marino","Servië","Slovenië","Slowakije","Spanje","Tsjechië","Turkije","Vaticaanstad","Verenigd Koninkrijk","Wit-Rusland","Zweden","Zwitserland"},
            {"Tirana","Andorra la Vella","Jerevan","Bakoe","Brussel","Sarajevo","Sofia","Nicosia","Kopenhagen","Berlijn","Tallinn","Helsinki","Parijs","Tbilisi","Athene","Boedapest","Dublin","Reykjavik","Rome","Astana","Pristina","Zagreb","Riga","Vaduz","Vilnius","Luxemburg","Skopje","Valletta","Chisinau","Monaco","Podgorica","Amsterdam","Oslo","Kiev","Wenen","Warschau","Lissabon","Boekarest","Moskou","San Marino","Belgrado","Ljubljana","Bratislava","Madrid","Praag","Ankara","Vaticaanstad","Londen","Minsk","Stockholm","Bern"}
    };



    //hoofdstadTest krijgt een string mee met het random landen en een 2 dimensionale array voor het werelddeel
    public boolean hoofdstadTest(String strLand, String[][] strLandenEnHoofdsteden){
        for (counter = 0 ; counter < strLandenEnHoofdsteden[0].length; counter++)
            if ( strLandenEnHoofdsteden[0][counter].equals(strLand))
            {
                break;
            }
            try {
                if(strHoofdstad.equals(strLandenEnHoofdsteden[1][counter]))
                {
                blTest = true;
                }
                else{
                blTest = false;
                }
            }
            catch (Exception e){
                blTest = false;
                System.out.println(e.getMessage());
            }
        return blTest;
    }

    //SETTERS
    public void setBlnQuiz(boolean blnQuiz) { this.blnQuiz = blnQuiz; }
    public void setStrMode(String strMode) { this.strMode = strMode; }
    public void setStrContinent(String strContinent) { this.strContinent = strContinent; }
    public void setStrLand(String strLand) { this.strLand = strLand; }
    public void setStrHoofdstad(String strHoofdstad) { this.strHoofdstad = strHoofdstad; }
    public void setBlVervangTest(boolean blVervangTest) { this.blVervangTest = blVervangTest; }

    //GETTERS
    public boolean isBlnQuiz() { return blnQuiz; }
    public boolean isBlVervangTest() { return blVervangTest; }
    public String getStrMode() { return strMode; }
    public String getStrContinent() { return strContinent;}
    public String[][] getStrLandenEnHooftstedenAf() { return strLandenEnHooftstedenAf; }
    public String[][] getStrLandenEnHooftstedenEu() { return strLandenEnHooftstedenEu; }

    public String getRandStrHoofdstad() {
        //Als het gekozen werelddeel afrika is zoek dan naar een random hoofdstad in de array van Afrikaanse landen en hoofdsteden
        if(strContinent.equals("afrika")){
            setStrHoofdstad(strLandenEnHooftstedenAf[1][random.nextInt(strLandenEnHooftstedenAf[0].length)]);
        }
        //Als het gekozen werelddeel europa is zoek dan naar een random hoofdstad in de array van Europese landen en hoofdsteden
        else if(strContinent.equals("europa")){
            setStrHoofdstad(strLandenEnHooftstedenEu[1][random.nextInt(strLandenEnHooftstedenEu[0].length)]);
        }

        //Geef de hoofdstad terug.
        return strHoofdstad;
    }

}
