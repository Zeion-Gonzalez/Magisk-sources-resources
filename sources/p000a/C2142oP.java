package p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.oP */
/* loaded from: classes.dex */
public final class C2142oP extends AbstractC2602x {
    public static final Parcelable.Creator<C2142oP> CREATOR = new C1260Xc(7);

    /* renamed from: w */
    public boolean f6592w;

    public C2142oP(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6592w = parcel.readInt() == 1;
    }

    @Override // p000a.AbstractC2602x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8021S, i);
        parcel.writeInt(this.f6592w ? 1 : 0);
    }
}
