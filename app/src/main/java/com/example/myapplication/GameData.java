package com.example.myapplication;

import java.util.ArrayList;

public class GameData {

    private static String[] title = new String[]{"Bubble Dragon","CrackDown 3","Dragon Keeper","Endless Truck","Fish Punch 2","Pool Ball"};

    private static int[] thumbnail = new
            int[]{R.drawable.bd, R.drawable.cdiii, R.drawable.dk,
            R.drawable.et, R.drawable.fpii, R.drawable.pb};

    public static ArrayList<GameModel> getListData() {
        GameModel gameModel;
        ArrayList<GameModel> list = new ArrayList<>();
        for (int i = 0; i < title.length; i++) {
            gameModel = new GameModel();
            gameModel.setLogoGame(thumbnail[i]);
            gameModel.setNamaGame(title[i]);
            list.add(gameModel);
        }
        return list;
    }
}
