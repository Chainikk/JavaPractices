package pr_3;

public class Currency_Convertor {
    private Double euro;
    private Double dollar;

    public Currency_Convertor(Double euro, Double dollar){
        this.euro = euro;
        this.dollar = dollar;
    }
    public Double getEuro() {
        return euro;
    }
    public Double getDollar() {
        return dollar;
    }
    public void setEuro(Double euro) {
        this.euro = euro;
    }
    public void setDollar(Double dollar) {
        this.dollar = dollar;
    }
    @Override
    public String toString() {
        return "Currency_Convertor{" +
                "euro=" + euro +
                ", dollar=" + dollar +
                '}';
    }
    public Double EuroToRuble(Double euro){
        return euro * this.euro;
    }
    public Double RubleToEuro(Double ruble){
        return ruble / this.euro;
    }
    public Double DollarToRuble(Double dollar){
        return dollar * this.dollar;
    }
    public Double RubleToDollar(Double ruble){
        return ruble / this.dollar;
    }
}
