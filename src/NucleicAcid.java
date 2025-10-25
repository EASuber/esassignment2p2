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
        System.out.printf("\tChemical formula - %s\n",ChemicalFormula);
        System.out.printf("\tMolar mass - " + Molarmass + " g/mol\n");
        System.out.printf("\tDensity - " + Density + " g/cm3\n\n");
    }


}

/*
Enter your Nucleic Acid name: Cytosine
What is the chemical formula?: C4H5N3O
What is the molar mass?: 111.10
What is the density?: 1.55

Enter your Nucleic Acid name: Adenine
What is the chemical formula?: C5H5N5
What is the molar mass?: 135.13
What is the density?: 1.6

Enter your Nucleic Acid name: Guanine
What is the chemical formula?: C5H5N5O
What is the molar mass?: 151.13
What is the density?: 2.200

Enter your Nucleic Acid name: Thymine
What is the chemical formula?: C5H6N2O2
What is the molar mass?: 126.115
What is the density?: 1.223

Enter your Nucleic Acid name: Uracil
What is the chemical formula?: C4H4N2O2
What is the molar mass?: 112.08676
What is the density?: 1.32

Cytosine
	Chemical formula - C4H5N3O
	Molar mass - 111.1 g/mol
	Density - 1.55 g/cm3

Adenine
	Chemical formula - C5H5N5
	Molar mass - 135.13 g/mol
	Density - 1.6 g/cm3

Guanine
	Chemical formula - C5H5N5O
	Molar mass - 151.13 g/mol
	Density - 2.2 g/cm3

Thymine
	Chemical formula - C5H6N2O2
	Molar mass - 126.115 g/mol
	Density - 1.223 g/cm3

Uracil
	Chemical formula - C4H4N2O2
	Molar mass - 112.08676 g/mol
	Density - 1.32 g/cm3


Process finished with exit code 0
 */