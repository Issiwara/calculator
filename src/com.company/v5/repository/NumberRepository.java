package com.company.v5.repository;

import java.io.IOException;

public interface NumberRepository {

    Double[] getNumbers() throws IOException;  //will change this throws part in the future

}