package playground.springconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("Data")
@ConfigurationProperties("data")
public class Data {

    private static int id = 10;

    private String dataText;

    public Data() {
        ++id;
        System.out.println("> construct Data");
    }

    public String getDataText() {
        return dataText;
    }

    public void setDataText(String dataText) {
        this.dataText = dataText;
        System.out.println("> setDataText Data: " + dataText);
    }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + "', " +
                "dataText='" + dataText + '\'' +
                '}';
    }
}
