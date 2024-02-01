package p000a;

import java.nio.ByteOrder;

/* renamed from: a.Ou */
/* loaded from: classes.dex */
public abstract class EnumC0798Ou {

    /* renamed from: S */
    public static final ByteOrder f2724S = ByteOrder.nativeOrder();

    static {
        String property = System.getProperty("os.arch");
        if (property.equals("i386") || property.equals("x86") || property.equals("amd64") || property.equals("x86_64") || property.equals("aarch64")) {
            return;
        }
        property.equals("ppc64le");
    }
}
