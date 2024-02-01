package p000a;

/* renamed from: a.SE */
/* loaded from: classes.dex */
public final class C0971SE extends C1028TI {

    /* renamed from: R */
    public final Class f3287R;

    public C0971SE(Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.f3287R = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // p000a.C1028TI, p000a.AbstractC0929RT
    /* renamed from: h */
    public final String mo1954h() {
        return this.f3287R.getName();
    }

    @Override // p000a.C1028TI, p000a.AbstractC0929RT
    /* renamed from: u */
    public final Enum mo1955v(String str) {
        Enum r4;
        Class cls = this.f3287R;
        Object[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r4 = null;
                break;
            }
            r4 = enumConstants[i];
            if (AbstractC1269Xn.m2594yF(((Enum) r4).name(), str)) {
                break;
            }
            i++;
        }
        Enum r42 = r4;
        if (r42 != null) {
            return r42;
        }
        throw new IllegalArgumentException("Enum value " + str + " not found for type " + cls.getName() + '.');
    }
}
