package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: a.qH */
/* loaded from: classes.dex */
public final class C2243qH extends AbstractC2602x {
    public static final Parcelable.Creator<C2243qH> CREATOR = new C1260Xc(5);

    /* renamed from: I */
    public final int f6898I;

    /* renamed from: g */
    public final boolean f6899g;

    /* renamed from: k */
    public final boolean f6900k;

    /* renamed from: q */
    public final boolean f6901q;

    /* renamed from: w */
    public final int f6902w;

    public C2243qH(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6902w = parcel.readInt();
        this.f6898I = parcel.readInt();
        this.f6901q = parcel.readInt() == 1;
        this.f6900k = parcel.readInt() == 1;
        this.f6899g = parcel.readInt() == 1;
    }

    @Override // p000a.AbstractC2602x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8021S, i);
        parcel.writeInt(this.f6902w);
        parcel.writeInt(this.f6898I);
        parcel.writeInt(this.f6901q ? 1 : 0);
        parcel.writeInt(this.f6900k ? 1 : 0);
        parcel.writeInt(this.f6899g ? 1 : 0);
    }

    public C2243qH(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f6902w = bottomSheetBehavior.f9260i;
        this.f6898I = bottomSheetBehavior.f9239N;
        this.f6901q = bottomSheetBehavior.f9259h;
        this.f6900k = bottomSheetBehavior.f9270p;
        this.f6899g = bottomSheetBehavior.f9261j;
    }
}
