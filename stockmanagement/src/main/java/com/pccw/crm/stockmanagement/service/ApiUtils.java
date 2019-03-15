package com.pccw.crm.stockmanagement.service;

public interface ApiUtils {

    // Assign update object to update and source object as obj
    // http://stackoverflow.com/questions/6591665/merging-two-objects-in-java
    public void merge(Object obj, Object update);

}
