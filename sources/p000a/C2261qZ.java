package p000a;

import android.content.Context;

/* renamed from: a.qZ */
/* loaded from: classes.dex */
public final class C2261qZ implements InterfaceC0771ON {

    /* renamed from: I */
    public final C1146VR f6955I = new C1146VR(new C1407aQ(4, this));

    /* renamed from: R */
    public final String f6956R;

    /* renamed from: S */
    public final Context f6957S;

    /* renamed from: q */
    public boolean f6958q;

    /* renamed from: w */
    public final AbstractC1796hn f6959w;

    public C2261qZ(Context context, String str, AbstractC1796hn abstractC1796hn) {
        this.f6957S = context;
        this.f6956R = str;
        this.f6959w = abstractC1796hn;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.f6955I.f3728R != C1710g8.f5385y) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((C1231X0) this.f6955I.getValue()).close();
        }
    }

    @Override // p000a.InterfaceC0771ON
    /* renamed from: l */
    public final InterfaceC1136VG mo1790l() {
        return ((C1231X0) this.f6955I.getValue()).m2532z(true);
    }

    @Override // p000a.InterfaceC0771ON
    public final void setWriteAheadLoggingEnabled(boolean z) {
        boolean z2;
        if (this.f6955I.f3728R != C1710g8.f5385y) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            ((C1231X0) this.f6955I.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.f6958q = z;
    }
}
