package p000a;

/* renamed from: a.hS */
/* loaded from: classes.dex */
public abstract class AbstractC1779hS extends AbstractC1269Xn {
    /* renamed from: Ux */
    public static final String m3307Ux(int i, String str) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(0, i);
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4190Q("Requested character count ", i, " is less than zero.").toString());
    }
}
