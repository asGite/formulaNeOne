package org.marrtys.project;

import org.marrtys.project.element.FormulaElement;
import org.marrtys.project.element.NumberElement;
import org.marrtys.project.element.Operand;

import java.util.ArrayList;
import java.util.List;

public class FormulaParser {

    double pars(String text) {

        // " 5.6 + 5"
        text = text.trim();
        // "5.6 + 5"


        String[] items = text.split(" ");
        // {"5.6" "+" "5"}

        List<FormulaElement> elements = new ArrayList<>();

        for (String item : items) {
            System.out.println(item);
            // + -
            if ("+".equals(item) || "-".equals(item)) {

                Operand opr = new Operand(item);

                elements.add(opr);

            } else {

                NumberElement shfasdjfh = new NumberElement(item);

                elements.add(shfasdjfh);


            }
        }

        // Prisidedam 0 jei prasideda operandu

        FormulaElement pirmasElementas = elements.get(0);
        if (pirmasElementas instanceof Operand) {
            elements.add(new NumberElement("0"));
        }

        double result = 0;

        boolean isOperand = false;
        double operValue = 1;

        for (FormulaElement formElementas : elements) {

            if (isOperand) {

                Operand oper = (Operand) formElementas;
                if ("+".equals(oper.getElement())) {
                    operValue = +1;
                } else {
                    operValue = -1;
                }


            } else {
                result = result + operValue * ((NumberElement) formElementas).getDouble();
            }

            isOperand = !isOperand;
        }


        return result;


    }


}


