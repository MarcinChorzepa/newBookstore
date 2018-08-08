package com.newbookstore.newbookstore;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    public int calculateValue(int value) {
        return value * 2 + 4;
    }
}
