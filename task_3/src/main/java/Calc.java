public class Calc {
    private Sum sum;
    private Div div;
    private Mult mult;
    private Quotient quotient;

    public Calc (char op, double a, double b){
        switch (op){
            case '+':
                sum = new Sum(a, b);
                System.out.println(sum.getResult());
                break;
            case '-':
                div = new Div(a, b);
                System.out.println(div.getResult());
                break;
            case '*':
                mult = new Mult(a, b);
                System.out.println(mult.getResult());
                break;
            case '/' :
                quotient = new Quotient(a, b);
                System.out.println(quotient.getResult());
                break;
            default:
                sum = new Sum (a, b);
                System.out.println(sum.getResult());
                break;
        }
    }

    public void setSum(Sum sum) {
        this.sum = sum;
    }

    public Sum getSum() {
        return sum;
    }

    public void setDiv(Div div) {
        this.div = div;
    }

    public Div getDiv() {
        return div;
    }

    public void setMult(Mult mult) {
        this.mult = mult;
    }
}
