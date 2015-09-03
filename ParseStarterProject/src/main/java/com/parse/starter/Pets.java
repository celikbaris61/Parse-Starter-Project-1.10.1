package com.parse.starter;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by rufflez on 8/31/14.
 */
@ParseClassName("Pets")
public class Pets extends ParseObject {

    public String getName(){
        return getString("Name");
    }

    public void setName(String name){
        put("Name", name);
    }

    public String getType(){
        return getString("Type");
    }

    public void setType(String type){
        put("Type", type);
    }

    @Override
    public String toString(){
        return getString("Name") + "\n" + getString("Type");
    }
}