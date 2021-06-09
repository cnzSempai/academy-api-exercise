package services;

import api.model.LocationsModel;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class AllLocationsServices extends MethodsService {

    public static Response get(String jsonName) {
        return get(jsonName, LocationsModel.class);
    }
}
