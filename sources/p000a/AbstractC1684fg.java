package p000a;

/* renamed from: a.fg */
/* loaded from: classes.dex */
public abstract class AbstractC1684fg extends AbstractC0955Rw {
    /* renamed from: O4 */
    public static final Integer m3177O4(String str) {
        boolean z;
        int i;
        int i2;
        AbstractC1292YB.m2665V(10);
        int length = str.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str.charAt(0);
            int i4 = -2147483647;
            if (AbstractC1292YB.m2696w(charAt, 48) < 0) {
                i = 1;
                if (length != 1) {
                    if (charAt == '-') {
                        i4 = Integer.MIN_VALUE;
                        z = true;
                    } else if (charAt == '+') {
                        z = false;
                    }
                }
            } else {
                z = false;
                i = 0;
            }
            int i5 = -59652323;
            while (i < length) {
                int digit = Character.digit((int) str.charAt(i), 10);
                if (digit >= 0 && ((i3 >= i5 || (i5 == -59652323 && i3 >= (i5 = i4 / 10))) && (i2 = i3 * 10) >= i4 + digit)) {
                    i3 = i2 - digit;
                    i++;
                }
            }
            if (z) {
                return Integer.valueOf(i3);
            }
            return Integer.valueOf(-i3);
        }
        return null;
    }
}
