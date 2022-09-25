package com.jaga.solveproblem.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TournamentWinner {

    public static void main(String[] args) {

        List<List<String>> competitions = new ArrayList<>();
        competitions.add(Arrays.asList("PYTHON", "JAVA"));
        competitions.add(Arrays.asList("JAVA", ".NET"));
        competitions.add(Arrays.asList(".NET", "PYTHON"));

        List<Integer> results = Arrays.asList(1,0,1);
        String tournamentWinner = tournamentWinner(competitions, results);
        System.out.println(tournamentWinner);

    }

    public static String tournamentWinner(
            List<List<String>> competitions, List<Integer> results) {

        HashMap<String, Integer> store = new HashMap<>();
        String highScoreTeam = null;

        for (int i = 0; i < competitions.size(); i++) {
            String winningTeam = competitions.get(i).get(results.get(i)==0?1:0);
            if(store.get(winningTeam)==null){
                store.put(winningTeam,3);
            } else {
                store.put(winningTeam,store.get(winningTeam)+3);
            }

            if(highScoreTeam==null) {
                highScoreTeam=winningTeam;
            }

            if(store.get(highScoreTeam) < store.get(winningTeam)) {
                highScoreTeam=winningTeam;
            }
        }


        return highScoreTeam;
    }
}
