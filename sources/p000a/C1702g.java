package p000a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* renamed from: a.g */
/* loaded from: classes.dex */
public class C1702g extends AbstractC1593e {

    /* renamed from: S */
    public final byte[] f5330S;

    public C1702g(String str) {
        this.f5330S = AbstractC1878jN.m3497h(str);
        try {
            m3205U();
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: " + e.getMessage());
        }
    }

    /* renamed from: c */
    public static String m3201c(String str) {
        String str2;
        StringBuilder sb;
        char charAt;
        String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && '0' <= (charAt = substring.charAt(i)) && charAt <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            str2 = substring.substring(0, 4) + substring.substring(i);
            sb = new StringBuilder();
        } else if (i2 == 1) {
            str2 = substring.substring(0, i) + "00" + substring.substring(i);
            sb = new StringBuilder();
        } else {
            if (i2 != 2) {
                return str;
            }
            str2 = substring.substring(0, i) + "0" + substring.substring(i);
            sb = new StringBuilder();
        }
        sb.append(str.substring(0, 14));
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: s */
    public static String m3202s(int i) {
        if (i < 10) {
            return AbstractC2441tz.m4188N("0", i);
        }
        return Integer.toString(i);
    }

    /* renamed from: E */
    public final String m3203E() {
        String str;
        String m3499z = AbstractC1878jN.m3499z(this.f5330S);
        int i = 1;
        if (m3499z.charAt(m3499z.length() - 1) == 'Z') {
            return m3499z.substring(0, m3499z.length() - 1) + "GMT+00:00";
        }
        int length = m3499z.length() - 6;
        char charAt = m3499z.charAt(length);
        if ((charAt == '-' || charAt == '+') && m3499z.indexOf("GMT") == length - 3) {
            return m3499z;
        }
        int length2 = m3499z.length() - 5;
        char charAt2 = m3499z.charAt(length2);
        if (charAt2 != '-' && charAt2 != '+') {
            int length3 = m3499z.length() - 3;
            char charAt3 = m3499z.charAt(length3);
            if (charAt3 != '-' && charAt3 != '+') {
                StringBuilder sb = new StringBuilder();
                sb.append(m3499z);
                TimeZone timeZone = TimeZone.getDefault();
                int rawOffset = timeZone.getRawOffset();
                if (rawOffset >= 0) {
                    str = "+";
                } else {
                    rawOffset = -rawOffset;
                    str = "-";
                }
                int i2 = rawOffset / 3600000;
                int i3 = (rawOffset - (((i2 * 60) * 60) * 1000)) / 60000;
                try {
                    if (timeZone.useDaylightTime()) {
                        if (m3207f()) {
                            m3499z = m3201c(m3499z);
                        }
                        if (timeZone.inDaylightTime(m3209y().parse(m3499z + "GMT" + str + m3202s(i2) + ":" + m3202s(i3)))) {
                            if (!str.equals("+")) {
                                i = -1;
                            }
                            i2 += i;
                        }
                    }
                } catch (ParseException unused) {
                }
                sb.append("GMT" + str + m3202s(i2) + ":" + m3202s(i3));
                return sb.toString();
            }
            return m3499z.substring(0, length3) + "GMT" + m3499z.substring(length3) + ":00";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m3499z.substring(0, length2));
        sb2.append("GMT");
        int i4 = length2 + 3;
        sb2.append(m3499z.substring(length2, i4));
        sb2.append(":");
        sb2.append(m3499z.substring(i4));
        return sb2.toString();
    }

    /* renamed from: J */
    public final boolean m3204J(int i) {
        byte b;
        byte[] bArr = this.f5330S;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final boolean mo215R() {
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m336M(24, z, this.f5330S);
    }

    /* renamed from: U */
    public final Date m3205U() {
        SimpleDateFormat m3209y;
        String m3499z = AbstractC1878jN.m3499z(this.f5330S);
        if (m3499z.endsWith("Z")) {
            m3209y = m3207f() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'", AbstractC1396aC.f4399z) : m3206Y() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'", AbstractC1396aC.f4399z) : m3208r() ? new SimpleDateFormat("yyyyMMddHHmm'Z'", AbstractC1396aC.f4399z) : new SimpleDateFormat("yyyyMMddHH'Z'", AbstractC1396aC.f4399z);
            m3209y.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (m3499z.indexOf(45) > 0 || m3499z.indexOf(43) > 0) {
            m3499z = m3203E();
            m3209y = m3209y();
        } else {
            m3209y = m3207f() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : m3206Y() ? new SimpleDateFormat("yyyyMMddHHmmss") : m3208r() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            m3209y.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (m3207f()) {
            m3499z = m3201c(m3499z);
        }
        return m3209y.parse(m3499z);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof C1702g)) {
            return false;
        }
        return Arrays.equals(this.f5330S, ((C1702g) abstractC1593e).f5330S);
    }

    /* renamed from: Y */
    public final boolean m3206Y() {
        return m3204J(12) && m3204J(13);
    }

    /* renamed from: f */
    public final boolean m3207f() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f5330S;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    public final int hashCode() {
        return AbstractC0438II.m1023c(this.f5330S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: k */
    public AbstractC1593e mo149k() {
        return new C0862Q6(this.f5330S);
    }

    /* renamed from: r */
    public final boolean m3208r() {
        return m3204J(10) && m3204J(11);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public int mo151w(boolean z) {
        return C0175DP.m334Q(this.f5330S.length, z);
    }

    /* renamed from: y */
    public final SimpleDateFormat m3209y() {
        SimpleDateFormat simpleDateFormat = m3207f() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : m3206Y() ? new SimpleDateFormat("yyyyMMddHHmmssz") : m3208r() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    public C1702g(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.f5330S = bArr;
        if (!m3204J(0) || !m3204J(1) || !m3204J(2) || !m3204J(3)) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }
}
