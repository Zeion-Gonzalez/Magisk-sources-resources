package p000a;

/* renamed from: a.jQ */
/* loaded from: classes.dex */
public final class C1880jQ {
    /* renamed from: z */
    public static String m3500z(InterfaceC0225EG interfaceC0225EG) {
        String obj = interfaceC0225EG.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
