package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: a.fY */
/* loaded from: classes.dex */
public final class C1679fY extends View.BaseSavedState {
    public static final Parcelable.Creator<C1679fY> CREATOR = new C2327rm(3);

    /* renamed from: S */
    public boolean f5266S;

    public C1679fY(Parcel parcel) {
        super(parcel);
        this.f5266S = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f5266S ? (byte) 1 : (byte) 0);
    }
}
