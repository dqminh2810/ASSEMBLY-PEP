import mne.*;

/**
 * PEP created on 17/12/2015 by Keynes Timothy - Aloysius_tim
 */
public enum MNE {
    ADD(ADD.class),
    SUB(SUB.class),
    AND(AND.class),
    EOR(EOR.class),
    LSL(LSL.class),
    LSR(LSR.class),
    ASR(ASR.class),
    ADC(ADC.class),
    ROR(ROR.class),
    TST(TST.class),
    CMP(CMP.class),
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
