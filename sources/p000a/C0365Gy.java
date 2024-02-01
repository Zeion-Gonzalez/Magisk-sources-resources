package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: a.Gy */
/* loaded from: classes.dex */
public final class C0365Gy extends View.BaseSavedState {
    public static final Parcelable.Creator<C0365Gy> CREATOR = new C2327rm(26);

    /* renamed from: S */
    public boolean f1266S;

    public C0365Gy(C1053Tj c1053Tj) {
        super(c1053Tj);
    }

    public final String toString() {
        return "IndetermSavedState.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " indeterminate=" + this.f1266S + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1266S ? 1 : 0);
    }

    public C0365Gy(Parcel parcel) {
        super(parcel);
        this.f1266S = parcel.readInt() != 0;
    }
}
