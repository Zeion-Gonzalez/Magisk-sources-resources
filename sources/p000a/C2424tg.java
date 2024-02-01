package p000a;

import java.math.BigDecimal;

/* renamed from: a.tg */
/* loaded from: classes.dex */
public final class C2424tg extends AbstractC1235X4 {

    /* renamed from: z */
    public final /* synthetic */ int f7425z;

    public /* synthetic */ C2424tg(int i) {
        this.f7425z = i;
    }

    public final String toString() {
        switch (this.f7425z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: v */
    public final void mo1114v(AbstractC2626xP abstractC2626xP, Object obj) {
        String str;
        switch (this.f7425z) {
            case AbstractC0795Op.f2698E /* 0 */:
                abstractC2626xP.mo3920U8((String) obj);
                return;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C2279qw c2279qw = (C2279qw) abstractC2626xP;
                if (!c2279qw.f8146q) {
                    c2279qw.m3919Lq();
                    c2279qw.m3917BO();
                    if (booleanValue) {
                        str = "true";
                    } else {
                        str = "false";
                    }
                    c2279qw.f7010g.mo938K(str);
                    int[] iArr = c2279qw.f8142I;
                    int i = c2279qw.f8144S - 1;
                    iArr[i] = iArr[i] + 1;
                    return;
                }
                throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + c2279qw.m4524od());
            case 2:
                abstractC2626xP.mo3925x(((Byte) obj).intValue() & 255);
                return;
            case 3:
                abstractC2626xP.mo3920U8(((Character) obj).toString());
                return;
            case 4:
                double doubleValue = ((Double) obj).doubleValue();
                C2279qw c2279qw2 = (C2279qw) abstractC2626xP;
                c2279qw2.getClass();
                if (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue)) {
                    if (c2279qw2.f8146q) {
                        c2279qw2.f8146q = false;
                        c2279qw2.mo3921V(Double.toString(doubleValue));
                        return;
                    }
                    c2279qw2.m3919Lq();
                    c2279qw2.m3917BO();
                    c2279qw2.f7010g.mo938K(Double.toString(doubleValue));
                    int[] iArr2 = c2279qw2.f8142I;
                    int i2 = c2279qw2.f8144S - 1;
                    iArr2[i2] = iArr2[i2] + 1;
                    return;
                }
                throw new IllegalArgumentException("Numeric values must be finite, but was " + doubleValue);
            case 5:
                Float f = (Float) obj;
                f.getClass();
                C2279qw c2279qw3 = (C2279qw) abstractC2626xP;
                c2279qw3.getClass();
                String obj2 = f.toString();
                c2279qw3.getClass();
                if (!obj2.equals("-Infinity") && !obj2.equals("Infinity") && !obj2.equals("NaN")) {
                    if (c2279qw3.f8146q) {
                        c2279qw3.f8146q = false;
                        c2279qw3.mo3921V(obj2);
                        return;
                    }
                    c2279qw3.m3919Lq();
                    c2279qw3.m3917BO();
                    c2279qw3.f7010g.mo938K(obj2);
                    int[] iArr3 = c2279qw3.f8142I;
                    int i3 = c2279qw3.f8144S - 1;
                    iArr3[i3] = iArr3[i3] + 1;
                    return;
                }
                throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
            case 6:
                abstractC2626xP.mo3925x(((Integer) obj).intValue());
                return;
            case 7:
                abstractC2626xP.mo3925x(((Long) obj).longValue());
                return;
            default:
                abstractC2626xP.mo3925x(((Short) obj).intValue());
                return;
        }
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: z */
    public final Object mo1115z(AbstractC0932RY abstractC0932RY) {
        C1623eY c1623eY;
        long j;
        boolean z = false;
        switch (this.f7425z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return abstractC0932RY.mo2089BO();
            case 1:
                C2326rl c2326rl = (C2326rl) abstractC0932RY;
                int i = c2326rl.f7162g;
                if (i == 0) {
                    i = c2326rl.m3981G5();
                }
                if (i == 5) {
                    c2326rl.f7162g = 0;
                    int[] iArr = c2326rl.f3197I;
                    int i2 = c2326rl.f3199S - 1;
                    iArr[i2] = iArr[i2] + 1;
                    z = true;
                } else if (i == 6) {
                    c2326rl.f7162g = 0;
                    int[] iArr2 = c2326rl.f3197I;
                    int i3 = c2326rl.f3199S - 1;
                    iArr2[i3] = iArr2[i3] + 1;
                } else {
                    throw new C1237X6("Expected a boolean but was " + AbstractC2441tz.m4197f(c2326rl.mo2100he()) + " at path " + c2326rl.m2101od());
                }
                return Boolean.valueOf(z);
            case 2:
                return Byte.valueOf((byte) AbstractC0795Op.m1813HL(abstractC0932RY, "a byte", -128, 255));
            case 3:
                String mo2089BO = abstractC0932RY.mo2089BO();
                if (mo2089BO.length() <= 1) {
                    return Character.valueOf(mo2089BO.charAt(0));
                }
                throw new C1237X6(String.format("Expected %s but was %s at path %s", "a char", "\"" + mo2089BO + '\"', abstractC0932RY.m2101od()));
            case 4:
                return Double.valueOf(abstractC0932RY.mo2090C());
            case 5:
                float mo2090C = (float) abstractC0932RY.mo2090C();
                abstractC0932RY.getClass();
                if (!Float.isInfinite(mo2090C)) {
                    return Float.valueOf(mo2090C);
                }
                throw new C1237X6("JSON forbids NaN and infinities: " + mo2090C + " at path " + abstractC0932RY.m2101od());
            case 6:
                return Integer.valueOf(abstractC0932RY.mo2102x());
            case 7:
                C2326rl c2326rl2 = (C2326rl) abstractC0932RY;
                int i4 = c2326rl2.f7162g;
                if (i4 == 0) {
                    i4 = c2326rl2.m3981G5();
                }
                if (i4 == 16) {
                    c2326rl2.f7162g = 0;
                    int[] iArr3 = c2326rl2.f3197I;
                    int i5 = c2326rl2.f3199S - 1;
                    iArr3[i5] = iArr3[i5] + 1;
                    j = c2326rl2.f7166y;
                } else {
                    if (i4 == 17) {
                        c2326rl2.f7161U = c2326rl2.f7163k.m4072G5(c2326rl2.f7165s);
                    } else if (i4 != 9 && i4 != 8) {
                        if (i4 != 11) {
                            throw new C1237X6("Expected a long but was " + AbstractC2441tz.m4197f(c2326rl2.mo2100he()) + " at path " + c2326rl2.m2101od());
                        }
                    } else {
                        if (i4 == 9) {
                            c1623eY = C2326rl.f7159f;
                        } else {
                            c1623eY = C2326rl.f7156E;
                        }
                        String m3985d3 = c2326rl2.m3985d3(c1623eY);
                        c2326rl2.f7161U = m3985d3;
                        try {
                            long parseLong = Long.parseLong(m3985d3);
                            c2326rl2.f7162g = 0;
                            int[] iArr4 = c2326rl2.f3197I;
                            int i6 = c2326rl2.f3199S - 1;
                            iArr4[i6] = iArr4[i6] + 1;
                            j = parseLong;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    c2326rl2.f7162g = 11;
                    try {
                        j = new BigDecimal(c2326rl2.f7161U).longValueExact();
                        c2326rl2.f7161U = null;
                        c2326rl2.f7162g = 0;
                        int[] iArr5 = c2326rl2.f3197I;
                        int i7 = c2326rl2.f3199S - 1;
                        iArr5[i7] = iArr5[i7] + 1;
                    } catch (ArithmeticException | NumberFormatException unused2) {
                        throw new C1237X6("Expected a long but was " + c2326rl2.f7161U + " at path " + c2326rl2.m2101od());
                    }
                }
                return Long.valueOf(j);
            default:
                return Short.valueOf((short) AbstractC0795Op.m1813HL(abstractC0932RY, "a short", -32768, 32767));
        }
    }
}
