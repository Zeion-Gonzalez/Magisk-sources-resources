package p000a;

import android.app.PendingIntent;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.topjohnwu.magisk.core.model.MagiskJson;

/* renamed from: a.xo */
/* loaded from: classes.dex */
public final class C2642xo extends AbstractC0164DB {
    public static final Parcelable.Creator<C2642xo> CREATOR = new C2327rm(17);

    /* renamed from: I */
    public InterfaceC1459bP f8235I;

    /* renamed from: R */
    public final int f8236R;

    /* renamed from: S */
    public final MagiskJson f8237S;

    /* renamed from: q */
    public Intent f8238q;

    /* renamed from: w */
    public final C1146VR f8239w;

    public C2642xo() {
        this(C1910jw.f5956P.f9587z, AbstractC0392HR.f1319h.incrementAndGet());
    }

    @Override // p000a.AbstractC0164DB
    /* renamed from: N */
    public final int mo33N() {
        return this.f8236R;
    }

    @Override // p000a.AbstractC0164DB
    /* renamed from: P */
    public final Uri mo34P() {
        return (Uri) this.f8239w.getValue();
    }

    @Override // p000a.AbstractC0164DB
    /* renamed from: Q */
    public final InterfaceC1459bP mo328Q() {
        return this.f8235I;
    }

    @Override // p000a.AbstractC0164DB
    /* renamed from: W */
    public final PendingIntent mo35W(ContextWrapper contextWrapper) {
        Intent intent = this.f8238q;
        if (intent != null) {
            return PendingIntent.getActivity(contextWrapper, this.f8236R, intent, 1140850688);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000a.AbstractC0164DB
    /* renamed from: o */
    public final String mo37o() {
        return this.f8237S.f9575w;
    }

    @Override // p000a.AbstractC0164DB
    /* renamed from: u */
    public final String mo38u() {
        MagiskJson magiskJson = this.f8237S;
        return "Magisk-" + magiskJson.f9574S + "(" + magiskJson.f9573R + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f8237S.writeToParcel(parcel, i);
        parcel.writeInt(this.f8236R);
    }

    public C2642xo(MagiskJson magiskJson, int i) {
        this.f8237S = magiskJson;
        this.f8236R = i;
        this.f8239w = new C1146VR(C0731Nj.f2468Y);
    }
}
