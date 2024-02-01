package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: a.pA */
/* loaded from: classes.dex */
public final class C2185pA extends View.BaseSavedState {
    public static final Parcelable.Creator<C2185pA> CREATOR = new C2327rm(4);

    /* renamed from: S */
    public int f6692S;

    public C2185pA(Parcel parcel) {
        super(parcel);
        this.f6692S = parcel.readInt();
    }

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f6692S + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f6692S);
    }
}
