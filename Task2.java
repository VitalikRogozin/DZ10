package com.Geekbrains;
import java.util.*;


public class Task2 {
    public static void contactsDemo() {
        Phonebook contacts = new Phonebook();
        contacts.add("897755962517","Ivanov");
        contacts.add("345454897987","Petrov");
        contacts.add("465746215647","Sidorov");
        contacts.add("213187465857","Sarcasi");
        contacts.add("123484646874","Baiden");
        contacts.add("254652544138","Putin");

        contacts.get("Putin");
    }


}
