package com.patternObsTest;

/**
 * Created by Pratik Ambani on 08/03/17.
 */
public interface Jsubject {

    void attach(Jobservers[] obs);

    void detach(int obs);

    void noty();
}
