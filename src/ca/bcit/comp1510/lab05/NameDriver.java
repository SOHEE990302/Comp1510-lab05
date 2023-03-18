package ca.bcit.comp1510.lab05;

/**
 * <p>Tests if the Name class works.</p>
 *
 * @author Sohee Hwang
 * @version 2023
 */
public class NameDriver {

    /**
     * <p>Drives the program.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        //Creates a Name object
        Name myName = new Name("Sohee", "", "Hwang");
        
        //tests the methods in Name class
        //sumLengths()
        System.out.println(myName.nameLengths());
        //nameUppercase()
        System.out.println(myName.nameUppercase());
        //getNCharacter()
        final int nth = 5;
        System.out.println(myName.getCharacter(nth));
        //fullName()
        System.out.println(myName.fullName());
        //isEqual()
        System.out.println(myName.isEqual("Sohee"));
        //isEqualtoNameObj()
        System.out.println(myName.isEqualtoNameObj(myName));
    }

}
