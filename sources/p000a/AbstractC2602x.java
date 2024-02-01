package p000a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.x */
/* loaded from: classes.dex */
public abstract class AbstractC2602x implements Parcelable {

    /* renamed from: S */
    public final Parcelable f8021S;

    /* renamed from: R */
    public static final C2071n f8020R = new C2071n();
    public static final Parcelable.Creator<AbstractC2602x> CREATOR = new C1260Xc(3);

    public AbstractC2602x() {
        this.f8021S = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8021S, i);
    }

    public AbstractC2602x(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f8021S = readParcelable == null ? f8020R : readParcelable;
    }

    public AbstractC2602x(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f8021S = parcelable == f8020R ? null : parcelable;
    }
}
