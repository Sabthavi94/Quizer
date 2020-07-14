package com.example.quizer.data;

import com.example.quizer.model.Question;

import java.util.ArrayList;

public interface AnswrListAsyncResponse {
    void processFinished(ArrayList<Question> questionArrayList);
}
