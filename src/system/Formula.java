package system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Formula {

    public static final char OPEN_SYMBOL = '(';
    public static final char CLOSE_SYMBOL = ')';

    private String formula;

    public Formula(String formula) {
        this.formula = formula;
    }

    public String getFormula() {
        return formula;
    }

    public ArrayList<Integer> getWrongSymbolsPositions() {

        ArrayList<Integer> wrongSymbolsPositions = new ArrayList<Integer>();

        Stack<Symbol> stack = new Stack();

        for (int i = 0; i < formula.length(); i++) {
            if (formula.charAt(i) == OPEN_SYMBOL) {
                stack.push(new Symbol(OPEN_SYMBOL, i));
            }
            if (formula.charAt(i) == CLOSE_SYMBOL) {
                if (!stack.empty()) {
                    stack.pop();
                } else {
                    wrongSymbolsPositions.add(i);
                }
            }
        }
        while(!stack.empty()) {
            wrongSymbolsPositions.add(stack.pop().getPosition());
        }
        return wrongSymbolsPositions;
    }


    private class Symbol {
        private char symbol;
        private int position;

        public int getPosition() {
            return position;
        }

        private Symbol(char symbol, int position) {
            this.symbol = symbol;
            this.position = position;
        }
    }
}
