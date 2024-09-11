package pr_4;

public enum List_of_Seasons {
    SUMMER(20.7) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    WINTER(-5.7),
    AUTUMN(12.6),
    SPRING(10.0);
    private double t;
    private List_of_Seasons(double t) {
        this.t = t;
    }

    public double getT() {
        return t;
    }

    public String getDescription() {
        return "Холодное время года";
    }

}


