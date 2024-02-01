package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p000a.C0593L6;
import p000a.C2327rm;
import p000a.InterfaceC1125V3;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C2327rm(9);

    /* renamed from: S */
    public final InterfaceC1125V3 f9157S;

    public ParcelImpl(Parcel parcel) {
        this.f9157S = new C0593L6(parcel).m3906o();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C0593L6(parcel).m3902G(this.f9157S);
    }
}
