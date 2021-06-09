package ar.steps;

import api.model.AllEpisodesModel;
import api.model.EpisodeModel;
import ar.validator.ValidateEpisode;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import services.AllEpisodeServices;

import java.util.Random;

public class RickAndMortySteps extends PageSteps {


    @And("extract info need for get a episode aleatory")
    public void extractInfoNeedForGetAEpisodeAleatory() {
        AllEpisodesModel response = (AllEpisodesModel) APIManager.getLastResponse().getResponse();
        Integer size = response.getResults().size();
        Random random = new Random();
        EpisodeModel episode = response.getResults().get(random.nextInt(size));
        AllEpisodeServices.ID.set(episode.getId().toString());
        AllEpisodeServices.NAME.set(episode.getName());
        AllEpisodeServices.EPISODE.set(episode.getEpisode());
        AllEpisodeServices.AIR_DATE.set(episode.getAirDate());
    }

    @And("the values correspond to the episode requested")
    public void theValuesCorrespondToTheEpisodeRequested() {
        ValidateEpisode.validate();
    }
}
