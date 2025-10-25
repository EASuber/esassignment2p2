/*
        Ethan Suber
        F25 CIS D035A 11Y, 62Z Java Programming
        10/26/25
        10/24/25
*/

public class NucleicAcid {

    private String name;
    private String ChemicalFormula;
    private float Molarmass;
    private float Density;

    NucleicAcid(){
        name = "";
        ChemicalFormula = "";
        Molarmass = 0;
        Density = 0;
    }

    NucleicAcid(String name, String ChemicalFormula, float Molarmass, float Density){
        this.name = name;
        this.ChemicalFormula = ChemicalFormula;
        this.Molarmass = Molarmass;
        this.Density = Density;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setChemicalFormula (String ChemicalFormula){
        this.ChemicalFormula = ChemicalFormula;
    }
    public void setMolarmass(float Molarmass){
        this.Molarmass = Molarmass;
    }
    public void setDensity(float Density){
        this.Density = Density;
    }

    public String getname(){
        return name;
    }
    public String getChemicalFormula() {
        return ChemicalFormula;
    }
    public float getMolarmass(){
        return Molarmass;
    }
    public float getDensity(){
        return Density;
    }

    public void print(){
        System.out.printf("%s\n",name);
        System.out.printf("\tChemical formula %s\n",ChemicalFormula);
        System.out.printf("\tMolar mass " + Molarmass + " g/mol\n");
        System.out.printf("\tDensity " + Density + " g/cm3\n\n");
    }



}

/*

 */