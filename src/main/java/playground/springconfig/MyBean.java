package playground.springconfig;

public class MyBean {

    private static int id = 0;

    private String dataText;

    public MyBean() {
        ++id;
        System.out.println("> construct MyBean");
    }

    public String getDataText() {
        return dataText;
    }

    public void setDataText(String dataText) {
        this.dataText = dataText;
        System.out.println("> setDataText MyBean: " + dataText);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "id='" + id + "', " +
                "dataText='" + dataText + '\'' +
                '}';
    }
}
