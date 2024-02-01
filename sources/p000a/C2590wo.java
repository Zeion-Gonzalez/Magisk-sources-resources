package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: a.wo */
/* loaded from: classes.dex */
public final class C2590wo extends AbstractC2602x {
    public static final Parcelable.Creator<C2590wo> CREATOR = new C1260Xc(10);

    /* renamed from: w */
    public final int f7931w;

    public C2590wo(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7931w = parcel.readInt();
    }

    @Override // p000a.AbstractC2602x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8021S, i);
        parcel.writeInt(this.f7931w);
    }

    public C2590wo(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f7931w = sideSheetBehavior.f9407o;
    }
}
