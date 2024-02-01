package p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.S2 */
/* loaded from: classes.dex */
public final class C0962S2 implements Parcelable {
    public static final Parcelable.Creator<C0962S2> CREATOR = new C2327rm(21);

    /* renamed from: I */
    public final boolean f3269I;

    /* renamed from: R */
    public final int f3270R;

    /* renamed from: S */
    public final int f3271S;

    /* renamed from: q */
    public final boolean f3272q;

    /* renamed from: w */
    public final boolean f3273w;

    public C0962S2(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.f3271S = i;
        this.f3270R = i2;
        this.f3273w = z;
        this.f3269I = z2;
        this.f3272q = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3271S);
        parcel.writeInt(this.f3270R);
        parcel.writeInt(this.f3273w ? 1 : 0);
        parcel.writeInt(this.f3269I ? 1 : 0);
        parcel.writeInt(this.f3272q ? 1 : 0);
    }
}
