package com.bridgelabz.IndianStateCensusAnalyserProblem;

public class CensusAnalyserException extends Exception {

    public ExceptionType type;

    public CensusAnalyserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

    public enum ExceptionType {
        CENSUS_FILE_PROBLEM, WRONG_FILE_TYPE, WRONG_FILE_DELIMITER, WRONG_FILE_HEADER, CODE_FILE_PROBLEM
    }
}

