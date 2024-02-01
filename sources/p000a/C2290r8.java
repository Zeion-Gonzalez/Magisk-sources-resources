package p000a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.r8 */
/* loaded from: classes.dex */
public final class C2290r8 extends AbstractC2602x {
    public static final Parcelable.Creator<C2290r8> CREATOR = new C1260Xc(11);

    /* renamed from: w */
    public final C2698yx f7074w;

    public C2290r8(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f7074w = new C2698yx(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f7074w.put(strArr[i], bundleArr[i]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f7074w + "}";
    }

    @Override // p000a.AbstractC2602x, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f8021S, i);
        C2698yx c2698yx = this.f7074w;
        int i2 = c2698yx.f8517w;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) c2698yx.m4626o(i3);
            bundleArr[i3] = (Bundle) c2698yx.m4620G(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public C2290r8(Parcelable parcelable) {
        super(parcelable);
        this.f7074w = new C2698yx();
    }
}
