package com.andela.bookclub.operations;

import com.andela.bookclub.models.Model;

import java.util.ArrayList;
import java.util.List;

public class LibraryStorage<T extends Model> {

    private List<T> items;

    public LibraryStorage() {
        this.items = new ArrayList<>();
    }

    public boolean addItem(T item) {
        return false;
    }

    public boolean addItemCollection(List<T> incomingItems) {
        return false;
    }

    public List<T> getAllItems() {
        return null;
    }

    public T getItemByUniqueId(String uniquePropertyName, String uniquePropertyValue) {
        return null;
    }

    private int searchItemByUniqueId(String uniquePropertyName, String uniquePropertyValue) {
        return -1;
    }

    public boolean updateItemDetails(String uniquePropertyName, String uniquePropertyValue, T incomingItem) {
        return false;
    }

    public boolean deleteItem(String uniquePropertyName, String uniquePropertyValue) {
        return false;
    }
}
