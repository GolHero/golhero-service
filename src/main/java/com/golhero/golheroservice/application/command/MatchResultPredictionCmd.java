package com.golhero.golheroservice.application.command;

import java.util.List;

public class MatchResultPredictionCmd {

    private int teamAId;

    private int teamBId;

    private List<Integer> teamAPlayers;

    private List<Integer> teamBPlayers;

    private long when;

    public MatchResultPredictionCmd(int teamAId,
                                    int teamBId,
                                    List<Integer> teamAPlayers,
                                    List<Integer> teamBPlayers,
                                    long when) {
        this.teamAId = teamAId;
        this.teamBId = teamBId;
        this.teamAPlayers = List.copyOf(teamAPlayers);
        this.teamBPlayers = List.copyOf(teamBPlayers);
        this.when = when;
    }

    public int getTeamAId() {
        return teamAId;
    }

    public void setTeamAId(int teamAId) {
        this.teamAId = teamAId;
    }

    public int getTeamBId() {
        return teamBId;
    }

    public void setTeamBId(int teamBId) {
        this.teamBId = teamBId;
    }

    public List<Integer> getTeamAPlayers() {
        return List.copyOf(teamAPlayers);
    }

    public void setTeamAPlayers(List<Integer> teamAPlayers) {
        this.teamAPlayers = List.copyOf(teamAPlayers);
    }

    public List<Integer> getTeamBPlayers() {
        return List.copyOf(teamBPlayers);
    }

    public void setTeamBPlayers(List<Integer> teamBPlayers) {
        this.teamBPlayers = List.copyOf(teamBPlayers);
    }

    public long getWhen() {
        return when;
    }

    public void setWhen(long when) {
        this.when = when;
    }
}
