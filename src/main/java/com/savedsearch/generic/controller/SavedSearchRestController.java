package com.savedsearch.generic.controller;

import com.savedsearch.generic.model.SavedSearch;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class SavedSearchRestController {

    @RequestMapping(value = "getSavedSearches", method = RequestMethod.POST)
    public ResponseEntity<?> getSavedSearches(@RequestHeader(value = "Auth-Token") String userToken){
        List<SavedSearch> userList = Arrays.asList(new SavedSearch("1","savedSearch1"));
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @RequestMapping("helloworld")
    public String helloWorld(){
        return "HelloWorld";
    }

}
