package cloud.dawid.testrest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "http://80.211.79.203:8081/fruits/";

    @GET("all")
    Call<List<Fruit>> getFruits();


}
