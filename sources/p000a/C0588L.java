package p000a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/* renamed from: a.L */
/* loaded from: classes.dex */
public class C0588L extends AbstractC1593e {

    /* renamed from: S */
    public final byte[] f1904S;

    public C0588L(String str) {
        this.f1904S = AbstractC1878jN.m3497h(str);
        try {
            new SimpleDateFormat("yyMMddHHmmssz", AbstractC1396aC.f4399z).parse(m1316y());
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: " + e.getMessage());
        }
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final boolean mo215R() {
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m336M(23, z, this.f1904S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (!(abstractC1593e instanceof C0588L)) {
            return false;
        }
        return Arrays.equals(this.f1904S, ((C0588L) abstractC1593e).f1904S);
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    public final int hashCode() {
        return AbstractC0438II.m1023c(this.f1904S);
    }

    public final String toString() {
        return AbstractC1878jN.m3499z(this.f1904S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(this.f1904S.length, z);
    }

    /* renamed from: y */
    public final String m1316y() {
        StringBuilder sb;
        String substring;
        String m3499z = AbstractC1878jN.m3499z(this.f1904S);
        if (m3499z.indexOf(45) >= 0 || m3499z.indexOf(43) >= 0) {
            int indexOf = m3499z.indexOf(45);
            if (indexOf < 0) {
                indexOf = m3499z.indexOf(43);
            }
            if (indexOf == m3499z.length() - 3) {
                m3499z = m3499z.concat("00");
            }
            if (indexOf == 10) {
                sb = new StringBuilder();
                sb.append(m3499z.substring(0, 10));
                sb.append("00GMT");
                sb.append(m3499z.substring(10, 13));
                sb.append(":");
                substring = m3499z.substring(13, 15);
            } else {
                sb = new StringBuilder();
                sb.append(m3499z.substring(0, 12));
                sb.append("GMT");
                sb.append(m3499z.substring(12, 15));
                sb.append(":");
                substring = m3499z.substring(15, 17);
            }
        } else if (m3499z.length() == 11) {
            sb = new StringBuilder();
            sb.append(m3499z.substring(0, 10));
            substring = "00GMT+00:00";
        } else {
            sb = new StringBuilder();
            sb.append(m3499z.substring(0, 12));
            substring = "GMT+00:00";
        }
        sb.append(substring);
        return sb.toString();
    }

    public C0588L(byte[] bArr) {
        byte b;
        byte b2;
        if (bArr.length < 2) {
            throw new IllegalArgumentException("UTCTime string too short");
        }
        this.f1904S = bArr;
        if (bArr.length > 0 && (b2 = bArr[0]) >= 48 && b2 <= 57) {
            if (bArr.length > 1 && (b = bArr[1]) >= 48 && b <= 57) {
                return;
            }
        }
        throw new IllegalArgumentException("illegal characters in UTCTime string");
    }
}
