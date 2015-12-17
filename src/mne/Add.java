package mne;

/**
 * PEP created on 17/12/2015 by Keynes Timothy - Aloysius_tim
 */
public class Add implements Mne{
    private final String associatedMne="0001100";

    public Add() {
        super();
    }


    @Override
    public String parse(String mne, String opt) {
        return associatedMne;
    }
}
