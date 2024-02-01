package p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.tN */
/* loaded from: classes.dex */
public final class C2408tN extends AbstractC2602x {
    public static final Parcelable.Creator<C2408tN> CREATOR = new C1260Xc(6);

    /* renamed from: w */
    public boolean f7353w;

    public C2408tN(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C2408tN.class.getClassLoader();
        }
        this.f7353w = parcel.readInt() == 1;
    }

    @Override // p000a.AbstractC2602x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8021S, i);
        parcel.writeInt(this.f7353w ? 1 : 0);
    }
}
