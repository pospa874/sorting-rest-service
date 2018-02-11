package com.pospa.sortservice.controller;

import com.pospa.sortservice.dto.SortRequest;
import com.pospa.sortservice.dto.SortResponse;
import com.pospa.sortservice.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SortController {

    private final SortService sortService;

    @Autowired
    public SortController(SortService sortService) {
        this.sortService = sortService;
    }

    @RequestMapping(value = "/sort", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public SortResponse sort(@RequestBody final SortRequest request) {
        return new SortResponse(sortService.sort(request.getArray(), request.isDescending()));
    }
}
