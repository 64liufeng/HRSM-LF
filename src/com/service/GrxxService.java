package com.service;

import com.model.Grxx;

public interface GrxxService {
    Grxx listGrxx(Grxx grxx);
    boolean addGrxx(Grxx grxx);
    boolean updateGrxx(Grxx grxx);
}
