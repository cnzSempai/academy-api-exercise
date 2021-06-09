package services;

import api.model.AllEpisodesModel;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class AllEpisodeServices extends MethodsService {

    public static final ThreadLocal<String>ID= new ThreadLocal<String>();
    public static final ThreadLocal<String>AIR_DATE= new ThreadLocal<String>();
    public static final ThreadLocal<String>EPISODE= new ThreadLocal<String>();
    public static final ThreadLocal<String>NAME= new ThreadLocal<String>();

    public static Response get(String jsonName) {
        return get(jsonName, AllEpisodesModel.class);


    }
}
