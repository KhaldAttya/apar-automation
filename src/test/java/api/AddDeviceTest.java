package api;

import api.models.Device.AddDeviceResponse;
import api.models.Device.DeviceBody;
import api.models.Device.DeviceBodyData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddDeviceTest {

    @Test
    public void AddDeviceTest(){

        String baseUrl = "https://api.restful-api.dev";
        String addDeviceEnpoint = "/objects";
        String deviceName = "Pixel 8";
        Double price = 8000.0;
        Integer year = 2023;
        String cpu = "Tensor";
        String diskSize = "1TB";

        DeviceBody deviceBody = new DeviceBody();
        deviceBody.setName(deviceName);
        DeviceBodyData deviceBodyData = new DeviceBodyData();
        deviceBodyData.setPrice(price);
        deviceBodyData.setYear(year);
        deviceBodyData.setCPU_model(cpu);
        deviceBodyData.setHard_disk_size(diskSize);
        deviceBody.setData(deviceBodyData);

        AddDeviceResponse addDeviceResponse = RestAssured
                .given()
                .log().all()
                .contentType(ContentType.JSON)
                .body(deviceBody)
                .baseUri(baseUrl)
                .post(addDeviceEnpoint)
                .as(AddDeviceResponse.class);

        Assert.assertEquals(addDeviceResponse.getName(), deviceName);
        Assert.assertEquals(addDeviceResponse.getData().getPrice(), price);
        Assert.assertEquals(addDeviceResponse.getData().getYear(), year);
        Assert.assertEquals(addDeviceResponse.getData().getCPU_model(), cpu);
        Assert.assertEquals(addDeviceResponse.getData().getHard_disk_size(), diskSize);

        Assert.assertNotNull(addDeviceResponse.getId());
        Assert.assertNotNull(addDeviceResponse.getCreatedAt());

    }
}
