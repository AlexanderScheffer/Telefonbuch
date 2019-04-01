package data;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.collections.transformation.FilteredList;

import java.util.ArrayList;
import java.util.List;
import sample.TelefonEntry;

public class TelefonBook {

    private  final ObservableList<TelefonEntry> observableList=
            FXCollections.observableList((new ArrayList<>()));

    public  TelefonBook(){

        observableList.add(new TelefonEntry("Phillip", "Heidegger", "1234"));
        observableList.add(new TelefonEntry("Oliver", "John", "4567"));

    }

    public ObservableList<TelefonEntry>getNumbers() {return observableList;}
}
