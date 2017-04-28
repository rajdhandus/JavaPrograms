package com.raj;

import java.util.List;

/**
 * Created by rajkumarpurushothaman on 4/27/17.
 */
public interface ISaveable {
    public List<String> saveToSaveable();
    public void readFromSaveable(List<String> values);
}
