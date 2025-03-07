package ABc;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiCalls {




   // "https://retargetcommon.free.beeceptor.com/getToolName"
    public Response getToolName()
    {
       return RestAssured.given().log().all()
                .when()
                .get("https://retargetcommon.free.beeceptor.com/getToolName")
                .then().log().all().extract().response();
    }


}
