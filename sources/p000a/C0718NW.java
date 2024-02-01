package p000a;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;

/* renamed from: a.NW */
/* loaded from: classes.dex */
public final class C0718NW extends AbstractC1235X4 {

    /* renamed from: P */
    public final C1624eZ f2413P;

    /* renamed from: h */
    public final String[] f2414h;

    /* renamed from: v */
    public final Enum[] f2415v;

    /* renamed from: z */
    public final Class f2416z;

    public C0718NW(Class cls) {
        this.f2416z = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.f2415v = enumArr;
            this.f2414h = new String[enumArr.length];
            int i = 0;
            while (true) {
                Enum[] enumArr2 = this.f2415v;
                if (i < enumArr2.length) {
                    String name = enumArr2[i].name();
                    String[] strArr = this.f2414h;
                    Field field = cls.getField(name);
                    Set set = AbstractC1167Vq.f3801z;
                    InterfaceC1777hQ interfaceC1777hQ = (InterfaceC1777hQ) field.getAnnotation(InterfaceC1777hQ.class);
                    if (interfaceC1777hQ != null) {
                        String name2 = interfaceC1777hQ.name();
                        if (!"\u0000".equals(name2)) {
                            name = name2;
                        }
                    }
                    strArr[i] = name;
                    i++;
                } else {
                    this.f2413P = C1624eZ.m3078M(this.f2414h);
                    return;
                }
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e);
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.f2416z.getName() + ")";
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: v */
    public final void mo1114v(AbstractC2626xP abstractC2626xP, Object obj) {
        abstractC2626xP.mo3920U8(this.f2414h[((Enum) obj).ordinal()]);
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: z */
    public final Object mo1115z(AbstractC0932RY abstractC0932RY) {
        int i;
        C2326rl c2326rl = (C2326rl) abstractC0932RY;
        int i2 = c2326rl.f7162g;
        if (i2 == 0) {
            i2 = c2326rl.m3981G5();
        }
        if (i2 >= 8 && i2 <= 11) {
            C1624eZ c1624eZ = this.f2413P;
            if (i2 == 11) {
                i = c2326rl.m3984d2(c2326rl.f7161U, c1624eZ);
            } else {
                int mo1625Z = c2326rl.f7164q.mo1625Z((C2678ya) c1624eZ.f5015w);
                if (mo1625Z != -1) {
                    c2326rl.f7162g = 0;
                    int[] iArr = c2326rl.f3197I;
                    int i3 = c2326rl.f3199S - 1;
                    iArr[i3] = iArr[i3] + 1;
                    i = mo1625Z;
                } else {
                    String mo2089BO = c2326rl.mo2089BO();
                    int m3984d2 = c2326rl.m3984d2(mo2089BO, c1624eZ);
                    if (m3984d2 == -1) {
                        c2326rl.f7162g = 11;
                        c2326rl.f7161U = mo2089BO;
                        c2326rl.f3197I[c2326rl.f3199S - 1] = r1[r0] - 1;
                    }
                    i = m3984d2;
                }
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            return this.f2415v[i];
        }
        String m2101od = abstractC0932RY.m2101od();
        throw new C1237X6("Expected one of " + Arrays.asList(this.f2414h) + " but was " + abstractC0932RY.mo2089BO() + " at path " + m2101od);
    }
}
