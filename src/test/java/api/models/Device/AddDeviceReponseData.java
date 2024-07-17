
package api.models.Device;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddDeviceReponseData implements Serializable
{

    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("CPU model")
    @Expose
    private String cPU_model;
    @SerializedName("Hard disk size")
    @Expose
    private String hard_disk_size;
    private final static long serialVersionUID = 5279692672569704093L;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCPU_model() {
        return cPU_model;
    }

    public void setCPU_model(String cPU_model) {
        this.cPU_model = cPU_model;
    }

    public String getHard_disk_size() {
        return hard_disk_size;
    }

    public void setHard_disk_size(String hard_disk_size) {
        this.hard_disk_size = hard_disk_size;
    }

}
