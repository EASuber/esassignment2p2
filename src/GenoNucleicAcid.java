import java.util.Scanner;

public class GenoNucleicAcid {

    static Scanner s1 = new Scanner(System.in);

    public NucleicAcid input(){ //input questions

        System.out.print("Enter your Nucleic Acid name: ");
        String name = s1.next();

        System.out.print("What is the chemical formula?: ");
        String ChemicalFormula = s1.next();

        System.out.print("What is the molar mass?: ");
        float Molarmass = s1.nextFloat();

        System.out.print("What is the density?: ");
        float Density = s1.nextFloat();

        System.out.print("\n");

        return new NucleicAcid(name, ChemicalFormula, Molarmass, Density);
    }


    public void main(){ //driver
        //inputs
        NucleicAcid acid1 = input();
        NucleicAcid acid2 = input();
        NucleicAcid acid3 = input();
        NucleicAcid acid4 = input();
        NucleicAcid acid5 = input();

        //outputs
        acid1.print();
        acid2.print();
        acid3.print();
        acid4.print();
        acid5.print();
    }


}
