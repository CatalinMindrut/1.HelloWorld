public class Hello {
    public static void main(String[] args) { System.out.println("Hello Catalin!");
        /** Java automatically puts single statements on one line, this is called "code folding"
         * A variable is a place in memory that you can store something in.
         * In the code below, myFirstNumber, mySecondNumber are variables.
         * Variables need a data type, a name and optionally a value.*/

        int /**primitive data type*/ myFirstNumber /**variable*/ = /**operator*/ (10+5) + (2*10) /**expression*/;
        //myFirstNumber = variable
        int /**primitive data type*/ mySecondNumber /**variable*/ = /**operator*/ 12 /**literal*/;
        int myThirdNumber = 6;

        //Challenge
        int myTotal = myFirstNumber - mySecondNumber - myThirdNumber;
        int myResult = 1000 - myTotal;

        System.out.println(myTotal);
        System.out.println(myResult);
        /** System.out.println() or short "sout" outputs whatever
         *  information you have between the brackets, to the console. System output print line.*/
        System.out.println(myFirstNumber);
        System.out.println("myFirstNumber");
        /** Java considers anything inserted between double brackets to be a String. myFirstNumber, in white, with
         * no brackets is interpreted as being the variable defined earlier while "myFirsNumber" (green text) is
         * interpreted as being a string so Java will just output the characters inserted between the double brackets.

         Java is case sensitive, myNumber is different from MyNumber. All variables should start with a lower case.
         */
    }
}