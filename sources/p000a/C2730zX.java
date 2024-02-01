package p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.zX */
/* loaded from: classes.dex */
public final class C2730zX implements Parcelable {
    public static final Parcelable.Creator<C2730zX> CREATOR = new C0773OP(2);

    /* renamed from: R */
    public final int f8575R;

    /* renamed from: S */
    public final String f8576S;

    public C2730zX(Parcel parcel) {
        this.f8576S = parcel.readString();
        this.f8575R = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8576S);
        parcel.writeInt(this.f8575R);
    }
}
