
package api.models.Device;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddDeviceResponse implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("data")
    @Expose
    private AddDeviceReponseData addDeviceReponseData;
    private final static long serialVersionUID = 556354537708797649L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public AddDeviceReponseData getData() {
        return addDeviceReponseData;
    }

    public void setData(AddDeviceReponseData addDeviceReponseData) {
        this.addDeviceReponseData = addDeviceReponseData;
    }

}
