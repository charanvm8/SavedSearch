package com.savedsearch.generic.model;

import org.springframework.hateoas.ResourceSupport;

public class SavedSearch extends ResourceSupport {
    private String searchId;
    private String searchName;

    public SavedSearch(String searchId,String searchName){
        this.searchId= searchId;
        this.searchName = searchName;
    }

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }
}
