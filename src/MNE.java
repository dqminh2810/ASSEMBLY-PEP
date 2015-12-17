import mne.Add;
import mne.Cmp;
import mne.Mne;

/**
 * PEP created on 17/12/2015 by Keynes Timothy - Aloysius_tim
 */
public enum MNE {
    ADD(Add.class),
    SUB("0001101"),
    AND("0100000000"),
    EOR("0100000001"),
    LSL("0100000010"),
    LSR("0100000011"),
    ASR("0100000100"),
    ADC("0100000101"),
    SBC("0100000110"),
    ROR("0100000111"),
    TST("0100001000"),
    CMP(Cmp.class),
    CMN("0100001011"),
    ORR("0100001100"),
    BIC("0100001110"),
    MVN("0100001111"),
    STR("0101000"),
    STRH("0101001"),
    STRB("0101010"),
    LDRSB("0101011"),
    LDR("0101100"),
    LDRH("0101101"),
    LDRB("0101110"),
    LDRSH("0101111");

    private String hex;
    MNE(String s) {
        hex=s;
    }

    private Class associatedClass;
    MNE(Class associatedClass) {
        this.associatedClass=associatedClass;
    }

    public String getHex() {
        return hex;
    }

    public Class getAssociatedClass() {
        return associatedClass;
    }
}
