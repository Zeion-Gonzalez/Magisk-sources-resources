package p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.NH */
/* loaded from: classes.dex */
public final class C0703NH implements Parcelable {
    public static final Parcelable.Creator<C0703NH> CREATOR = new C2327rm(6);

    /* renamed from: R */
    public int f2361R;

    /* renamed from: S */
    public int f2362S;

    /* renamed from: w */
    public boolean f2363w;

    public C0703NH(C0703NH c0703nh) {
        this.f2362S = c0703nh.f2362S;
        this.f2361R = c0703nh.f2361R;
        this.f2363w = c0703nh.f2363w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2362S);
        parcel.writeInt(this.f2361R);
        parcel.writeInt(this.f2363w ? 1 : 0);
    }

    public C0703NH(Parcel parcel) {
        this.f2362S = parcel.readInt();
        this.f2361R = parcel.readInt();
        this.f2363w = parcel.readInt() == 1;
    }
}
