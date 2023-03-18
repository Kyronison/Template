package com.example.template;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<String> text = new MutableLiveData<>();

    public void setText(String newText) {
        text.setValue(newText);
    }
    public LiveData<String> getText() {
        return text;
    }
}
