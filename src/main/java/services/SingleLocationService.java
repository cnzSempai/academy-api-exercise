package services;

import api.model.Results;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.Map;

public class SingleLocationService extends MethodsService {

    public static Response get(String jsonName, Map<String, String> parameters) {
        return get(jsonName, Results.class, parameters);
    }
}
