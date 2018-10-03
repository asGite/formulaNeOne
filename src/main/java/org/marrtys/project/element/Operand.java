package org.marrtys.project.element;

public class Operand implements FormulaElement {

    private String operand;

    @Override
    public String getElement() {
        return operand;
    }

    public double doOperation(double nb1 , double nb2) {

        if ("+".equals(operand)) {
            return nb1 + nb2;
        } else {
            return nb1 - nb2;
        }


    }


    public Operand (String element) {

        operand = element;


    }



}


