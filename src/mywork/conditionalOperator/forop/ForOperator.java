package mywork.conditionalOperator.forop;

public class ForOperator {

    private static final int FIRSTVALUE = 0;
    private static final int SECONDVALUE = 6;

    public void forOperators() {
        for (int i = 1; i < 8; i++) {
            System.out.print(i + " чупапи муньяаньо!  ");
            if (i == 5) {  // если i = 5 то закончить на этом моменте оператор
                break;
            }
        }
        System.out.println();
    }

    public void forOperators1() {
        for (int i = FIRSTVALUE; i < SECONDVALUE; i++) {
            System.out.print(i + " * " + i + " = " + i * i + "!  ");
        }
        System.out.println();
    }

    public void forOperators2() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
            System.out.print("-----");
            System.out.println();
        }
        System.out.println();
    }

}
