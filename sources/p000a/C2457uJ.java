package p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.uJ */
/* loaded from: classes.dex */
public final class C2457uJ extends AbstractC2602x {
    public static final Parcelable.Creator<C2457uJ> CREATOR = new C1260Xc(1);

    /* renamed from: I */
    public boolean f7539I;

    /* renamed from: w */
    public int f7540w;

    public C2457uJ(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7540w = parcel.readInt();
        this.f7539I = parcel.readInt() != 0;
    }

    @Override // p000a.AbstractC2602x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8021S, i);
        parcel.writeInt(this.f7540w);
        parcel.writeInt(this.f7539I ? 1 : 0);
    }
}
