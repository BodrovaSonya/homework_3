public class Calc {
    private Sum sum;
    private Div div;

    public Calc (char op, double a, double b){
        switch (op){
            case '+':
                sum = new Sum(a, b);
                System.out.println(sum.getResult());
                break;
            case '-':
                div = new Div(a, b);
                System.out.println(div.getResult());
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
}
