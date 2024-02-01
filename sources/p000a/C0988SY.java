package p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.SY */
/* loaded from: classes.dex */
public final class C0988SY implements Parcelable {
    public static final Parcelable.Creator<C0988SY> CREATOR = new C2327rm(15);

    /* renamed from: R */
    public C0387HM f3330R;

    /* renamed from: S */
    public int f3331S;

    public C0988SY(Parcel parcel) {
        this.f3331S = parcel.readInt();
        this.f3330R = (C0387HM) parcel.readParcelable(C0988SY.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3331S);
        parcel.writeParcelable(this.f3330R, 0);
    }
}
