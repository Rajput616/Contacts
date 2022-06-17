package com.example.contacts.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.contacts.db.entity.Contact;

@Database(entities = {Contact.class}, version = 1)
public abstract class ContactsAppDatabase extends RoomDatabase {

    // Linking the DAO with our Database
    public abstract ContactDAO getContactDAO();

}
