package com.hrawat.paginglibrarysample.db;
/**
 * Created by hrawat on 11/16/2017.
 */

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
class User {

    @PrimaryKey
    private int id;
    private String name;
    private String lastName;
}
