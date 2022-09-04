package mywork.conditionalOperator;

import mywork.conditionalOperator.doop.DoOperator;
import mywork.conditionalOperator.forop.ForOperator;
import mywork.conditionalOperator.whileop.WhileOperator;

public class Main {
    public static void main(String[] args) {
        ForOperator forOp = new ForOperator();
        forOp.forOperators2();

        forOp.forOperators();
        forOp.forOperators1();

        DoOperator doOp = new DoOperator();
        doOp.doOperators();

        WhileOperator whileOp = new WhileOperator();
        whileOp.whileOperators();
    }
}
