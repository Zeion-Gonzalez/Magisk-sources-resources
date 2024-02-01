package p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.Yi */
/* loaded from: classes.dex */
public final class C1318Yi implements Parcelable {
    public static final Parcelable.Creator<C1318Yi> CREATOR = new C2327rm(2);

    /* renamed from: S */
    public int f4180S;

    public C1318Yi(Parcel parcel) {
        this.f4180S = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4180S);
    }
}
