package com.golhero.golheroservice.domain.model;

import com.golhero.golheroservice.application.command.MatchResultPredictionCmd;

public interface MatchResultPredictionClient {

    public int predict(MatchResultPredictionCmd cmd);

}
