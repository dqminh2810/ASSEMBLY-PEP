import mne.*;

/**
 * PEP created on 17/12/2015 by Keynes Timothy - Aloysius_tim
 */
public enum MNE {
    ADD(ADD.class),
    SUB(Sub.class),
    AND(And.class),
    EOR(Eor.class),
    LSL(Lsl.class),
    LSR(Lsr.class),
    ASR(Asr.class),
    ADC(Adc.class),
    ROR(Ror.class),
    TST(TST.class),
    CMP(Cmp.class),
    CMN(CMN.class),
    ORR(ORR.class),
    BIC(BIC.class),
    MVN(MVN.class),
    STR(STR.class),
    STRH(STRH.class),
    STRB(STRB.class),
    LDRSB(LDRSB.class),
    LDR(LDR.class),
    LDRH(LDRH.class),
    LDRB(LDRB.class),
    LDRSH(LDRSH.class);

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
