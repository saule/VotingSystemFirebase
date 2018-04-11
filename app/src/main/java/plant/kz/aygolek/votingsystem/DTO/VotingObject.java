package plant.kz.aygolek.votingsystem.DTO;

import java.util.HashMap;

public class VotingObject {
    int guid;
    String votingTopic;
    HashMap<String,Integer> options;

    public int getGuid() {
        return guid;
    }

    public void setGuid(int guid) {
        this.guid = guid;
    }

    public String getVotingTopic() {
        return votingTopic;
    }

    public void setVotingTopic(String votingTopic) {
        this.votingTopic = votingTopic;
    }

    public HashMap<String, Integer> getOptions() {
        return options;
    }

    public void setOptions(HashMap<String, Integer> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return guid+"  "+votingTopic+" VotingObject{" +
                "options=" + options +
                '}';
    }
}
