package ar.validator;

import api.model.EpisodeModel;
import api.model.Results;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
import services.AllEpisodeServices;
import services.MultipleLocationServices;

public class ValidateLocation {
    public  static void validateLoc(){
        Results response= (Results) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(response.getId(), MultipleLocationServices.ID.get());
        Assert.assertEquals(response.getName(), MultipleLocationServices.NAME.get());
        Assert.assertEquals(response.getType(), MultipleLocationServices.TYPE.get());
        Assert.assertEquals(response.getDimension(), MultipleLocationServices.DIMENSION.get());
        Assert.assertEquals(response.getUrl(), MultipleLocationServices.URL.get());
        Assert.assertEquals(response.getCreated(), MultipleLocationServices.CREATED.get());
    }
}
