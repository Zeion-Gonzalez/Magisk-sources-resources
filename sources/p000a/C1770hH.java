package p000a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: a.hH */
/* loaded from: classes.dex */
public final class C1770hH extends AbstractC1062Tx {
    @Override // p000a.AbstractC1062Tx
    /* renamed from: N */
    public final OutputStream mo2221N() {
        return new FileOutputStream((File) this, false);
    }

    @Override // p000a.AbstractC1062Tx
    /* renamed from: P */
    public final InputStream mo2222P() {
        return new FileInputStream(this);
    }

    @Override // p000a.AbstractC1062Tx
    /* renamed from: h */
    public final AbstractC1062Tx[] mo2223h(int i) {
        return new C1770hH[i];
    }

    @Override // p000a.AbstractC1062Tx
    /* renamed from: v */
    public final AbstractC1062Tx mo2224v(String str) {
        return new C1770hH(getPath(), str);
    }

    @Override // p000a.AbstractC1062Tx
    /* renamed from: z */
    public final AbstractC1062Tx mo2225z(String str) {
        return new C1770hH(str);
    }
}
