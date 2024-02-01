package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import com.topjohnwu.magisk.widget.ConcealableBottomNavigationView;

/* renamed from: a.I5 */
/* loaded from: classes.dex */
public final class C0427I5 extends AbstractC2602x {
    public static final Parcelable.Creator<C0427I5> CREATOR = new C2327rm(24);

    /* renamed from: w */
    public boolean f1405w;

    public C0427I5(C2576wX c2576wX) {
        super(c2576wX);
    }

    @Override // p000a.AbstractC2602x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8021S, i);
        parcel.writeByte(this.f1405w ? (byte) 1 : (byte) 0);
    }

    public C0427I5(Parcel parcel) {
        super(parcel, ConcealableBottomNavigationView.class.getClassLoader());
        this.f1405w = parcel.readByte() != 0;
    }
}
