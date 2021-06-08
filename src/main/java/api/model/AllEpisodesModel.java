package api.model;

import java.util.List;

public class AllEpisodesModel {

    InfoModel info;
    List<EpisodeModel> results;
    private String url;
    private String created;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public InfoModel getInfo() {
        return info;
    }

    public void setInfo(InfoModel info) {
        this.info = info;
    }

    public List<EpisodeModel> getResults() {
        return results;
    }

    public void setResults(List<EpisodeModel> results) {
        this.results = results;
    }
}