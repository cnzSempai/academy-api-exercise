package ar.validator;

import api.model.EpisodeModel;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
import services.AllEpisodeServices;
import services.CharacterService;
import services.EpisodeServices;

public class ValidateEpisode {
    public  static void validate(){
        EpisodeModel response= (EpisodeModel)APIManager.getLastResponse().getResponse();
        Assert.assertEquals(response.getName(), AllEpisodeServices.NAME.get());
        Assert.assertEquals(response.getAirDate(), AllEpisodeServices.AIR_DATE.get());
        Assert.assertEquals(response.getEpisode(), AllEpisodeServices.EPISODE.get());
    }
}
