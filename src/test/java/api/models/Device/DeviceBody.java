
package api.models.Device;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeviceBody implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("data")
    @Expose
    private DeviceBodyData deviceBodyData;
    private final static long serialVersionUID = 5162163236366843031L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceBodyData getData() {
        return deviceBodyData;
    }

    public void setData(DeviceBodyData deviceBodyData) {
        this.deviceBodyData = deviceBodyData;
    }

}
