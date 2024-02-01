package p000a;

import java.net.Proxy;

/* renamed from: a.Ic */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0454Ic {

    /* renamed from: z */
    public static final /* synthetic */ int[] f1525z;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        try {
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f1525z = iArr;
    }
}
