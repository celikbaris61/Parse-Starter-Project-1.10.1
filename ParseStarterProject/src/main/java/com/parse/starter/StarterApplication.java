/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class StarterApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Pets.class);
        Parse.initialize(this, "EgrE0wyTnGtxKqSPSNMygYb9SdIr2e0HTjDNGx6t", "l2535CTRluCoJGJQ31gFzTkfn9CgIrFZ6Cruyx5y");
//        Parse.enableLocalDatastore(this);
//        ParseUser.enableAutomaticUser();
//        ParseACL defaultACL = new ParseACL();
//        // Optionally enable public read access.
//        // defaultACL.setPublicReadAccess(true);
//        ParseACL.setDefaultACL(defaultACL, true);

    }
}
