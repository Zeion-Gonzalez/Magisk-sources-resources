package p000a;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.nd */
/* loaded from: classes.dex */
public final class C2103nd implements InterfaceC2711zB {
    public static final Parcelable.Creator<C2103nd> CREATOR = new C2327rm(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000a.InterfaceC2711zB
    /* renamed from: v */
    public final void mo2260v() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    @Override // p000a.InterfaceC1468bb
    /* renamed from: z */
    public final void mo2259h(Uri uri) {
        C2744zq.f8599f.mo2290G(uri);
    }
}
