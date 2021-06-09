package services;

import api.model.MultipleLocationModel;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.Map;

public class MultipleLocationServices extends MethodsService {
    public static final ThreadLocal<String>ID= new ThreadLocal<String>();
    public static final ThreadLocal<String>NAME= new ThreadLocal<String>();
    public static final ThreadLocal<String>TYPE= new ThreadLocal<String>();
    public static final ThreadLocal<String>DIMENSION= new ThreadLocal<String>();
    public static final ThreadLocal<String>URL= new ThreadLocal<String>();
    public static final ThreadLocal<String>CREATED= new ThreadLocal<String>();

    public static Response get(String jsonName, Map<String, String> parameter) {
        return get(jsonName, MultipleLocationModel.class,parameter);
    }
}
