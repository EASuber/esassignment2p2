import java.util.Scanner;

public class GenoNucleicAcid {

    static Scanner s1 = new Scanner(System.in);

    public NucleicAcid input(){

        System.out.print("Enter your Nucleic Acid name: ");
        String name = s1.next();

        System.out.print("What is the chemical formula?: ");
        String ChemicalFormula = s1.next();

        System.out.print("What is the molar mass?: ");
        float Molarmass = s1.nextFloat();

        System.out.printf(Molarmass+"\n");

        System.out.print("What is the density?: ");
        float Density = s1.nextFloat();

        System.out.print("\n");

        return new NucleicAcid(name, ChemicalFormula, Molarmass, Density);
    }


    public void main(){
        NucleicAcid acid1 = input();
        acid1.print();
        NucleicAcid acid2 = input();
        acid2.print();
        NucleicAcid acid3 = input();
        acid3.print();
    }
}
