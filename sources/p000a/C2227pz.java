package p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.pz */
/* loaded from: classes.dex */
public final class C2227pz extends AbstractC2602x {
    public static final Parcelable.Creator<C2227pz> CREATOR = new C1260Xc(0);

    /* renamed from: w */
    public boolean f6849w;

    public C2227pz(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6849w = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f6849w + "}";
    }

    @Override // p000a.AbstractC2602x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8021S, i);
        parcel.writeValue(Boolean.valueOf(this.f6849w));
    }
}
