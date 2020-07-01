package playground.springconfig;

public class AnotherBean {

    private static int id = 0;

    private String dataText;

    public AnotherBean() {
        ++id;
        System.out.println("> construct AnotherBean");
    }

    public String getDataText() {
        return dataText;
    }

    public void setDataText(String dataText) {
        this.dataText = dataText;
        System.out.println("> setDataText AnotherBean: " + dataText);
    }

    @Override
    public String toString() {
        return "AnotherBean{" +
                "id='" + id + "', " +
                "dataText='" + dataText + '\'' +
                '}';
    }
}
