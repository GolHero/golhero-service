package com.golhero.golheroservice.infrastructure.bigdata;

import com.golhero.golheroservice.application.command.MatchResultPredictionCmd;
import com.golhero.golheroservice.domain.model.MatchResultPredictionClient;
import org.apache.spark.sql.SparkSession;
import org.springframework.stereotype.Component;

@Component
public class MatchResultPredictionSparkClient implements MatchResultPredictionClient {

    private SparkSession sparkSession;

    public MatchResultPredictionSparkClient(SparkSession sparkSession) {
        this.sparkSession = sparkSession;
    }

    @Override
    public int predict(MatchResultPredictionCmd cmd) {

        sparkSession.

        return 0;
    }
}
