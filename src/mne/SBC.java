package mne;

/**
 * ASSEMBLY-PEP created on 17/12/2015 by Keynes Timothy - Aloysius_tim
 */
public class SBC extends Mne{
    private final String associatedMne="0100000110";

    @Override
    public String parse(String mne, String opt) {
        String finalHex=associatedMne;

        finalHex=finalHex+this.parseOpts(opt);

        return finalHex;
    }
}
