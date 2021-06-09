package services;

import api.model.EpisodeModel;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class EpisodeServices extends MethodsService {



    public static Response get(String jsonName) {
        return get(jsonName, EpisodeModel.class,setParameters());

    }
    private static Map<String,String> setParameters(){
        Map<String,String> params = new HashMap<String,String>();
        params.put("episode",AllEpisodeServices.ID.get());
        return params;
    }


}

