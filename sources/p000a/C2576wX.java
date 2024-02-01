package p000a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.wX */
/* loaded from: classes.dex */
public final class C2576wX extends AbstractC2602x {
    public static final Parcelable.Creator<C2576wX> CREATOR = new C1260Xc(9);

    /* renamed from: w */
    public Bundle f7896w;

    public C2576wX(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7896w = parcel.readBundle(classLoader == null ? C2576wX.class.getClassLoader() : classLoader);
    }

    @Override // p000a.AbstractC2602x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8021S, i);
        parcel.writeBundle(this.f7896w);
    }
}
