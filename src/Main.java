
public class Main {
    public static void main (String[] args) {

//      Opdracht alleen uitgewerkt voor ElectricPokemon, de andere werken hetzelfde
//      Wat betreft de bonus uitwerkingen:
//      Een abstracte klasse zou gebruikt kunnen worden maar het is beter gemeenschappelijke variabelen en methoden in de superklasse eenmalig in de superklasse uit te
//      werken. In de abstracte klasse zouden de vereisten variabelen en methoden voor de subklasse gedefineerd worden maar hier kan geen instantie van gemaakt worden
//      Om meerdere types mee te geven zal gebruik moeten worden gemaakt van interfaces.

        ElectricPokemon elec = new ElectricPokemon("Jan", 4, 5, 6, 7,"aardappel", "tune", true, true, "blue", 220);

        System.out.println(elec.getVoltage());
        System.out.println(elec.getName());
        System.out.println(elec.getColor());
        System.out.println(elec.eats("french fries"));
    }
}