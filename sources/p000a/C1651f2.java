package p000a;

import java.io.File;
import java.util.Iterator;

/* renamed from: a.f2 */
/* loaded from: classes.dex */
public final class C1651f2 implements InterfaceC2296rE {

    /* renamed from: h */
    public final EnumC1784hY f5119h;

    /* renamed from: z */
    public final File f5120z;

    public C1651f2(File file) {
        EnumC1784hY enumC1784hY = EnumC1784hY.f5605S;
        this.f5120z = file;
        this.f5119h = enumC1784hY;
    }

    @Override // p000a.InterfaceC2296rE
    public final Iterator iterator() {
        return new C2697yw(this);
    }
}
