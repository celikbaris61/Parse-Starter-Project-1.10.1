package com.parse.starter;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by baris on 3.9.2015.
 */
public class ParseListActivity extends ListActivity {

    List<Pets> pets = new ArrayList<Pets>();

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parse_list);

        ParseQuery<Pets> query = new ParseQuery<Pets>("Pets");
        query.findInBackground(new FindCallback<Pets>() {
            @Override
            public void done(List<Pets> list, ParseException e) {
                if (e != null){
                    Toast.makeText(ParseListActivity.this, "Error " + e, Toast.LENGTH_SHORT ).show();
                }
                for (Pets pet : list){
                    Pets newPet = new Pets();
                    newPet.setName(pet.getName());
                    newPet.setType(pet.getType());
                    pets.add(newPet);
                    Log.i(pet.getName(),"dsad");
                }

                ArrayAdapter<Pets> adapter = new ArrayAdapter<Pets>(ParseListActivity.this, android.R.layout.simple_list_item_1, pets);
                setListAdapter(adapter);
            }
        });
    }
}



//    List<Pets> playerName  =  new ArrayList<Pets>();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.parse_list);
//
//
//
//
//        ParseQuery<Pets> query = new ParseQuery<Pets>("playerName");
//        query.findInBackground(new FindCallback<Pets>() {
//            @Override
//            public void done(List<Pets> Object, ParseException e) {
//
//                    Toast.makeText(ParseListActivity.this, "FORA Girmedi", Toast.LENGTH_LONG).show();
//                    for (Pets gameScore : Object) {
//                        Toast.makeText(ParseListActivity.this, "FORA Girdi", Toast.LENGTH_LONG).show();
//                        Pets newGameScore = new Pets();
//                        newGameScore.setPlayerName(gameScore.getPlayerName());
//                        playerName.add(newGameScore);
//
//                        Log.i(Object.get(0).getPlayerName(), "sda");
//
//
//                }
//
//                ArrayAdapter<Pets> adapter = new ArrayAdapter<Pets>(ParseListActivity.this,android.R.layout.simple_list_item_1,playerName);
//                setListAdapter(adapter);
//
//            }
//        });
//    }
//}
