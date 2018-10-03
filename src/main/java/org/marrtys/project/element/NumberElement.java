package org.marrtys.project.element;

public class NumberElement implements FormulaElement {
    private double number;

    @Override
    public String getElement() {
        return "" +number;
    }

    public double getDouble() {
        return number;
    }

    public NumberElement (String element) {

        number = Double.parseDouble(element);


    }
}