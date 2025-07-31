public class TrenaryOperator {
    public static void main(String[] args){

        // trenary operator ? = Return 1 or 2 values if a conditon is true

        //variable = (condition) ? ifTrue : ifFalse;

        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);

    }
}
